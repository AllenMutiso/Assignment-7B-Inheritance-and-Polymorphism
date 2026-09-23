/*
* Author: Allen Mutiso
* MTSALL002
* 22-September-2026
* Child of Part.Java
* Specialization propertie(s): size(int)
*/

public class Screen extends Part{
    private int size;

    //Standard constuctor
    public Screen (String color, String manufacturer, int serialNumber, int size) {
        super(color, manufacturer, serialNumber);
        this.size = size;
    }

    //No-argument constructor
    public Screen () {
        super();
        this.size = 0;
    }

    //Copy constructor
    public Screen (Screen otherScreen) {
        super(otherScreen);
        this.size = otherScreen.size;
    }

    //Accessor method
    public int getSize () {return size;}

    //Modifier method
    public  void setSize (int newSize) {this.size = newSize;}

    @Override 
    public boolean equals (Object otherObject) {
        if (otherObject == this) return true; 
        if (otherObject == null) return false;
        if (!(otherObject instanceof Screen)) return false;

        Screen otherScreen = (Screen) otherObject;
        return (this.getColor().equals(otherScreen.getColor()) &&
        this.getManufacturer().equals(otherScreen.getManufacturer()) &&
        this.getSerialNumber() == otherScreen.getSerialNumber() &&
        this.getSize() == otherScreen.getSize());
    }

    public String toString () {
        return String.format("Screen: %d, %s, %s, %d", getSerialNumber(), getManufacturer(), getColor(), getSize());
    }
}
