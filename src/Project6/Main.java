package src.Project6;

public class Main {
    public static void main(String[] args) {
        // Тестирование посуды
        Dish plate = new Plate("Ceramic", 20);
        Dish cup = new Cup("Glass", false);

        plate.use();
        cup.use();

        // Тестирование собак
        Dog labrador = new Labrador("Max");
        Dog shihTzu = new ShihTzu("Bella");

        labrador.bark();
        shihTzu.bark();

        // Тестирование мебели
        Furniture table = new Table("Dining Table", 4);

        FurnitureShop shop = new FurnitureShop();
        shop.sellFurniture(table);
    }
}
