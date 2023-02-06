package arrayList_library;


public interface ArrayInterface<E> {
	//two add methods for arraylist
	public void add(E a);//adds to the end of the list
	public void add(int index, E a);//overloaded method
	
	public E remove(int index);//remove item at index provided
	
	public E get(int index);
	public void set(int index, E a);
	
	public int getSize();
	public int indexOf(E a);

}
