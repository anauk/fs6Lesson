package io;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipeExample {

    public static void main(String[] args) throws IOException {

        final PipedOutputStream output = new PipedOutputStream();
        final PipedInputStream  input  = new PipedInputStream();

        Thread thread1 = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    output.write("Hello world, pipe!\n".getBytes());
                    Thread.sleep(1000);
                }
            } catch (IOException | InterruptedException e) {}
        });


        Thread thread2 = new Thread(() -> {
            try {
                int data = input.read();
                while(data != -1){
                    System.out.print((char) data);
                    data = input.read();
                }
            } catch (IOException e) { }
        });

        input.connect(output);

        thread1.start();
        thread2.start();
/*
        // don't work
        ExecutorService service = Executors.newFixedThreadPool(2);
        service.execute(thread1);
        service.execute(thread2);
*/
    }
}