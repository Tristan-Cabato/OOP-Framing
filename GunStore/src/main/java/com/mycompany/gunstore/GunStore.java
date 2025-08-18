package com.mycompany.gunstore;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GunStore {

    public static void main(String[] args) {
        Backend run = new Backend();
        
        try {
            // Read animals
            Scanner animalScanner = new Scanner(new File("src/main/resources/animals.txt"));
            while (animalScanner.hasNextLine()) {
                String[] parts = animalScanner.nextLine().split(", ");
                if (parts.length >= 4) {
                    String type = parts[0].trim();
                    String name = parts[1].trim();
                    String breed = parts[2].trim();
                    int currency = Integer.parseInt(parts[3].trim());
                    run.PlayerAdd(type, name, breed, currency);
                }
            }
            animalScanner.close();
            
            // Read guns
            Scanner gunScanner = new Scanner(new File("src/main/resources/guns.txt"));
            while (gunScanner.hasNextLine()) {
                String[] parts = gunScanner.nextLine().split(", ");
                if (parts.length >= 3) {
                    String name = parts[0].trim();
                    String type = parts[1].trim();
                    int price = Integer.parseInt(parts[2].trim());
                    run.GunAdd(name, type, price);
                }
            }
            gunScanner.close();
            
        } catch (FileNotFoundException e) {
            System.err.println("Error loading data files: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
