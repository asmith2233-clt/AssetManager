package com.pluralsight;

public class Vehicle extends Asset{
    private String address;
    private int condition; // (1 -excellent, 2 -good, 3 -fair, 4 -poor)
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

    //    public House(String description, String dateAcquired, double originalCost){
//        super(description, dateAcquired, originalCost);
//    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double getValue(){
        double pricePerSquareFoot;
        switch(condition){
            case 1: //excellent
                pricePerSquareFoot = 180;
                break;
            case 2: //good
                pricePerSquareFoot = 130;
                break;
            case 3: //fair
                pricePerSquareFoot = 90;
                break;
            case 4: //poor
                pricePerSquareFoot = 80;
                break;
            default:
                pricePerSquareFoot = 0;
        }

        return (pricePerSquareFoot * this.squareFoot) + (this.lotSize * 0.25);
    }
}
