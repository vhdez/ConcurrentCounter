package edu.sla;

public class CounterDecrementer implements Runnable {
    Counter sharedCounter;

    CounterDecrementer(Counter theCounter) {
        sharedCounter = theCounter;
    }

    @Override
    public void run() {
        for (int j = 0; j < 20; j++) {
            System.out.print("Decrementing counter from " + sharedCounter.counter);
            sharedCounter.counter--;
            System.out.println(" to " + sharedCounter.counter);
        }
    }
}
