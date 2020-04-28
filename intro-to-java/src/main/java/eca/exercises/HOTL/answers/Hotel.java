package eca.exercises.HOTL.answers;

public class Hotel {

    // Create properties for name and pricePerNight
    private String name;
    private Double pricePerNight;

    // Create the constructor
    public Hotel(String name, Double pricePerNight) {
        this.name = name;
        this.pricePerNight = pricePerNight;
    }

    // Using the properties, implement hotelSummary
    public void hotelSummary() {
        System.out.println("The hotel " + name + " costs £" + pricePerNight + " per night");
    }

    // Using the pricePerNight, implement calculatePrice
    public Double calculatePrice(Integer numberOfNights) {
        return pricePerNight * numberOfNights;
    }

    public static void main(String[] args) {
        var myHotel = new Hotel("Overpriced Hostel in London", 150.0);

        myHotel.hotelSummary();
        System.out.println(myHotel.calculatePrice(3));
    }
}