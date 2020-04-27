package eca.exercises.BILL.answers;

import eca.util.UserInputUtil;

public class AnswersBILL2 {

    public static void main(String[] args) {
        // Create variables for your pre-tax, VAT percentage, and tip
        var vat = 0.2;

        System.out.print("Pre-tax: ");
        var preTax = UserInputUtil.readDouble();
        System.out.print("Number of people: ");
        var numberOfPeople = UserInputUtil.readInteger();
        
        // Calculator your tax, total, and split
        var taxAmount = preTax * vat;

        var total = preTax + taxAmount;

        // Ask the user if they want to tip, taking "true" or "false"
        System.out.print("Would you like to tip? ");
        var willTip = UserInputUtil.readBoolean();
        var tip = 0.0;
        if (willTip) {
            // Ask the user for the amount only if they will tip
            System.out.print("Tip: ");
            tip = UserInputUtil.readDouble();

            total = total + tip;
        }

        var split = total / numberOfPeople;

        // Print the breakdown, total, and total owed per person
        System.out.println("Subtotal: " + preTax);
        System.out.println("VAT: " + taxAmount);
        // Only print the tip if the user did tip
        if (willTip) {
            System.out.println("Tip: " + tip);
        }

        System.out.println("Total: " + total);
        System.out.println("Cost per person: " + split);
    }
}