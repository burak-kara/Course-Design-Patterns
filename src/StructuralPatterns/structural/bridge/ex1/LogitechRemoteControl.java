package StructuralPatterns.structural.bridge.ex1;

public class LogitechRemoteControl extends AbstractRemoteControl {

    public LogitechRemoteControl(TV tv) {
        super(tv);
    }

    @Override
    public void turnOn() {
        super.turnOn();
    }

    @Override
    public void turnOff() {
        super.turnOff();
    }

    @Override
    public void setChannel(int channel) {
        super.setChannel(channel);
    }
}
