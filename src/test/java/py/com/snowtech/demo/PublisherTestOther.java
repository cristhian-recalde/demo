package py.com.snowtech.demo;

import org.jmock.Expectations;
import org.jmock.Mockery;

import junit.framework.TestCase;

public class PublisherTestOther extends TestCase {
    Mockery context = new Mockery();

    public void testOneSubscriberReceivesAMessage() {
        // set up
        final Subscriber subscriber = context.mock(Subscriber.class);

        Publisher publisher = new Publisher();
        publisher.add(subscriber);

        final String message = "message";

        // expectations
        context.checking(new Expectations() {
            {
                oneOf(subscriber).receive(message);
            }
        });

        // execute
        publisher.publish(message);

        // verify
        context.assertIsSatisfied();
    }
}
