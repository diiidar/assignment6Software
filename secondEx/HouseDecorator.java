package assignment6Software.secondEx;

abstract class HouseDecorator implements House {
    protected House house; // Reference to the house being decorated

    public HouseDecorator(House house) {
        this.house = house;
    }

    // Delegating the call to the decorated house
    @Override
    public String getDescription() {
        return house.getDescription();
    }
}
