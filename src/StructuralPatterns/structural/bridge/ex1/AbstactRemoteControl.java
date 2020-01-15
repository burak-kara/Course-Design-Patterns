package StructuralPatterns.structural.bridge.ex1;

abstract class AbstractRemoteControl {

    private TV tv;

    public AbstractRemoteControl(TV tv) {
        this.tv = tv;
    }

    public void turnOn() {
        tv.on();
    }

    public void turnOff() {
        tv.off();
    }

    public void setChannel(int channel) {
        tv.switchChannel(channel);
    }
}
