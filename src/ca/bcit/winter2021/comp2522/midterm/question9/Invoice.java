package ca.bcit.winter2021.comp2522.midterm.question9;

import java.util.ArrayList;

public class Invoice {
    ArrayList<Item> engineeringInvoice;
    ArrayList<Item> productInvoice;
    ArrayList<Item> inventoryInvoice;

    Invoice(ArrayList<Item> engineeringInvoice, ArrayList<Item> productInvoice, ArrayList<Item> inventoryInvoice){
        this.engineeringInvoice = engineeringInvoice;
        this.productInvoice = productInvoice;
        this.inventoryInvoice = inventoryInvoice;
    }

    double calculateTotalInvoicePrice(){
        double totalPrice = 0;
        totalPrice = totalPrice + engineeringInvoice.stream()
                .mapToInt(w -> w.getTotalPrice())
                .sum();
        totalPrice = totalPrice + productInvoice.stream()
                .mapToInt(w -> w.getTotalPrice())
                .sum();
        totalPrice = totalPrice + inventoryInvoice.stream().
                mapToInt(w -> w.getTotalPrice())
                .sum();
        return totalPrice;
    }
}

public class Item {
    private int price;
    private int quantity;
    private String department;

    public Item(int price, int quantity, String department) {
        this.price = price;
        this.quantity = quantity;
    }

    public int getTotalPrice() {
        if (department == "engineering") {
            return (int) ((this.price * this.quantity) + (this.price * this.quantity) * 0.5);
        } else if (department == "product") {
            return (this.price * this.quantity) + 100;
        } else {  //inventory
            return (int) ((this.price * this.quantity) + (this.quantity * 10);
        }
    }
}
