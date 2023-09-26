package src.Project6;

// Абстрактный класс Dish
abstract class Dish {
    private String material;

    public Dish(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    abstract void use();
}

// Класс для тарелки
class Plate extends Dish {
    private int diameter;

    public Plate(String material, int diameter) {
        super(material);
        this.diameter = diameter;
    }

    @Override
    void use() {
        System.out.println("Using a plate made of " + getMaterial() + " with a diameter of " + diameter + " cm.");
    }
}

// Класс для чашки
class Cup extends Dish {
    private boolean handle;

    public Cup(String material, boolean handle) {
        super(material);
        this.handle = handle;
    }

    @Override
    void use() {
        if (handle) {
            System.out.println("Using a cup with a handle made of " + getMaterial() + ".");
        } else {
            System.out.println("Using a handleless cup made of " + getMaterial() + ".");
        }
    }
}

