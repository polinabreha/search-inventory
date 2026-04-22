package com.pluralsight;
import java.util.ArrayList;

public class SearchInventory {
    public static void main(String[] args) {

        ArrayList<Product> inventory = getInventory();
        System.out.println("We carry the following inventory: ");
        for (int i = 0; i < inventory.size(); i++) {
            Product p = inventory.get(i);
            System.out.printf("id: %d %s - Price: $%.2f%n",
                    p.getId(), p.getName(), p.getPrice());
        }
    }


     public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<Product>();
        inventory.add(new Product(78901,"bag of cement" ,32));
        inventory.add(new Product(44213,"steel beam" ,210));
        inventory.add(new Product(56789,"paint roller set" ,18));
        inventory.add(new Product(33102,"copper pipe (10ft)" ,27));
        inventory.add(new Product(91547,"safety helmet" ,14));


        return inventory;
    }
}
