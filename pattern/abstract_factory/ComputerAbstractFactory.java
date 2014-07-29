package pattern.abstract_factory;

import pattern.factory.ShapeType;

public abstract class ComputerAbstractFactory {

	public static ComputerFactory getFactory(FactoryType factory){
		
		ComputerFactory factory3 = null;
		
		for(FactoryType factory2 : FactoryType.values()){
			if(factory2.equals(factory)) {
				factory3 = factory2.getFactory();
			}
		}
		
		return factory3;
		
	}
	
	
}
