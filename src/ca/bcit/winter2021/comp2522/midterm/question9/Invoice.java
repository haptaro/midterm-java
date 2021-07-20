package ca.bcit.winter2021.comp2522.midterm.question9;

import java.util.ArrayList;

public class Invoice {
    ArrayList<Item> engineeringInvoices;
    ArrayList<Item> productInvoices;
    ArrayList<Item> inventoryInvoices;

    Invoice(ArrayList<Item> engineeringInvoices, ArrayList<Item> productInvoices, ArrayList<Item> inventoryInvoices){
        this.engineeringInvoices = engineeringInvoices;
        this.productInvoices = productInvoices;
        this.inventoryInvoices = inventoryInvoices;
    }

    double calculateTotalInvoicePrice(){
        double totalPrice = 0;
        totalPrice = totalPrice + engineeringInvoices.stream()
                .mapToInt(w -> w.getTotalPrice())
                .sum();
        totalPrice = totalPrice + productInvoices.stream()
                .mapToInt(w -> w.getTotalPrice())
                .sum();
        totalPrice = totalPrice + inventoryInvoices.stream().
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
