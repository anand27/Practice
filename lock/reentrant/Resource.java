package lock.reentrant;
import java.util.LinkedList;
import java.util.List;


public class Resource {

	int data;
	List<String> lastModifiedBy;
	
	public Resource(int val) {
		this.data = val;
		this.lastModifiedBy = new LinkedList<String>();
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public List<String> getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(String modifyingThread) {
		this.lastModifiedBy.add(modifyingThread);
	}
	
	
}
