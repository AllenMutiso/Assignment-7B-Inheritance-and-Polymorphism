/*
Author: Allen Mutiso
MTSALL002
22-September-2026
The base class from which box, accessory and screen are derived.
Contains the properties color, manufactrer, serialNumber that are common for all the derived classes.
*/

public class Part {
    private String color;
    private String manufacturer;
    private int serialNumber;

    //Standard constructor
    public Part(String color, String manufacturer, int serialNumber) {
        this.color = color;
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
    }

    //No-argument constructor
    public Part () {
        this.color = "";
        this.manufacturer = "";
        this.serialNumber = 0;
    }

    //Copy constructor.
    public Part (Part otherItem) {
        if (otherItem.getClass() != this.getClass()) {
            throw new IllegalArgumentException("Parameter has to be of class Question1");
        } else {
            this.color = otherItem.color;
            this.manufacturer = otherItem.manufacturer;
            this.serialNumber = otherItem.serialNumber;
        }
    }

    //Accessor methods.
    public String getColor () {return color;}
    public String getManufacturer () {return manufacturer;} 
    public int getSerialNumber () {return serialNumber;}

    //Setter methods.
    public void setColor (String newColor) {this.color = newColor;}
    public void setManufacturer(String newManufacturer) {this.manufacturer = newManufacturer;}
    public void setSerialNumber(int newSerialNumber) {this.serialNumber = newSerialNumber;}

    //Equals method
    public boolean equals(Object otherObject) {
        if (otherObject == null) {
            return false;
        } 
        // Casting otherObject to otherItem of type Part.
        Part otherItem = (Part) otherObject;
        return (this.getColor().equals(otherItem.getColor()) &&
        this.getManufacturer().equals(otherItem.getManufacturer()) &&
        this.getSerialNumber() == this.getSerialNumber());
    }
  
     public String toString (Part otherPart) {
        return String.format("Box: %d, %s, %s", getSerialNumber(), getManufacturer(), getColor());
    }
}
