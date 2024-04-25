package assignment6Software.secondEx;

public class main {
    public static void main(String[] args) {
        // Creating a basic house
        House basicHouse = new BasicHouse();

        // Decorating the basic house with features
        House paintedHouse = new PaintedHouse(basicHouse, "blue");
        House furnishedHouse = new FurnishedHouse(basicHouse, "modern furniture");
        House luxuriousHouse = new GardenHouse(new FurnishedHouse(new PaintedHouse(basicHouse, "white"), "vintage furniture"), "landscaped");

        // Printing the descriptions of different houses
        System.out.println("Basic House Description: " + basicHouse.getDescription());
        System.out.println("Painted House Description: " + paintedHouse.getDescription());
        System.out.println("Furnished House Description: " + furnishedHouse.getDescription());
        System.out.println("Luxurious House Description: " + luxuriousHouse.getDescription());
    }
}
