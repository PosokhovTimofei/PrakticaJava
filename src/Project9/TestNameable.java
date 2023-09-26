package src.Project9;

public class TestNameable {
    public static void main(String[] args) {
        // Создаем объекты классов Planet, Animal и Car
        Nameable planet = new Planet("Earth");
        Nameable animal = new Animal("Lion");
        Nameable car = new Car("Toyota");

        // Проверяем метод getName() для каждого объекта и сравниваем с ожидаемыми значениями
        checkName(planet, "Earth");
        checkName(animal, "Lion");
        checkName(car, "Toyota");
    }

    // Метод для проверки метода getName() объекта и сравнения с ожидаемым значением
    private static void checkName(Nameable nameable, String expectedName) {
        String actualName = nameable.getName();
        if (actualName.equals(expectedName)) {
            System.out.println("Test passed for " + expectedName);
        } else {
            System.out.println("Test failed for " + expectedName);
        }
    }
}

