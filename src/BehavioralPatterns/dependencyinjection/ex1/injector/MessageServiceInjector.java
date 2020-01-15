package BehavioralPatterns.dependencyinjection.ex1.injector;

import BehavioralPatterns.dependencyinjection.ex1.consumer.Consumer;

public interface MessageServiceInjector {

    Consumer getConsumer();
}
