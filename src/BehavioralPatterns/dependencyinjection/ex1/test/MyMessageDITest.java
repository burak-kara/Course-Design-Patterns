package BehavioralPatterns.dependencyinjection.ex1.test;

import BehavioralPatterns.dependencyinjection.ex1.consumer.Consumer;
import BehavioralPatterns.dependencyinjection.ex1.injector.EmailServiceInjector;
import BehavioralPatterns.dependencyinjection.ex1.injector.MessageServiceInjector;
import BehavioralPatterns.dependencyinjection.ex1.injector.SMSServiceInjector;
import BehavioralPatterns.dependencyinjection.ex1.injector.WhatsappInjector;

public class MyMessageDITest {

    public static void main(String[] args) {
        String msg = "Hi Pankaj";
        String email = "pankaj@abc.com";
        String phone = "4088888888";
        Consumer app;

        //Send email
        MessageServiceInjector injector = new EmailServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, email);

        //Send SMS
        injector = new SMSServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, phone);

        //Send Whatsapp
        injector = new WhatsappInjector();
        app = injector.getConsumer();
        app.processMessages(msg, phone);

    }
}
