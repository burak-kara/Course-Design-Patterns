package CreationalPatterns.factory.SimpleFactory.ex1;

public class ComputerFactory implements IComputerFactory {

    public ComputerFactory() {
        System.out.println("ComputerFactory is created!");
    }

    @Override
    public Computer getComputer(ComputerType type, String model, String cores, String memory, String disk) {
        switch (type) {
            case DesktopComputer:
                return new DesktopComputer(model, cores, memory, disk);
            case LaptopComputer:
                return new LaptopComputer(model, cores, memory, disk);
            case IoTComputer:
                return new IoTComputer(model, cores, memory, disk);
            case WearableComputer:
                return new WearableComputer(model, cores, memory, disk, 60, 42);
            default:
                return null;
        }
    }
}
