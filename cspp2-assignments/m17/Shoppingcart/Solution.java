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
    /*public Item(String pn, item q) {
        this.productName = pn;
        this.quantity = q;
    }*/
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
    public String toString() {
        return this.getProductName() + " " + this.getQuantity() + " " + this.getUnitPrice();
    }
}

class ShoppingCart {

    private List<Item> catalog;
    private List<Item> cart;
    double totalAmount;
    double payableAmount;
    double disc;
    boolean isCouponApplied;
    float couponCode;

    public ShoppingCart() {
        catalog = new List<Item>();
        cart = new List<Item>();
        isCouponApplied = true;
        /*totalAmount = 0.0;
        payableAmount = 0.0;
        disc = 0.0;*/

    }


    public void addToCatalog(Item item) {
        catalog.add(item);

    }

    public void addToCart(Item item) {
        for(int i = 0; i < catalog.size(); i++) {
            if(catalog.get(i).getProductName().equals(item.getProductName())) {
                if(catalog.get(i).getQuantity() >= item.getQuantity()){
                    cart.add(item);
                    catalog.get(i).decreaseQuantity(item.getQuantity());
                    return;
                }
            }
        }

    }

    public void removeFromCart(Item item) {
        for(int i = 0; i < cart.size(); i++){
        if(cart.get(i).getProductName().equals(item.getProductName())){
            if(cart.get(i).getQuantity() == item.getQuantity()){
            cart.remove(i);
        }
        else {
            cart.get(i).decreaseQuantity(item.getQuantity());
        }
    }
}
}

    public void showCart() {
        for(int i = 0; i < cart.size(); i++) {
            Item item = cart.get(i);
            System.out.println(cart.get(i).getProductName() + " " + cart.get(i).getQuantity());
        }

    }

    public void showCatalog() {
        for(int i = 0; i < catalog.size(); i++) {
            System.out.println(catalog.get(i).getProductName() + " " + catalog.get(i).getQuantity() + " " + catalog.get(i).getUnitPrice());
        }

    }

    public double getTotalAmount() {
        totalAmount = 0;
        for(int i = 0; i < cart.size(); i++) {
            for(int j =0 ; j < catalog.size(); j++) {
                if(cart.get(i).getProductName().equals(catalog.get(j).getProductName())){
                    totalAmount = totalAmount + (cart.get(i).getQuantity() * catalog.get(j).getUnitPrice());
                }
            }
            //totalAmount = totalAmount + (cart.get(i).getQuantity() * catalog.get(i).getUnitPrice());
            /*for(int j = 0; j < catalog.size(); j++) {
                if(cart.get(i).getProductName().equals(catalog.get(j).getProductName()))
                totalAmount += cart.get(i).getQuantity() * catalog.get(j).getUnitPrice();
        }*/
    //}
    }
    return totalAmount;

}

    public double getPayableAmount() {
        payableAmount = 0;
        for(int i =0; i < cart.size();i++){
            for(int j =0 ; j < catalog.size(); j++) {
                 if(cart.get(i).getProductName().equals(catalog.get(j).getProductName())){
                    
                    payableAmount += (cart.get(i).getQuantity() * catalog.get(j).getUnitPrice());
                   
                }       
    }
        
    }return this.payableAmount; 
}

    public void applyCoupon(final String coupon) {

        if (isCouponApplied) {
            if (coupon.equals("IND10")) {
            couponCode = 0.1f;
            } else if (coupon.equals("IND20")) {
                couponCode = 0.2f;
            } else if (coupon.equals("IND30")) {
                couponCode = 0.3f;
            } else if (coupon.equals("IND50")) {
                couponCode = 0.5f;
            } else {
                System.out.println("Invalid coupon");
                return;
            }
            isCouponApplied = true;
        }
    
    }

    /*public double getDiscount() {
     
        return getTotalAmount() * (disc/100);
 
    }*/

    public void printInvoice() {
        System.out.println("Name" + "   quantity" + "   Price");
        for(int i = 0; i < cart.size(); i++) {
            
            System.out.print(cart.get(i).getProductName() + " " + cart.get(i).getQuantity() + " ");
            for(int j=0;j<catalog.size();j++){
            if(cart.get(i).getProductName().equals(catalog.get(j).getProductName())){
            System.out.println(catalog.get(j).getUnitPrice());     
            }       
        }
    }
    if(!isCouponApplied){
        payableAmount = payableAmount * couponCode;
        System.out.println(payableAmount);
    }
        
    if(isCouponApplied){
        System.out.println("Total:" +getTotalAmount());
        System.out.println("Disc%:" + 0.0);
        System.out.println("Tax:" + totalAmount * 0.15);
        System.out.println("Payable amount: " + getPayableAmount());
    }
    
}
}



class Solution {
    private Solution() {

    }

public static void main(final String[] args) {
        ShoppingCart sc = new ShoppingCart();
        Scanner scan = new Scanner(System.in);
        int testCases = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < testCases; i++) {
            String line = scan.nextLine();
            String[] tokens = line.split(" ");
            switch (tokens[0]) {
                case "Item":
                String[] c1 = tokens[1].split(",");
                sc.addToCatalog(new Item(c1[0],
                    Integer.parseInt(c1[1]), Float.parseFloat(c1[2])));
                //sc.addToCatalog(it);
                break;

                case "catalog":
                    sc.showCatalog();
                break;

                case "add":
                    String[] c2 = tokens[1].split(",");
                    sc.addToCart(new Item(c2[0],
                        Integer.parseInt(c2[1]), 0.0f));
                    //sc.addToCart(it);
                break;

                case "remove":
                    String[] c3 = tokens[1].split(",");
                    sc.removeFromCart(new Item(c3[0],
                        Integer.parseInt(c3[1]), 0.0f));
                    //sc.remove(it);
                break;
                case "show":
                    sc.showCart();
                break;
                case "totalAmount":
                    System.out.println("totalAmount: " + sc.getTotalAmount());
                break;
                case "payableAmount":
                    System.out.println("Payable amount: " + sc.
                        getPayableAmount());
                break;
                case "print":
                    sc.printInvoice();
                break;
                case "coupon":
                    sc.applyCoupon(tokens[1]);
                break;
                default:
                break;
            }

        }
    }
}

