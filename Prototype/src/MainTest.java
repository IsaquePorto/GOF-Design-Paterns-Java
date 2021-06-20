import java.util.ArrayList;
import java.util.List;

public class MainTest {
	public static void main(String[] args) {
		
		List<Shape> shapes = new ArrayList<Shape>();
		
		Circle circle = new Circle(10, 20, "Green", 5);
		shapes.add(circle);
		
		Rectangle rectangle = new Rectangle(5, 15, "Purple", 5, 15);
		shapes.add(rectangle);
		
		Rectangle rectangleCopy = (Rectangle) rectangle.clone();
		shapes.add(rectangleCopy);
		
		System.out.println(shapes.size());
		
	}
}
