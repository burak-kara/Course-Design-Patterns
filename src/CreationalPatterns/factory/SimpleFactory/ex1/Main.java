package CreationalPatterns.factory.SimpleFactory.ex1;

public class Main {

    public static void main(String[] args) {


        IComputerFactory myFactory = new ComputerFactory();
        Computer desktopComputer = myFactory.getComputer(ComputerType.DesktopComputer, "Desktop Series 2019", "16", "32GB", "512GB SSD");
        Computer laptopComputer = myFactory.getComputer(ComputerType.LaptopComputer, "Laptop Pro", "8", "16GB", "256GB SSD");
        Computer iotComputer = myFactory.getComputer(ComputerType.IoTComputer, "Raspberry 3B", "4", "2GB", "8GB SSD");
        Computer wearableComputer = myFactory.getComputer(ComputerType.WearableComputer, "elma", "2", "2gb", "4gb");

        System.out.println(wearableComputer.toString());

        System.out.println("DesktopComputer " + desktopComputer.toString());
        System.out.println("LaptopComputer " + laptopComputer.toString());
        System.out.println("IoTComputer " + iotComputer.toString());
    }
}
