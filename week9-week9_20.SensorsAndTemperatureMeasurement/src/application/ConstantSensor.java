package application;

public class ConstantSensor implements Sensor {

    private int param;

    public ConstantSensor(int param) {
        this.param = param;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void on() {

    }

    @Override
    public void off() {

    }

    @Override
    public int measure() {
        return this.param;
    }
}
