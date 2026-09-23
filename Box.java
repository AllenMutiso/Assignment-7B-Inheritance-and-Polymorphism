/*
Author: Allen Mutiso
MTSALL002
22-September-2026
Child of Part.Java
Specialization propertie(s): memory(int)
*/

public class Box extends Part {
    private int memory;
        
    public Box (String color, String manufacturer, int serialNumber, int memory) {
        super(color, manufacturer, serialNumber);
        this.memory = memory;
    }

    public Box () {
        super();
        this.memory = 0;
    }

    public Box (Box otherBox) {
        super(otherBox);
        this.memory = otherBox.memory;
    }

    public int getMemory () {return memory;}

    @Override 
    public boolean equals (Object otherObject) {
        if (otherObject == null) {
            return false;
        } 
        Box otherBox = (Box) otherObject;
        return (this.getColor().equals(otherBox.getColor()) &&
        this.getManufacturer().equals(otherBox.getManufacturer()) &&
        this.getSerialNumber() == this.getSerialNumber() &&
        this.getMemory() == otherBox.getMemory());
    }

    public String toString () {
        return String.format("Box: %d, %s, %s, %d", getSerialNumber(), getManufacturer(), getColor(), getMemory());
    } 
}
