package src.Project6;

// Абстрактный класс Furniture
abstract class Furniture {
    private String type;

    public Furniture(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    abstract void displayInfo();
}
