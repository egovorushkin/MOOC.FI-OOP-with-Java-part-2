package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

    private List<Sensor> sensors;
    private List<Integer> readings;

    public AverageSensor() {
        this.sensors = new ArrayList<Sensor>();
        readings = new ArrayList<Integer>();
    }

    @Override
    public boolean isOn() {
        for (Sensor s: this.sensors){
            if(!s.isOn()){
                return false;
            }
        }
        return true;
    }

    @Override
    public void on() {
        for (Sensor s : this.sensors) {
            s.on();
        }
    }

    @Override
    public void off() {
        for (Sensor s : this.sensors) {
            s.off();
        }
    }

    @Override
    public int measure() {
        if(!this.isOn() || this.sensors.isEmpty()){
            throw new IllegalStateException();
        }

        int sum = 0;
        int avg;
        for (Sensor s : this.sensors){
            sum += s.measure();
        }

        avg = sum / this.sensors.size();

        this.readings.add(avg);

        return avg;
    }

    public void addSensor(Sensor additional){
        this.sensors.add(additional);
    }

    public List<Integer> readings(){
        return this.readings;
    }
}
