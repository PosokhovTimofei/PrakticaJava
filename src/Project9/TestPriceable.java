package src.Project9;

public class TestPriceable {
    public static void main(String[] args) {
        // Создаем объекты классов Product и Service
        Priceable product = new Product("Laptop", 999.99);
        Priceable service = new Service("Plumbing", 50.0);

        // Проверяем метод getPrice() для каждого объекта и сравниваем с ожидаемыми значениями
        checkPrice(product, 999.99);
        checkPrice(service, 50.0);
    }

    // Метод для проверки метода getPrice() объекта и сравнения с ожидаемым значением
    private static void checkPrice(Priceable priceable, double expectedPrice) {
        double actualPrice = priceable.getPrice();
        if (actualPrice == expectedPrice) {
            System.out.println("Test passed for price " + expectedPrice);
        } else {
            System.out.println("Test failed for price " + expectedPrice);
        }
    }
}
