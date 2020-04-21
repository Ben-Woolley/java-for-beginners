package eca.samples.buildingblocks.pt1;

public class MathOperators {
    public static void main(String[] args) {
        
        var plus = 1 + 2;
        System.out.println(plus);
        
        var minus = 1 - 2;
        System.out.println(minus);
        
        var divide = 1 / 2;
        System.out.println(divide);
        
        var multiply = 1 * 2;
        System.out.println(multiply);
        
        var power = Math.pow(1, 2); // 1 to the power of 2
        System.out.println(power);
        
        // Modulus %  gives you the remainder of division
        var modulus = 1 % 2; // remainder of 1 divided by 2
        System.out.println(modulus);
    }
}