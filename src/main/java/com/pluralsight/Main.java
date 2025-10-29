package com.pluralsight;

import java.util.ArrayList;

public class Main {
        public static void main(String[] args) {


            ArrayList<Asset> assets = new ArrayList<>();

            Asset jewel = new Asset("Diamond", "June", 10000);

            House h = new House("Main House", "2007", 220000, "123 Smith St", 2, 2500, 10000);

            assets.add(jewel);
            assets.add(h);


            for( Asset a : assets){
                System.out.println("------------------------------------");
                System.out.println("Description: " + a.getDescription());
                System.out.println("Date Acquired: " + a.getDateAcquired());
                System.out.println("Original Cost: " + a.getOriginalCost());
                System.out.println("Current Value: " + a.getValue());
            }
        }
    }
