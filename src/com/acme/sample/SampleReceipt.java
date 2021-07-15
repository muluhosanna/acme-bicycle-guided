package com.acme.sample;
import com.acme.model.BikeInterface;
import java.util.ArrayList;
/*
*This class will represent a sample
 * output in the form of a type of receipt
 */
public class SampleReceipt {
    ArrayList<BikeInterface> cartList;
    public SampleReceipt(ArrayList<BikeInterface> bikeList) {
        cartList = bikeList;
        showTitle();
        showColumnHeader();
        showCart();
    }

    private void showTitle() {
        String company = String.format("%30s", "ACME Bicycle Company");
        String address = String.format("%33s", "123 Main St, City, St, Zip");
        String phone = String.format("%27s", "(000) 000 - 0000");
        System.out.println(company.toUpperCase());
        System.out.println(address);
        System.out.println(phone);
        showStars();
        String cash = String.format("%25s", "MONEY RECEPT");
        System.out.println(cash);
        showStars();
    }

    private void showColumnHeader() {
        String price = String.format("%23s |", "Price");
        System.out.print("| Description |");
        System.out.println(price);
    }

    private void showCart() {
        float total = 0.0f;
        float ship = 49.99f;
        for(BikeInterface bike: cartList) {
            System.out.println(bike);
            System.out.println();
            total += bike.getPrice();
        }
        showStars();
        System.out.print("Sub Total");
        System.out.printf("%31s%n","$" + total);
        System.out.print("Shipping Cost");
        System.out.printf("%27s%n", "$" + ship);
        System.out.print("Total");
        float totalTax = total + ship;
        System.out.printf("%35s%n","$" + totalTax);
    }

    private void showStars() {
        for(int i = 0; i < 40; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

}





