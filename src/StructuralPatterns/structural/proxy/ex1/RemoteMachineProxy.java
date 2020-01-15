package StructuralPatterns.structural.proxy.ex1;

public class RemoteMachineProxy implements Machine {

    private RemoteMachine rm;
    private int cacheX, cacheY;

    public RemoteMachineProxy() {
        System.out.println("RemoteMachine (proxy) has been initialized");

    }

    @Override
    public void configure(int x, int y) {
        // we may control accessing the resource or cache its simple parameters until real operation will begin (real ops: start()
        if (x < 0 || y < 0)
            System.out.println("RemoteMachine (proxy) Invalid Configuration");

        cacheX = x;
        cacheY = y;
        System.out.println("RemoteMachine (proxy) is configured x " + cacheX + " y " + cacheY);

    }

    @Override
    public void start() {
        rm = new RemoteMachine();  // remote object access is deferred until its real op is called.
        rm.configure(cacheX, cacheY);
        rm.start();
    }

    @Override
    public void stop() {
        if (rm != null)
            rm.stop();
    }

    public int getCacheX() {
        return cacheX;
    }

    public int getCacheY() {
        return cacheY;
    }
}
