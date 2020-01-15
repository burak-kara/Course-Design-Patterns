package CreationalPatterns.factory.AbstractFactory.ex1;

public abstract class HouseElectronics {
    public abstract String getModelInfo();

    @Override
    public String toString() {
        return getModelInfo();
    }
}
