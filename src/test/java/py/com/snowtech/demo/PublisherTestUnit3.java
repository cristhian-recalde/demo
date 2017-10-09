package py.com.snowtech.demo;

import org.jmock.Expectations;

public class PublisherTestUnit3 extends QMockB {

    public void testOneSubscriberReceivesAMessage() {
        // set up
        final Subscriber subscriber = mock(Subscriber.class);

        Publisher publisher = new Publisher();
        publisher.add(subscriber);
        
        final String message = "message";
        
        // expectations
        checking(new Expectations() {{
            oneOf (subscriber).receive(message);
        }});

        // execute
        publisher.publish(message);
    }

}
