package pattern.iterator;

public interface MyCollection<T> {

	public void addItem(T item);
	
	public void removeItem(Object item);
	
	public ItemIterator<T> getIterator();
	
}
