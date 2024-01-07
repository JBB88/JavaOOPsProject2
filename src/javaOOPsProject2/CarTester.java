package javaOOPsProject2;

public class CarTester {
    public static void main(String[] args) {

        Truck truck = new Truck(54000,"Gray",5810);
        System.out.println("The sale price of the truck with discount is $"+truck.calculateSalePrice());

        Sedan sedan = new Sedan(31545,"Red",16);
        System.out.println("The sale price of the sedan with discount is $"+sedan.calculateSalePrice());
    }
}
