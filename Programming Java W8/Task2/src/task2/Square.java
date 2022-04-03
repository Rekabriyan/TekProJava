/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task2;

/**
 *
 * @author hp
 */
public class Square extends Rectangle {
    // Constructor
    public Square() {
        super();
    }
    
    public Square(double side) {
        super(side, side);
    }
    
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    
    // Getter and Setter
    public double getSide() {
        return super.getWidth();
    }
    
    public void setSide(double side) {
        super.setWidth(side);
    }
    
    public void setWidth(double side) {
        super.setWidth(side);
    }
    
    public void setLength(double side) {
        super.setLength(side);
    }
    
    /** Return a self-descriptive string of this instance in the form of 
    Square[Shape[color=?, filled=?, side=?]] */
    public String toString() {
        return "A Square with side = " + getSide() + ", which is a subclass of " 
                + super.toString();
    }
}
