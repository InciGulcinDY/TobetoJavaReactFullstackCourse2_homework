package org.example.core.logging;

public class Mail implements Logger{
    @Override
    public void log(String data) {
        System.out.println("Mail has been sent " + data);
    }
}
