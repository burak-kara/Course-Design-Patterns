package CreationalPatterns.factory.SimpleFactory.ex1;

public class WearableComputer extends Computer {
    private String memory;
    private String model;
    private String cores;
    private String disk;
    private int weight;
    private int screenSize;

    public WearableComputer(String memory, String model, String cores, String disk, int weight, int screenSize) {
        this.memory = memory;
        this.model = model;
        this.cores = cores;
        this.disk = disk;
        this.weight = weight;
        this.screenSize = screenSize;
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

    @Override
    public String toString() {
        return "WearableComputer{" +
                "memory='" + memory + '\'' +
                ", model='" + model + '\'' +
                ", cores='" + cores + '\'' +
                ", disk='" + disk + '\'' +
                ", weight=" + weight +
                ", screenSize=" + screenSize +
                '}';
    }
}
