package CreationalPatterns.factory.FactoryMethod.ex1;

public class ConcreteProductPro implements Product {
    @Override
    public void use() {
        System.out.println("Hey you are using ConcreteProductPro!");
    }
}
