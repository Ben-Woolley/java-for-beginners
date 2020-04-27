package eca.exercises.BILL.answers;

import eca.util.UserInputUtil;

public class AnswersBILL {

    public static void main(String[] args) {
        // Create variables for your pre-tax, VAT percentage, and tip
        var vat = 0.2;

        System.out.print("Pre-tax: ");
        var preTax = UserInputUtil.readDouble();
        System.out.print("Tip: ");
        var tip = UserInputUtil.readDouble();
        System.out.print("Number of people: ");
        var numberOfPeople = UserInputUtil.readInteger();
        
        // Calculator your tax, total, and split
        var taxAmount = preTax * vat;
        var total = preTax + taxAmount + tip;
        var split = total / numberOfPeople;

        // Print the breakdown, total, and total owed per person
        System.out.println("Subtotal: " + preTax);
        System.out.println("VAT: " + taxAmount);
        System.out.println("Tip: " + tip);

        System.out.println("Total: " + total);
        System.out.println("Cost per person: " + split);
    }
}