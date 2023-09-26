package src.Project6;

// Абстрактный класс Dog
abstract class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void bark();
}

// Класс для породы собаки - Лабрадор
class Labrador extends Dog {
    public Labrador(String name) {
        super(name);
    }

    @Override
    void bark() {
        System.out.println(getName() + " the Labrador is barking.");
    }
}

// Класс для породы собаки - Ши-тцу
class ShihTzu extends Dog {
    public ShihTzu(String name) {
        super(name);
    }

    @Override
    void bark() {
        System.out.println(getName() + " the Shih Tzu is barking.");
    }
}

