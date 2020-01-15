package CreationalPatterns.factory.FactoryMethod.ex1;

public abstract class ProductFactory {

    public void useProduct(String type) {
        Product p = produceProduct(type);
        p.use();
    }

    protected abstract Product produceProduct(String type);
}
