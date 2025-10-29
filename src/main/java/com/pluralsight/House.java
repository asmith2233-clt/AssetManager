package com.pluralsight;

public class House extends Asset {
    private String address;
    private int condition; // (1 - excellent, 2 - good, 3 - fair, 4 - poor)
    private int squareFoot;
    private int lotSize;

    public House(String description, String dateAcquired, double originalCost,
                 String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public int getCondition() {
        return condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double getValue() {
        double pricePerSquareFoot = 0;

        switch (condition) {
            case 1: pricePerSquareFoot = 180; break; // excellent
            case 2: pricePerSquareFoot = 130; break; // good
            case 3: pricePerSquareFoot = 90; break;  // fair
            case 4: pricePerSquareFoot = 80; break;  // poor
        }

        // Add $0.25 per square foot of lot size
        return (pricePerSquareFoot * squareFoot) + (lotSize * 0.25);
    }
}


