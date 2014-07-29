package pattern.iterator;

public class IteratorTest {

	public static void main(String[] args) {
		
		MyCollection<String> coll = new ArrayCollection<String>();
		
		coll.addItem("anand");
		coll.addItem("karan");
		coll.addItem("divya");
		
		ItemIterator<String> iterator = coll.getIterator();
		
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
	}
}
