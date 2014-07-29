package pattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class ArrayCollection<E> implements MyCollection<E>{

	private List<E> array;
	
	public ArrayCollection() {
		this.array = new ArrayList<E>();
	}
	
	@Override
	public void addItem(E item) {
		this.array.add(item);
	}

	@Override
	public void removeItem(Object item) {
		this.array.remove(item);
	}

	@Override
	public ItemIterator<E> getIterator() {
		return new ArrayIterator<E>();
	}

	private class ArrayIterator<W> implements ItemIterator<W>{

		private int position;
		
		@Override
		public boolean hasNext() {
			while(position < array.size()){
				return true;
			}
			return false;
		}

		@SuppressWarnings("unchecked")
		@Override
		public W next() {
			W item = (W) array.get(position);
			position++;
			return item;
		}
		
	}
}
