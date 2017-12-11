package edu.sla;

public class CounterIncrementer implements Runnable {
    Counter sharedCounter;

    CounterIncrementer(Counter theCounter) {
        sharedCounter = theCounter;
    }

    @Override
    public void run() {
        for (int j = 0; j < 20; j++) {
            System.out.print("Incrementing counter from " + sharedCounter.counter);
            sharedCounter.counter++;
            System.out.println(" to " + sharedCounter.counter);
        }
    }
}
