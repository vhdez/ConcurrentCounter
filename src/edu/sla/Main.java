package edu.sla;

public class Main {

    public static void main(String[] args) {
        Counter theCounter = new Counter();

        CounterIncrementer myIncrementer = new CounterIncrementer(theCounter);
        CounterDecrementer myDecrementer = new CounterDecrementer(theCounter);

        Thread incThread = new Thread(myIncrementer);
        // tell that thread to start incrementing counter
        incThread.start();

        Thread decThread = new Thread(myDecrementer);
        // tell that thread to start decrementing counter
        decThread.start();
    }
}
