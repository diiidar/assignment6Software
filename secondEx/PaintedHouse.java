package assignment6Software.secondEx;

class PaintedHouse extends HouseDecorator {
    private String color;

    public PaintedHouse(House house, String color) {
        super(house);
        this.color = color;
    }

    // Adding the color to the house description
    @Override
    public String getDescription() {
        return super.getDescription() + " painted " + color;
    }
}
