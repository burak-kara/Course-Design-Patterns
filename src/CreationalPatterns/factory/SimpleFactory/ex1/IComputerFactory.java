package CreationalPatterns.factory.SimpleFactory.ex1;

public interface IComputerFactory {
    //getComputer is the factory Method
    Computer getComputer(ComputerType type, String model, String cores, String memory, String disk);

}
