package com.tailorshop;

public class TailorShopMain {

	public static TailorShop[] insertionSort(TailorShop[] products) {
		
		for ( int i = 0; i < products.length; i++) {
			for ( int j = i ; j > 0 ;j--) {
				if ((products[j].deadline< products[j-1].deadline )){
				    TailorShop temp = products[j];
					products[j] = products[j-1];
					products[j-1] = temp;
			}
		}
	 }
		return products;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TailorShop[] products = {
				new TailorShop("Ravi", 10),
				new TailorShop("Raghav", 5),
				new TailorShop("Vaidik", 19),
				new TailorShop("Shivam", 23)
		};
		TailorShop[] results = insertionSort(products);
		for ( TailorShop result : results ) 
				System.out.println(result.name + " " + result.deadline);
	}

}
