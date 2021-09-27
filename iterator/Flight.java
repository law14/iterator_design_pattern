public class Flight {
    private String flightNum;
    private String from;
    private String to;
    private int duration;
    private int transfers;

    public Flight(String flightNum, String from, String to, int duration, int transfers) {
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.duration = duration;
        this.transfers = transfers;
    }

    public String getFlightNum() {
        return this.flightNum;
    }
    public String getFrom() {
        return this.from;
    }

    public String getTo() {
        return this.to;
    }

    public int getDuration() {
        return duration;
    }

    public int getNumTransfers() {
        return this.transfers;
    }

    public String toString() {
        String output = "";
        output = "Flight Number: " + getFlightNum()
            + "\nFrom: " + getFrom()
            + "\nTo: " + getTo()
            + "\nDuration " + getDuration()
            + "\n";

        if(getNumTransfers()>1) {
            output+= String.valueOf(getNumTransfers()) + " Transfers";
        } else output += "Direct Flight";

        return output;
    } 
}
