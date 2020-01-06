/*
 * Author: Introduction to Java Programming 10th edition Y. Daniel Liang
 * Date: 01-06-2020
 * 
 * This class defines an object that represents a geometric object.
 * 
 * I'm am using Daniel Liang work in conjunction with exercise 11-1 that
 * requires use of GeometricObject from class Triangle.
 */

public class GeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;
    
    /** Construct a default geometric object */
    public GeometricObject() {
      dateCreated = new java.util.Date();
    }
    
    /** Construct a geometric object with the specified color 
      *  and filled value */
    public GeometricObject(String color, boolean filled) {
      dateCreated = new java.util.Date();
      this.color = color;
      this.filled = filled;
    }
  
    /** Return color */
    public String getColor() {
      return color;
    }
  
    /** Set a new color */
    public void setColor(String color) {
      this.color = color;
    }
  
    /** Return filled. Since filled is boolean, 
       its getter method is named isFilled */
    public boolean isFilled() {
      return filled;
    }
  
    /** Set a new filled */
    public void setFilled(boolean filled) {
      this.filled = filled;
    }
    
    /** Get dateCreated */
    public java.util.Date getDateCreated() {
      return dateCreated;
    }
    
    /** Return a string representation of this object */ 
    public String toString() {
      return "created on " + dateCreated + "\ncolor: " + color + 
        " and filled: " + filled;
    }
}