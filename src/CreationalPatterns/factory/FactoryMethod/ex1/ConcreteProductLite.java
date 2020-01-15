package CreationalPatterns.factory.FactoryMethod.ex1;

public class ConcreteProductLite implements Product {
    @Override
    public void use() {
        System.out.println("ConreteProductLite");
    }
}
