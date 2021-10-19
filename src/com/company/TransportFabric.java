package com.company;

public class TransportFabric {

    public Transport createTransport(TransportType type) {
        return switch (type) {
            case Motorcycle -> new Motorcycle("Мотоцикл", 2, 120, 50);
            case Scooter -> new Scooter("Самокат", 2, 40, 120, 150);
            case Car -> new Car("Автомобиль", 4, 150, "Пикап");
            case Bus -> new Bus("Автобус", 4, 100, "Школьный");
        };
    }
}

