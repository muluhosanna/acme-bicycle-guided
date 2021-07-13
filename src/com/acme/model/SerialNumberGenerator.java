package com.acme.model;

public class SerialNumberGenerator {
    private static SerialNumberGenerator one;
private static String modelNumber;
private static int  start;
    private SerialNumberGenerator(){}
    public static synchronized SerialNumberGenerator getInstance(String model, int startNumber) {
        modelNumber = model;
        start = startNumber;
        if (one == null) {
            one = new SerialNumberGenerator();
        }
        return one;
    }
    public synchronized String getNextSerial(){return modelNumber + ++start;}
    public synchronized int getRecentNumber(){ return start;}
}
