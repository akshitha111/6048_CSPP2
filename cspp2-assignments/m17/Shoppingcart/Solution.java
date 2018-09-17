import java.util.Scanner;
/**
 * Class for item.
 */
class Item {
    /**
     * product name.
     */
    private String productName;
    /**
     * quantity of the product.
     */
    private int quantity;
    /**
     * unit price of the product.
     */
    private double unitPrice;
    /**
     * Constructs the object.
     *
     * @param      pn    { product name }.
     * @param      q     quantity.
     * @param      up    { unit price }.
     */
    Item(final String pn, final int q, final double up) {
        this.productName = pn;
        this.quantity = q;
        this.unitPrice = up;
    }
    /**
     * Gets the product name.
     *
     * @return     The product name.
     */
    public String getProductName() {
        return this.productName;
    }
    /**
     * Gets the quantity.
     *
     * @return     The quantity.
     */
    public int getQuantity() {
        return this.quantity;
    }
    /**
     * Gets the unit price.
     *
     * @return     The unit price.
     */
    public double getUnitPrice() {
        return this.unitPrice;
    }
    /**
     * function for decreasing quantity.
     *
     * @param      quant  The quant
     */
    public void decreaseQuantity(final int quant) {
        this.quantity -= quant;

    }
    /**
     * function for increasing quantity.
     *
     * @param      quant  The quant
     */

    public void increaseQuantity(final int quant) {
        this.quantity += quant;

    }
    /**
     * function for printing.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        return this.getProductName() + " "
         + this.getQuantity() + " " + this.getUnitPrice();
    }
}
/**
 * Class for shopping cartesian.
 */

class ShoppingCart {
    /**
     * catalog list.
     */

    private List<Item> catalog;
    /**
     * cart list.
     */
    private List<Item> cart;
    /**
     * variable for total amount.
     */
    private double totalAmount;
    /**
     * variable for payabale amount.
     */
    private double payableAmount;
    /**
     * variable for discount amount.
     */
    private double discount;
    /**
     * variable to check if coupon applied.
     */
    private boolean isCouponApplied;
    /**
     * variable for coupon code.
     */
    private double couponCode;
    /**
     * flag variable.
     */
    private int flag = 0;
    /**
     * tax value.
     */
    private static final double NUMONE = 0.15;
    /**
     * coupon value for coupon 10.
     */
    private static final double NUMTWO = 0.1;
    /**
     * coupon value for coupon 20.
     */
    private static final double NUMTHREE = 0.2;
    /**
     * coupon value for coupon 30.
     */
    private static final double NUMFOUR = 0.3;
    /**
     * coupon value for coupon code 50.
     */
    private static final double NUMFIVE = 0.5;
    /**
     * Constructs the object.
     */

    ShoppingCart() {
        catalog = new List<Item>();
        cart = new List<Item>();
        isCouponApplied = true;
        couponCode = 0.0;
    }
    /**
     * Adds to catalog.
     *
     * @param      item  The item
     */
    public void addToCatalog(final Item item) {
        catalog.add(item);
    }
    /**
     * Adds to cart.
     *
     * @param      item  The item
     */

    public void addToCart(final Item item) {
        for (int i = 0; i < catalog.size(); i++) {
            if (catalog.get(i).getProductName().equals(item.getProductName())) {
                if (catalog.get(i).getQuantity() >= item.getQuantity()) {
                    for (int j = 0; j < cart.size(); j++) {
                        if (item.getProductName()
                            .equals(cart.get(j).getProductName())) {
                            cart.get(j).increaseQuantity(item.getQuantity());
                            return;
                        }
                    }
                    cart.add(item);
                    catalog.get(i).decreaseQuantity(item.getQuantity());
                    return;
                }
            }
        }

    }
    /**
     * Removes a from cart.
     *
     * @param      item  The item
     */

    public void removeFromCart(final Item item) {
        for (int i = 0; i < cart.size(); i++) {
        if (cart.get(i).getProductName().equals(item.getProductName())) {
            if (cart.get(i).getQuantity() == item.getQuantity()) {
            cart.remove(i);
        } else {
            cart.get(i).decreaseQuantity(item.getQuantity());
        }
    }
}
}
/**
 * Shows the cart.
 */

    public void showCart() {
        for (int i = 0; i < cart.size(); i++) {
            Item item = cart.get(i);
            System.out.println(cart.get(i).getProductName()
             + " " + cart.get(i).getQuantity());
        }

    }
    /**
     * Shows the catalog.
     */

    public void showCatalog() {
        for (int i = 0; i < catalog.size(); i++) {
            System.out.println(catalog.get(i).getProductName()
             + " " + catalog.get(i).getQuantity()
              + " " + catalog.get(i).getUnitPrice());
        }

    }
    /**
     * Gets the total amount.
     *
     * @return     The total amount.
     */

    public double getTotalAmount() {
        totalAmount = 0;
        for (int i = 0; i < cart.size(); i++) {
            for (int j = 0; j < catalog.size(); j++) {
                if (cart.get(i).getProductName()
                    .equals(catalog.get(j).getProductName())) {
                    totalAmount = totalAmount + (cart.get(i).getQuantity()
                     * catalog.get(j).getUnitPrice());
                }
            }
    }
    return totalAmount;
}
/**
 * Gets the payable amount.
 *
 * @return     The payable amount.
 */

    public double getPayableAmount() {
        if (isCouponApplied) {
        payableAmount = 0;
        discount = getTotalAmount() * couponCode;
        double total = getTotalAmount() - discount;
        double tax = (total * NUMONE);
        payableAmount = total + tax;
        }
        return this.payableAmount;
}
/**
 * function used for applying coupon.
 *
 * @param      coupon  The coupon
 */

    public void applyCoupon(final String coupon) {
            if (coupon.equals("IND10") && flag == 0) {
            couponCode = NUMTWO;
            flag = 1;
            return;
            } else if (coupon.equals("IND20") && flag == 0) {
                couponCode = NUMTHREE;
                flag = 1;
                return;
            } else if (coupon.equals("IND30") && flag == 0) {
                couponCode = NUMFOUR;
                flag = 1;
                return;
            } else if (coupon.equals("IND50") && flag == 0) {
                couponCode = NUMFIVE;
                flag = 1;
                return;
            } else if (flag == 0) {
                System.out.println("Invalid coupon");
                return;
            }
        }
        /**
         * function used to get the tax.
         *
         * @return     The double tax.
         */

        public double getTax() {
            if (couponCode == 0.0) {
                return getTotalAmount() * NUMONE;
            } else {
                return (getTotalAmount()
                 - (getTotalAmount() * couponCode)) * NUMONE;
            }
        }
        /**
         * function used for printing the invoice.
         */

    public void printInvoice() {
        System.out.println("Name" + "   quantity" + "   Price");
        for (int i = 0; i < cart.size(); i++) {
            System.out.print(cart.get(i).getProductName()
             + " " + cart.get(i).getQuantity() + " ");
            for (int j = 0; j < catalog.size(); j++) {
            if (cart.get(i).getProductName().equals(
                catalog.get(j).getProductName())) {
            System.out.println(catalog.get(j).getUnitPrice());
            }
        }
    }
     if (isCouponApplied) {
        System.out.println("Total:" + getTotalAmount());
        System.out.println("Disc%:" + discount);
        System.out.println("Tax:" + getTax());
        System.out.println("Payable amount: " + getPayableAmount());
    }
}
}
/**
 * this is a class solution.
 */

final class Solution {
    /**
     * this is a constructor.
     */
    private Solution() { }
    /**
     * this is a main function.
     *
     * @param      args  The arguments
     */
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
                break;

                case "catalog":
                    sc.showCatalog();
                break;

                case "add":
                    String[] c2 = tokens[1].split(",");
                    sc.addToCart(new Item(c2[0],
                        Integer.parseInt(c2[1]), 0.0f));
                break;

                case "remove":
                    String[] c3 = tokens[1].split(",");
                    sc.removeFromCart(new Item(c3[0],
                        Integer.parseInt(c3[1]), 0.0f));
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

