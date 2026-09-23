/*
Author: Allen Mutiso
MTSALL002
22-September-2026
Child of Part.Java
Specialization propertie(s): N/A
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
}
