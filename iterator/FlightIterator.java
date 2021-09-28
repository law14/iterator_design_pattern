public class FlightIterator implements java.util.Iterator<Object> {
    private Flight[] flights;
    private int position;

    public FlightIterator(Flight[] flights) {
        this.flights = flights;
    }

    public boolean hasNext() {
        if (flights[this.position+1] != null) {
            return true;
        }
        return false;
    }

    public Object next() {
        if (this.hasNext()) {
            return flights[this.position+1];
        }
        return null;
    }
}
