public class Flight {
    private Airplane airplane;
    private String departuireCode;
    private String destinationCode;


    public Flight(Airplane airplane, String departuireCode, String destinationCode) {
        this.airplane = airplane;
        this.departuireCode = departuireCode;
        this.destinationCode = destinationCode;
    }


    public String toString() {
        return this.airplane.toString() + " (" + this.departuireCode + "-" + this.destinationCode + ")";
    }
}