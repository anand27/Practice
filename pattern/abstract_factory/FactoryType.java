package pattern.abstract_factory;

public enum FactoryType {

	PC("ibm.pc"){

		@Override
		protected ComputerFactory getFactory() {
			return new PCFactory();
		}
		
	},
	SERVER("sun.server"){

		@Override
		protected ComputerFactory getFactory() {
			return new ServerFactory();
		}
		
	};
	
	private String computer;
	
	private FactoryType(String computerType) {
		this.computer = computerType;
	}
	
	public String getComputer() {
		return computer;
	}

	protected abstract ComputerFactory getFactory();
	
}
