package BehavioralPatterns.dependencyinjection.ex1.injector;


import BehavioralPatterns.dependencyinjection.ex1.consumer.Consumer;
import BehavioralPatterns.dependencyinjection.ex1.consumer.MyDIApplication;
import BehavioralPatterns.dependencyinjection.ex1.service.EmailServiceImpl;

public class EmailServiceInjector implements MessageServiceInjector {

    @Override
    public Consumer getConsumer() {
        MyDIApplication app = new MyDIApplication();
        app.setService(new EmailServiceImpl());
        return app;
    }

}
