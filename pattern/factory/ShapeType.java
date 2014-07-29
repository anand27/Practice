package pattern.factory;

public enum ShapeType {

	CIRCLE("circle"){

		@Override
		protected Shape getObject() {
			return new Circle();
		}
		
	},
	TRIANGLE("triangle"){

		@Override
		protected Shape getObject() {
			return new Triangle();
		}
		
	},
	RECTANGLE("rectangle"){

		@Override
		protected Shape getObject() {
			return new Rectangle();
		}
		
	};
	
	private String shape;
	
	private ShapeType(String shape) {
		this.shape = shape;
	}
	
	public String getShape() {
		return shape;
	}


	protected abstract Shape getObject();
	
	
}
