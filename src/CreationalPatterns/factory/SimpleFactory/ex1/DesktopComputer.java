package CreationalPatterns.factory.SimpleFactory.ex1;

public class DesktopComputer extends Computer {

    private String memory;
    private String model;
    private String cores;
    private String disk;

    public DesktopComputer(String memory, String model, String cores, String disk) {
        this.memory = memory;
        this.model = model;
        this.cores = cores;
        this.disk = disk;
    }

    @Override
    public String getModelInfo() {
        return model;
    }

    @Override
    public String getMemoryInfo() {
        return memory;
    }

    @Override
    public String getCoreInfo() {
        return cores;
    }

    @Override
    public String getDiskInfo() {
        return disk;
    }

}
