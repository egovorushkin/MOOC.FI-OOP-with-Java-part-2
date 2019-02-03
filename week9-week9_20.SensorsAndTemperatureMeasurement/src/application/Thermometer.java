package application;

import java.util.Random;

public class Thermometer implements Sensor {

    private Random random;
    private boolean status;

    public Thermometer() {
        random = new Random();
        this.status = false;

    }

    @Override
    public boolean isOn() {
        return this.status;
    }

    @Override
    public void on() {
        this.status = true;
    }

    @Override
    public void off() {
        this.status = false;
    }

    @Override
    public int measure() {
        if(!isOn()){
            throw new IllegalArgumentException("Thermometer is OFF");
        }
        int number = this.random.nextInt(30 - (-30) + 1) - 30;

        return number;
    }
}
