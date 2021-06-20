
public class Circle extends Shape{
	
	private int radius;
	
	public Circle(int x, int y, String color, int radius) {
		super(x, y, color);
		this.radius = radius;
	}

	@Override
	public Shape clone() {
		return new Circle(this.x, this.y, this.color, this.radius);
	}
	
}
