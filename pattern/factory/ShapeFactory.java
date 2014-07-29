package pattern.factory;

public abstract class ShapeFactory {

	public static Shape getShape(String shape){
		
		Shape shapeTobeReturned = null;
		
		if(null==shape){
			return null;
		}
		
		for(ShapeType shape2 : ShapeType.values()){
			if(shape2.getShape().equals(shape))
				shapeTobeReturned =  shape2.getObject();
		}
		
		return shapeTobeReturned;
	}
}
