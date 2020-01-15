package StructuralPatterns.structural.bridge.ex1;

@SuppressWarnings("unused")

public class Main {

    public static void main(String[] args) {
        TV sony = new SonyTV();
        TV samsung = new SamsungTV();
        AbstractRemoteControl arcSony = new LogitechRemoteControl(sony);
        AbstractRemoteControl arcSamsung = new LogitechRemoteControl(samsung);
        arcSony.turnOn();
        arcSony.setChannel(5);
        arcSony.turnOff();
        System.out.println("=====");
        arcSony = new LogitechRemoteControl(samsung);
        arcSony.turnOff();
    }

}
