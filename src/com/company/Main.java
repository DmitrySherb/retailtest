package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        TransportFabric fabric = new TransportFabric();
        List<Transport> transports = new ArrayList<>();
        TransportType[] transportTypes = TransportType.values();

        for (String arg : args) {
            try {
                transports.add(fabric.createTransport(transportTypes[Integer.parseInt(arg)]));
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("НЕИЗВЕСТНЫЙ ТИП ТРАНСПОРТА C ТИПОМ: " + arg);
            } catch (NumberFormatException e) {
                System.out.println("НЕВЕРНЫЙ ФОРМАТ: " + arg);
            }
        }

        for (Transport transport : transports) {
            System.out.println(transport);
        }
    }
}
