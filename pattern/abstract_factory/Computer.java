package pattern.abstract_factory;

public abstract class Computer {

	protected int RAM;
	protected int HDD;
	protected String CPU;
	private boolean SMPS;
	
	public Computer() {
		this.SMPS = true;
	}
	
	@Override
	public String toString() {
		return "Computer [RAM=" + this.RAM + "GB, HDD=" + this.HDD + "TB, CPU=" + this.CPU + " Intel]";
	}
	
}
