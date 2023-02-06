package arrayList_library;


public class ArrayList<E> implements ArrayInterface<E> {
	private int size;
	private int capacity;
	private E[] myArray;
	
	public ArrayList() {
		this.capacity = 5;
		this.size = 0;
		myArray = (E[]) new Object[this.capacity];
	}
	
	public ArrayList(int conpacity) {
		this.size = 0;
		myArray = (E[]) new Object[this.capacity];
	}
	
	public void add(E a) {
		if(size < capacity) {
			myArray[size] = a;//set object at first empty space
			size ++;
		}
		else {
			//System.out.println("not enough space, resizing ArrayList");
			this.reallocate();
			this.add(a);
		}
	}
	
	public void reallocate() {
		//double capacity of ArrayLiat
		this.capacity *= 2;
		E[] temp = (E[]) new Object[this.capacity];
		//copy over the elements to new array
		for(int i = 0; i < myArray.length; i ++) {
			temp[i] = myArray[i];
		}
		this.myArray = temp;
	}
	
	public void add(int index, E a) {
		//check if index is valid
		if(index < 0 || index > size) {
			System.out.println("invalid index");
			return;
		}
		else if(index == size) {
			//adds to the end so we use existing add method
			this.add(a);
		}
		else {
			//shift all contents from index to the end by 1
			if(this.capacity == this.size) {
				//this means array is full
				this.reallocate();
			}
			for(int i = size; i > index; i --) {
				this.myArray[i] = this.myArray[i - 1];
			}
			this.myArray[index] = a; //add intended object to index
			this.size ++;
		}
	}
	
	public E remove(int i) {
		//invalid index: <0, >size
		if( i < 0 ||  i >= size) {
			System.out.println("invalid index");
			return null;
		}
		E temp = myArray[i];
		//then shift remaining elements to fill that empty space
		for(int index = i; index < size - 1;  i++) {
			this.myArray[index] = this.myArray[index + 1];
		}
		size --;
		return temp;
	}
	
	public E get(int index) {
		//index validity check
		if(index < 0 || index >= size) {
			System.out.println("invalid index");
			return null;
		}
		return myArray[index];
	}
	
	public void set(int index, E a) {
		if(index < 0 || index >= size) {
			System.out.println("invalid index");
			return;
		}
		myArray[index] = a;
	}
	
	public int getSize() {
		return this.size;
	}
	
	public int indexOf(E a) {
		//returns the index of the value being searched
		for(int i = 0; i < size; i ++) {
			if(myArray[i].equals(a)) {
				return i;
			}
		}
		return -1;//if nothing matches object
	}
	
	public int indexOf(E a, int index) {
		for(int i = index; i < size; i ++) {
			if(myArray[i].equals(a)) {
				return i;
			}
		}
		return -1;
	}
	
	public String toString() {
		//called by sysout.print()
		String s = "";
		for(int i = 0; i < size; i ++) {
			s += myArray[i] + "\n";
		}
		return s;
	}
	
	

}
