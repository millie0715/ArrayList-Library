package arrayList_library;

import java.util.Scanner;

public class BookList extends ArrayList<Object>{
	private ArrayList<Book> Books;
	
	public BookList() {
		
		Books = new ArrayList<Book>();
		
	}
	
	public void addOriginalBooks() {
		Books.add(new Book("Book1", 6.7));
		Books.add(new Book("Book2", 8.9));
		Books.add(new Book("Book3", 3.2));
		Books.add(new Book("Book4", 4.6));
		Books.add(new Book("Book5", 5.1));
		Books.add(new Book("Book6", 6.3));
		Books.add(new Book("Book7", 7.8));
		Books.add(new Book("Book8", 9.0));
		Books.add(new Book("Book9", 6.7));
		Books.add(new Book("Book10", 5.3));
		Books.add(new Book("Book11", 4.9));
		Books.add(new Book("Book12", 1.5));
		Books.add(new Book("Book13", 3.7));
		Books.add(new Book("Book14", 9.7));
		Books.add(new Book("Book15", 0.8));
		Books.add(new Book("Book16", 5.5));
		Books.add(new Book("Book17", 3.2));
		Books.add(new Book("Book18", 2.9));
		Books.add(new Book("Book19", 7.7));
		Books.add(new Book("Book20", 0.8));
	}
	
	public void addBook() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please type in the book's name: ");
		String bookName = input.nextLine();
		System.out.println("Please type in its publication year: ");
		int publicationYear = input.nextInt();
		System.out.println("Please type in its number of pages: ");
		int page = input.nextInt();
		System.out.println("Please type in its subject: ");
		input.nextLine();
		String subject = input.nextLine();
		System.out.println("Please type in its rating: ");
		double rating = input.nextDouble();
		Book a = new Book(bookName, publicationYear, page, subject, rating);
		Books.add(a);
	}
	
	public void listAllBooks() {
		for(int i = 0; i < Books.getSize(); i ++) {
			System.out.println("name: " + Books.get(i).getBookName()
					+ " publication year: " + Books.get(i).getPublicationYear()
					+ " page: " + Books.get(i).getPage()
					+ " subject: " + Books.get(i).getSubject()
					+ " rating: " + Books.get(i).getRating());
		}
	}
	
	public void listAllBooksByPublicationDate() {
		
		for(int i = 0; i < Books.getSize(); i ++) {
			for(int j = i + 1; j < Books.getSize(); j ++) {
				if(Books.get(j).getPublicationYear() < Books.get(i).getPublicationYear()) {
					Book temp = Books.get(i);
					Books.set(i, Books.get(j));
					Books.set(j, temp);
				}
			}
		}
		for(int i = 0; i < Books.getSize(); i ++) {
			System.out.println("name: " + Books.get(i).getBookName()
					+ " publication year: " + Books.get(i).getPublicationYear());
		}
	}
	
	public void listAllBooksByLength() {
		
		for(int i = 0; i < Books.getSize(); i ++) {
			for(int j = i + 1; j < Books.getSize(); j ++) {
				if(Books.get(j).getPage() < Books.get(i).getPage()) {
					Book temp = Books.get(i);
					Books.set(i, Books.get(j));
					Books.set(j, temp);
				}
			}
		}
		for(int i = 0; i < Books.getSize(); i ++) {
			System.out.println("name: " + Books.get(i).getBookName()
					+ " page: " + Books.get(i).getPage());
		}
	}
	
	public void listAllBooksByRating() {
		
		for(int i = 0; i < Books.getSize(); i ++) {
			for(int j = i + 1; j < Books.getSize(); j ++) {
				if(Books.get(j).getRating() > Books.get(i).getRating()) {
					Book temp = Books.get(i);
					Books.set(i, Books.get(j));
					Books.set(j, temp);
				}
			}
		}
		for(int i = 0; i < Books.getSize(); i ++) {
			System.out.println("name: " + Books.get(i).getBookName()
					+ " rating: " + Books.get(i).getRating());
		}
	}
	
	public void sortBooksWithSubject() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please type in the subject you want to search: ");
		String s = input.nextLine();
		String res = "";
		for(int i = 0; i < Books.getSize(); i ++) {
			if(Books.get(i).getSubject().equals(s)) {
				res += Books.get(i).getBookName() + " ";
			}
		}
		System.out.println(res);
	}
	
	public void listAllDetailsForABook() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please type in the book you want to search: ");
		String b = input.nextLine();
		String res = "";
		for(int i = 0; i < Books.getSize(); i ++) {
			if(Books.get(i).getBookName().equals(b)) {
				res += Books.get(i).getBookName() + " is a book about " + Books.get(i).getSubject()
						+ ". It published in " + Books.get(i).getPublicationYear()
						+ " and has " + Books.get(i).getPage() + " pages. "
						+ "Its rating is " + Books.get(i).getRating();
			}
		}
		System.out.println(res);
	}
	
}
