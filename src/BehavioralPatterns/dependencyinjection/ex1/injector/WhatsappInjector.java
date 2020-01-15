package BehavioralPatterns.dependencyinjection.ex1.injector;

import BehavioralPatterns.dependencyinjection.ex1.consumer.Consumer;
import BehavioralPatterns.dependencyinjection.ex1.consumer.MyDIApplication;
import BehavioralPatterns.dependencyinjection.ex1.service.WhatsappServiceImpl;

public class WhatsappInjector implements MessageServiceInjector {
    @Override
    public Consumer getConsumer() {
        return new MyDIApplication(new WhatsappServiceImpl());
    }
}
