/*
* Author: Allen Mutiso
* MTSALL002
* 22-September-2026
* Child of Part.Java
* Specialization propertie(s): N/A
*/

public class Accessory extends Part{
    
    public Accessory(String color, String manufacturer, int serialNumber) {
        super(color, manufacturer, serialNumber);
    }

    public Accessory () {
        super();
    }

    public Accessory (Accessory otherAccessory) {
        super(otherAccessory);
    }

    @Override
    public boolean equals(Object otherObject) {
        if (otherObject == this) return true;
        if (!(otherObject instanceof Accessory)) return false;

        // Call the equals method in Part.java
        return super.equals(otherObject); 
}

    public String toString() {
        return String.format("Accessories: %d, %s, %s", getSerialNumber(), getManufacturer(), getColor());
    }
}
