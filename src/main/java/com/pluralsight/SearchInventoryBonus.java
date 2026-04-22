package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SearchInventoryBonus {
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
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/resources/inventory.csv"));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] values = line.split("//|");
                Product product = new Product(Integer.parseInt(values[0]), values[1], Float.parseFloat(values[2]));

            }




        }catch (IOException e) {
            e.printStackTrace();
        }




        return null;
    }
}
