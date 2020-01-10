/*
 * Abstract Classes
 * 
 * UML has the abstract methods in italics.
 * 
 * Making a class abstract means that it is meant as a base for subclasses that are themselves supposed
 * to be used.
 */
public abstract class GeometricObject {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	// The constructors are only used by subclasses of geo thus they are protected.
	protected GeometricObject() {
		dateCreated = new java.util.Date();
	}
	
	protected GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	
	/* The implementation is determined by what type of geo it is, but all geos have an area and perimeter.
	 * The benefits of using abstract methods shines when using two subclasses in conjunction with each
	 * other in a method's parameters. (GeoObj obj1, GeoObj obj2) aka (circle object, rectangle object).
	 */
	public abstract double getArea();
	
	public abstract double getPerimeter();
}
