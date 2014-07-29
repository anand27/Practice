package pattern.factory;

public class FactoryTest {

	
	public static void main(String[] args) {
		
		Shape shape = ShapeFactory.getShape("circle");
		shape.draw();
		
		Shape shape2 = ShapeFactory.getShape("triangle");
		shape2.draw();
		
		Shape shape3 = ShapeFactory.getShape("rectangle");
		shape3.draw();
	}
	
}
