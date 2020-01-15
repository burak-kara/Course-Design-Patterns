package CreationalPatterns.factory.FactoryMethod.ex1;

public class ConcreteProduct implements Product {

    int id;

    public ConcreteProduct(int id) {
        this.id = id;
    }

    @Override
    public void use() {
        System.out.print("ConcreteProduct ");
        if (id > 0)
            System.out.print(id);
        System.out.println();

    }
}
