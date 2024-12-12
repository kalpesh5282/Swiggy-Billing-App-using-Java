package com.swiggy.billingapp;

public class Pawbhaji {
    private int price;

    private Boolean veg;

    private int BasePawbhajiPrice;

    private int extraButterPrice = 30;
    private int extraPawPrice = 20;
    private int extraSaladPrice = 40;
    private int backpackPrice = 20;

    private Boolean isExtraButterAdded = false;
    private Boolean isExtraPawAdded = false;
    private Boolean isExtraSaladAdded = false;
    private Boolean isOptedForTakeAway = false;

   
    public Pawbhaji(Boolean veg) {
        this.veg = veg;
        if (this.veg) {
            this.price = 149;
            System.out.println("Buuter Pawbhaji price is " + this.price);
        } else {
            this.price = 199; 
            System.out.println("Paner Pawbhaji price is " + this.price);
        }
        BasePawbhajiPrice = this.price;
    }

  
    public void addExtraButter() {
        isExtraButterAdded = true;
        this.price = this.price + extraButterPrice;
    }


    public void addExtraPaw() {
        isExtraPawAdded = true;
        this.price = this.price + extraPawPrice;
    }

 
    public void addExtraSalad() {
        isExtraSaladAdded = true;
        this.price = this.price + extraSaladPrice;
    }

    
    public void takeAway() {
        isOptedForTakeAway = true;
        this.price = this.price + backpackPrice;
    }

    
    public void getBill() {
        String bill = "";
        System.out.println("Pawbhaji: " + BasePawbhajiPrice);
        if (isExtraButterAdded) {
            bill = bill + "Extra Butter Added: " + extraButterPrice + "\n";
        }
        if (isExtraPawAdded) {
            bill = bill + "Extra Paw Added: " + extraPawPrice + "\n";
        }
        if (isExtraSaladAdded) {
            bill = bill + "Extra Salad Added: " + extraSaladPrice + "\n";
        }
        if (isOptedForTakeAway) {
            bill = bill + "Takeaway: " + backpackPrice + "\n";
        }
        bill = bill + "Total Bill: " + this.price + "\n";

        System.out.println(bill);
    }
   
}
