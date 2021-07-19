

package main;

import java.util.Scanner;

public class Converter
{
    static Scanner scan;
    
    static {
        Converter.scan = new Scanner(System.in);
    }
    
    public static void main(final String[] args) {
        int menuSelection = 1;
        final int menuLength = 4;
        while (menuSelection != menuLength) {
            System.out.println("Please select an option:");
            System.out.println("1. Cups to Teaspoons");
            System.out.println("2. Pounds to Kilograms");
            System.out.println("3. Square Feet to Square Meters");
            System.out.println("4. Quit");
            final int choice = Converter.scan.nextInt();
            switch (choice) {
                case 1: {
                    CT();
                    continue;
                }
                case 2: {
                    PK();
                    continue;
                }
                case 3: {
                    SFSM();
                    continue;
                }
                case 4: {
                    menuSelection = 0;
                    System.out.println("See you later!");
                    continue;
                }
                default: {
                    System.err.println("Please enter a valid input");
                    continue;
                }
            }
        }
    }
    
    public static void CT() {
        System.out.println("Enter number of cups: ");
        final double cups = Converter.scan.nextDouble();
        final double tSpoon = cups * 48.0;
        System.out.println(String.valueOf(cups) + " cup(s) is equivalent to " + tSpoon + " teaspoon(s)!");
    }
    
    public static void PK() {
        System.out.println("Enter number of pounds: ");
        final double pounds = Converter.scan.nextDouble();
        final double kGrams = pounds / 2.2;
        System.out.println(String.valueOf(pounds) + " pound(s) is equivalent to " + kGrams + " kilogram(s)!");
    }
    
    public static void SFSM() {
        System.out.println("Enter number of square feet: ");
        final double sqft = Converter.scan.nextDouble();
        final double sqm = sqft * 0.0929;
        System.out.println(String.valueOf(sqft) + "  square feet is equivalent to " + sqm + " square meter(s)!");
    }
}