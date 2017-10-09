package py.com.snowtech.demo;

import java.util.ArrayList;
import java.util.List;

public class Publisher {

    private List<Subscriber> subscribers = new ArrayList<>();
    
    public void publish(String message) {
        
    }

    public void add(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

}
