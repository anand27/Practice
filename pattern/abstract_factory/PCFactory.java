package pattern.abstract_factory;

public class PCFactory implements ComputerFactory {

	@Override
	public Computer createComputer(int ram, int hdd, String cpu) {
		
		return new PC(ram, hdd, cpu);
	}

}
