package BehavioralPatterns.dependencyinjection.ex1.injector;


import BehavioralPatterns.dependencyinjection.ex1.consumer.Consumer;
import BehavioralPatterns.dependencyinjection.ex1.consumer.MyDIApplication;
import BehavioralPatterns.dependencyinjection.ex1.service.SMSServiceImpl;

public class SMSServiceInjector implements MessageServiceInjector {

    @Override
    public Consumer getConsumer() {
        return new MyDIApplication(new SMSServiceImpl());
    }

}
