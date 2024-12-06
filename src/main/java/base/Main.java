package base;

public class Main {
    public static void main(String[] args) {
        Passenger passenger = new Passenger("ID1", "Fares", "123 caca", "1234567890", "PAS123");
        AirplanePilot pilot = new AirplanePilot("ID2", "Helene", "123 caca2", "1234567890", "EMP123", "2023-01-01", "LIC123", 5000);
        StaffCabin cabinStaff = new StaffCabin("ID3", "Guilhem", "123 caca3", "1234567890", "EMP124", "2023-02-01", "Qualified");

        Aircraft aircraft = new Aircraft("REG123", "Boeing 737", 180);
        Flight flight = new Flight("FL123", "Paris", "New York", "2024-12-06 08:00", "2024-12-06 14:00", "Scheduled");

        Book booking = new Book("RES123", "2024-12-01", "Pending");
        passenger.bookFlight(booking);
        booking.confirmReservation();

        aircraft.assignFlight(flight.getFlightNumber());
        System.out.println(passenger.getInfos());
    }
}
