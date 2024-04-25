package assignment6Software.secondEx;

class GardenHouse extends HouseDecorator {
    private String gardenType;

    public GardenHouse(House house, String gardenType) {
        super(house);
        this.gardenType = gardenType;
    }

    // Adding the garden type to the house description
    @Override
    public String getDescription() {
        return super.getDescription() + " with " + gardenType + " garden";
    }
}
