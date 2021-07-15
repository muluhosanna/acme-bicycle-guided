package com.acme.sample;
import com.acme.model.*;
import java.util.ArrayList;
import java.util.Scanner;
/*
* Sample order taker for a simulated user experience
 */
public class SampleOrder {
    private ArrayList<BikeInterface> bikeOrder;
    private Scanner userIn;
    private SampleInventory inventory;
    private BikeInterface bikeChoice;
    public SampleOrder(){
        bikeOrder =  new ArrayList<>();
        userIn = new Scanner(System.in);
        inventory = new SampleInventory();
    }
    public void welcomeMessage(){
        System.out.println("Well come to ACME Bicycle company");
        System.out.println("Your one stops Road and Mountain Bikes");
        buyBike();
    }
    public void  buyBike(){
        System.out.println("Let's buy a bike today");
        System.out.println("what kind of bike would you like?");
        System.out.println("Your options are: \nc - Cross Country\n" +
                "d- DownHill\nt- Touring\nv- Vintage");
        String type = userIn.next();
        validateBikeType(type.toLowerCase());
        bikeColor();
        upgrades();
        bikeOrder.add(bikeChoice);
        orderDone();

        }

    private void orderDone() {
        System.out.println("Does this complete your order? yes or no");
        String val = userIn.next();

        switch (val.toLowerCase()) {
            case "yes":
                new SampleReceipt(bikeOrder);
                break;
            case "no":
                bikeChoice = null;
                buyBike();
                break;
            default:
                System.out.println("You have made an invalid choice.");
                orderDone();
                break;
        }
    }

    private void upgrades() {
        System.out.println("What upgrades would you like?");
        System.out.println("ls for Leather Seat, lg for Leather Grips," +
                "gf for Gold Frame, wt for White Tires, None");
        String option = userIn.next();
        validateOptions(option);
    }

    private void validateOptions(String option) {
        switch (option.toLowerCase()) {
            case "ls":
                bikeChoice = new LeatherSeatOption(bikeChoice);
                break;
            case "lg":
                bikeChoice = new LeatherGripsOption(bikeChoice);
                break;
            case "gf":
                bikeChoice = new GoldFrameOption(bikeChoice);
                break;
            case "wt":
                bikeChoice = new WhiteTireOption(bikeChoice);
                break;
            case "none":
                break;
            default:
                System.out.println("You have made an invalid upgrade choice.");
                upgrades();
                break;
        }
    }

    private void bikeColor() {
        System.out.println("What color would you like the bike frame?");
        System.out.println("Black, Blue, Chrome, Green, Red");
        String color = userIn.next();
        validateColorChoice(color);
    }

    private void validateColorChoice(String color) {
        switch (color) {
            case "Black":
                bikeChoice.paint(BikeColor.BLACK);
                break;
            case "Blue":
                bikeChoice.paint(BikeColor.BLUE);
                break;
            case "Chrome":
                bikeChoice.paint(BikeColor.CHROME);
                break;
            case "Green":
                bikeChoice.paint(BikeColor.GREEN);
                break;
            case "Red":
                bikeChoice.paint(BikeColor.RED);
                break;
            default:
                System.out.println("You have entered an incorrect color");
                bikeColor();
                break;
        }
    }

    private void validateBikeType(String bikeType) {
        switch (bikeType) {
            case "c":
                bikeChoice = inventory.getCrossCountryList().get(0);
                inventory.getCrossCountryList().remove(0);
                break;
            case "d":
                bikeChoice = inventory.getDownHillList().get(0);
                inventory.getDownHillList().remove(0);
                break;
            case "t":
                bikeChoice =  inventory.getTouringList().get(0);
                inventory.getTouringList().remove(0);
                break;
            case "v":
                bikeChoice = inventory.getVintageList().get(0);
                inventory.getVintageList().remove(0);
                break;
            default:
                System.out.println("You have entered an incorrect value");
                buyBike();
        }
    }


}
