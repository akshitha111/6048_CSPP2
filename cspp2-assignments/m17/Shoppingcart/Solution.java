import java.util.*;

class Item {
	private String productName;
	private int quantity;
	private double unitPrice;
	Item(String pn, int q, double up) {
		this.productName = pn;
		this.quantity = q;
		this.unitPrice = up;
	}
	public String getProductName() {
		return this.productName;
	} 
	public int getQuantity() {
		return this.quantity;
	}
	public double getUnitPrice() {
		return this.unitPrice;
	}
	public void decreaseQuantity(int quantity) {
		this.quantity -= quantity;

	}
}

class ShoppingCart {

	Double discount;
	Double totalAmount;
	Double payableAmount;

	private List<Item> catalog;
	private List<Item> cart;

	public ShoppingCart() {
		catalog = new List<Item>();
		cart = new List<Item>();

	}


	public void addToCatalog(Item item) {
		catalog.add(item);

	}

	public void addToCart(Item item) {
		for(int i = 0; i < catalog.size(); i++) {
			if(catalog.get(i).getProductName().equals(item.getProductName())) {
				if(catalog.get(i).getQuantity() <= item.getQuantity()){
					cart.add(item);
				}
			}
		}

	}

	/*//public void removeFromCart(Item item) {
		for(int i = 0; i < cart.size(); i++){
		if(cart.get(i).getProductName().equals(item.getProductName())){
			cart.remove(item);
		}
	}
//}*/

	public void showCart() {
		for(int i = 0; i < cart.size(); i++) {
			System.out.println(cart.get(i).getProductName() + cart.get(i).getQuantity());
		}

	}

	public void showCatalog() {
		for(int i = 0; i < catalog.size(); i++) {
			System.out.println(catalog.get(i).getProductName() + catalog.get(i).getQuantity() + catalog.get(i).getUnitPrice());
		}

	}

	public void getTotalAmount() {
		for(int i = 0; i < cart.size(); i++) {
			System.out.println(cart.get(i).getQuantity() * cart.get(i).getUnitPrice());
		}


	}

	public void getPayableAmount() {
		totalAmount += 0.15; 
		payableAmount = payableAmount * discount;

	}

	public void applyCoupon(String couponCode) {
		if(couponCode == "IND10") {
			Double discount = 0.1;
		}
		if(couponCode == "IND20") {
			Double discount = 0.2;
		}
		if(couponCode == "IND30") {
			Double discount = 0.3;
		}
		if(couponCode == "IND50") {
			Double discount = 0.5;
		}
		
	}

	public void printInvoice() {
		System.out.println("Name" + "   quantity" + "   Price");

	}
}
class Solution {
	private Solution() {

	}

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while (sc.hasNext()) {
		String line = sc.nextLine();
		String[] tokens = line.split(" ");
		switch (tokens[0]) {
			case "Item":
			if(tokens.length == 2) {
				tokens[1].split(",");
			}
			break;
			case "catalog":
			break;
			case "add":
			break;
			case "show":
			break;
			case "totalAmount":
			break;
			case "payableAmount":
			break;
			case "remove":
			break;
			case "coupon":
			break;
			case "print":
			break;

			


	
}
}
}
}