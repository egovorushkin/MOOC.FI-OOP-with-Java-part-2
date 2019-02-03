import java.util.HashMap;

public class Airplane {

    private String planeId;
    private int planeCapacity;

    public Airplane(String planeId, int planeCapacity) {
        this.planeId = planeId;
        this.planeCapacity = planeCapacity;
    }

    public String getPlaneId() {
        return planeId;
    }

    public int getPlaneCapacity() {
        return planeCapacity;
    }

    public String toString() {
        return planeId + " (" + planeCapacity + " ppl)";
    }

}