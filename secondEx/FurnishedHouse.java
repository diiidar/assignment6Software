package assignment6Software.secondEx;


class FurnishedHouse extends HouseDecorator {
    private String furniture;

    public FurnishedHouse(House house, String furniture) {
        super(house);
        this.furniture = furniture;
    }

    // Adding the furniture to the house description
    @Override
    public String getDescription() {
        return super.getDescription() + " with " + furniture;
    }
}
