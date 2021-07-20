package ca.bcit.winter2021.comp2522.midterm.question9;

import java.util.ArrayList;

public class Invoice {
    ArrayList<Item> items;

    Invoice(ArrayList<Item> items){
        this.items = items;
    }

    double calculateTotalInvoicePrice(){
        double totalPrice = 0;
        totalPrice = totalPrice + items.stream()
                .mapToInt(w -> w.getTotalPrice())
                .sum();
        return totalPrice;
    }
}

public class EngineeringItem implements Item {
    private int price;
    private int quantity;

    public EngineeringItem(int price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    public int getTotalPrice() {
        return (int) ((this.price * this.quantity) + (this.price * this.quantity) * 0.5);
    }
}

public class ProductItem implements Item {
    private int price;
    private int quantity;

    public ProductItem(int price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    public int getTotalPrice() {
        return (this.price * this.quantity) + 100;
    }
}

public class InventoryItem implements Item {
    private int price;
    private int quantity;

    public InventoryItem(int price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    public int getTotalPrice() {
        return (int) ((this.price * this.quantity) + (this.quantity * 10);
    }
}

public interface Item {
    public Item(int price, int quantity);
    public int getTotalPrice();
}