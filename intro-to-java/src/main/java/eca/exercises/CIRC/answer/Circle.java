package eca.exercises.CIRC.answer;

public class Circle {

    // Create a property called radius
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    // Using the radius, create a method called getArea, that returns the area of the circle
    public Double getArea() {
        // Area = pi x radius squared
        return Math.PI * (Math.pow(radius, 2));
    }

    // Using the radius, create a method called getCircumference, that returns the circumference of the circle
    public Double getCircumference() {
        // Circumference = 2 x pi x radius
        return 2 * Math.PI * radius;
    }


    public static void main(String[] args) {
        var myCircle = new Circle(1.0);

        System.out.println(myCircle.getArea());
        System.out.println(myCircle.getCircumference());
    }
}
