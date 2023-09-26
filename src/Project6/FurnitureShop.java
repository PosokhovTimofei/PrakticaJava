package src.Project6;

class FurnitureShop {
    public void sellFurniture(Furniture furniture) {
        System.out.println("Selling " + furniture.getType());
        furniture.displayInfo();
    }
}
