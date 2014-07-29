package pattern.iterator;

public interface ItemIterator<T> {

	public boolean hasNext();
    
    public T next();
    
}
