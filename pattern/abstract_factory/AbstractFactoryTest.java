package pattern.abstract_factory;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		
		ComputerFactory cf = ComputerAbstractFactory.getFactory(FactoryType.PC);
		Computer c = cf.createComputer(4, 1, "i5");
		System.out.println(c.toString());
		
		ComputerFactory cf2 = ComputerAbstractFactory.getFactory(FactoryType.SERVER);
		Computer c2 = cf2.createComputer(20, 5, "i7");
		System.out.println(c2.toString());
	}
}
