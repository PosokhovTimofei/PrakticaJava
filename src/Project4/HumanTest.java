package src.Project4;

public class HumanTest {
    public static void main(String[] args) {
        // Создаем объекты для головы, ног и рук
        Head head = new Head("Brown");
        Leg leftLeg = new Leg(80);
        Leg rightLeg = new Leg(81);
        Hand leftHand = new Hand("Left");
        Hand rightHand = new Hand("Right");

        // Создаем объект src.Project4.Human, используя созданные объекты для частей тела
        Human human = new Human(head, leftLeg, rightLeg, leftHand, rightHand);

        // Вызываем метод introduce() для отображения информации о человеке
        human.introduce();
    }
}

