package CreationalPatterns.factory.FactoryMethod.ex1;

public class Main {

    public static void main(String[] args) {


        ConcreteProductFactory pf = new ConcreteProductFactory();
        pf.setId(5);
        pf.useProduct("1");

        ProductFactory cpf = new ConcreteProductFactory();

        cpf.useProduct("2");

        ProductFactory cpfp = new ConcreteProductFactoryPro();
        cpfp.useProduct("Pro");

    }

}
