package pattern.abstract_factory;

public class ServerFactory implements ComputerFactory {

	@Override
	public Computer createComputer(int ram, int hdd, String cpu) {
		
		return new Server(ram, hdd, cpu);
	}

}
