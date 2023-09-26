package src.Project6;

class Table extends Furniture {
    private int numberOfLegs;

    public Table(String type, int numberOfLegs) {
        super(type);
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    void displayInfo() {
        System.out.println("This is a " + getType() + " with " + numberOfLegs + " legs.");
    }
}



