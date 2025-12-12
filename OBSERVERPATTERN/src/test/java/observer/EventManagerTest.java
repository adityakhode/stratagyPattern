package observer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.atomic.AtomicReference;

public class EventManagerTest {

    @Test
    public void testNotifyUpdateCallsObservers() {
        EventManager manager = new EventManager();

        AtomicReference<String> received = new AtomicReference<>(null);

        Observer testObserver = new Observer() {
            @Override
            public void update(String message) {
                received.set(message);
            }
        };

        manager.attach(testObserver);
        manager.notifyUpdate("hello-test");

        assertEquals("hello-test", received.get());
    }
}
