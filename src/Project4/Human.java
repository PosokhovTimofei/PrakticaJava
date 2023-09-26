package src.Project4;

public class Human {
    private Head head;
    private Leg leftLeg;
    private Leg rightLeg;
    private Hand leftHand;
    private Hand rightHand;

    public Human(Head head, Leg leftLeg, Leg rightLeg, Hand leftHand, Hand rightHand) {
        this.head = head;
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
        this.leftHand = leftHand;
        this.rightHand = rightHand;
    }

    // Методы для доступа к свойствам головы, ног и рук
    // (геттеры и сеттеры)

    public void introduce() {
        System.out.println("This is a human with " + head.getHairColor() + " hair.");
        System.out.println("Left leg length: " + leftLeg.getLength() + " cm");
        System.out.println("Right leg length: " + rightLeg.getLength() + " cm");
        System.out.println("Left hand type: " + leftHand.getHandType());
        System.out.println("Right hand type: " + rightHand.getHandType());
    }

}


