package CreationalPatterns.factory.FactoryMethod.ex1;

public class ConcreteProductFactoryPro extends ProductFactory {
    @Override
    protected Product produceProduct(String type) {
        return new ConcreteProductPro();
    }
}
