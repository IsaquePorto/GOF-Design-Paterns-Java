
public class Rectangle extends Shape{
	
	private int width;
	private int height; 
	
	public Rectangle(int x, int y, String color, int width, int height) {
		super(x, y, color);
		this.width = width;
		this.height = height;
	}

	@Override
	public Shape clone() {
		
		return new Rectangle(this.x, this.y, this.color, this.height, this.width);
	}

}
