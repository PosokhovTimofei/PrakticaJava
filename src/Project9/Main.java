package src.Project9;

// Интерфейс Nameable
interface Nameable {
    String getName();
}

// Пример реализации интерфейса для класса Planet
class Planet implements Nameable {
    private String name;

    public Planet(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

// Пример реализации интерфейса для класса Animal
class Animal implements Nameable {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

// Пример реализации интерфейса для класса Car
class Car implements Nameable {
    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    @Override
    public String getName() {
        return brand;
    }
}
