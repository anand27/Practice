package concurrent.synchronizer.exchanger;

public class Payload {

	String name;
	int size;
	
	public Payload(String name, int size) {
		super();
		this.name = name;
		this.size = size;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Payload [name=" + name + ", size=" + size + "]";
	}
	
}
