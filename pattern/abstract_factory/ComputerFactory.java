package pattern.abstract_factory;

public interface ComputerFactory {

	public Computer createComputer(int ram, int hdd, String cpu);
	
}
