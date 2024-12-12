package com.swiggy.billingapp;

public class Pizza {
	private int price;
	
	private Boolean veg;
	
	private int Basepizaprice;
	
	private int extracheseprice=30;
	private int extraToppingsprice=20;
	private int extracoldrinksprice=40;
	private int backpackprice=20;
	
	private Boolean isextracheeseadded =false;
	private Boolean isextraToppingsadded=false;
	private Boolean isextracolddrinksadded=false;
	private Boolean isOptedForTakeAway=false;
	
	public Pizza(Boolean veg) {
		this.veg=veg;
		if(this.veg) {
			this.price=199;
			System.out.println("veg Pizza price is "+this.price);
			
		}
		else {
			this.price=299;
			System.out.println("Non veg piza price is "+this.price);
		}
		Basepizaprice=this.price;
	}
	public void addextracheese() {
		isextracheeseadded=true;
	
		this.price=this.price+extracheseprice;
		
	}
	public void addextraToppings() {
		isextraToppingsadded=true;
		
		this.price=this.price+extraToppingsprice;
		
	}
	
	public void addcoldDrinks() {
		isextracolddrinksadded=true;
	
		this.price=this.price+extracoldrinksprice;
		
	}
	public void takeway() {
		isOptedForTakeAway=true;
	
		this.price=this.price+backpackprice;
		
		
	}
	
	public void getbill() {
		
			String bill="";
//			System.out.println("Pizza:"+Basepizaprice);
			if(isextracheeseadded) {
				bill=bill+"Extra Cheese Added:"+extracheseprice + "\n";
				
			}
			if(isextraToppingsadded) {
				bill=bill+"Extra Toppingsadded" +extraToppingsprice + "\n";
			}
			if(isextracolddrinksadded) {
				bill=bill+"Coldrink Added " +extracoldrinksprice + "\n";
			}
			if(isOptedForTakeAway) {
				bill=bill+"Take away:" +backpackprice + "\n";
			}
			
			bill=bill+"Bill :"+this.price +"\n";
			
			System.out.println(bill);
		
	}
	
	


}
