package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();

        // Assets
        House mainHouse = new House("My House", "2012", 250000,
                "123 Smith St", 2, 2000, 10000);
        House vacationHome = new House("Vacation Home", "2015", 300000,
                "456 Beach Dr", 1, 1800, 8000);

        Vehicle car1 = new Vehicle("Tom's Truck", "2018", 35000,
                "Ford F-150", 2018, 85000);
        Vehicle car2 = new Vehicle("My Car", "2020", 28000,
                "Toyota Camry", 2020, 120000);

        // Add to ArrayList
        assets.add(mainHouse);
        assets.add(vacationHome);
        assets.add(car1);
        assets.add(car2);

        // Display information
        for (Asset a : assets) {
            System.out.println("-------------------------------------");
            System.out.println("Description: " + a.getDescription());
            System.out.println("Date Acquired: " + a.getDateAcquired());
            System.out.println("Original Cost: $" + a.getOriginalCost());
            System.out.println("Current Value: $" + a.getValue());

            if (a instanceof House) {
                House h = (House) a;
                System.out.println("Address: " + h.getAddress());
            } else if (a instanceof Vehicle) {
                Vehicle v = (Vehicle) a;
                System.out.println("Year/Make/Model: " + v.getYear() + " " + v.getMakeModel());
                System.out.println("Odometer: " + v.getOdometer() + " miles");
            }
        }
    }
}
