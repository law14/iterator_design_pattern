public class Airline {
    private String title;
    private Flight[] flights;
    private int size;

    public Airline(String title) {
        this.title = title;
    }

    public void addFlight(String flightNum, String from, String to, int duration, int transfers) {

    }

    public String getTitle() {
        return this.title;
    }

    private Flight[] growArray(Flight[] flights) {
        return new Flight[10];
    }

    public FlightIterator createIterator() {
        return new FlightIterator(new Flight[10]);
    }
}
