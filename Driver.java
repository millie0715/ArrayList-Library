package arrayList_library;

import java.util.Scanner;;

public class Driver {
	public static void main(String[] args) {
		BookList list = new BookList();
		list.addOriginalBooks();
		list.listAllDetailsForAllBooks();
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		while(number > 0) {
			if(number == 1) {
				list.listAllBooks();}
			else if(number == 2) {
				list.listAllBooksByPublicationDate();}
			else if(number == 3) {
				list.listAllBooksByLength();}
			else if(number == 4) {
				list.listAllBooksByRating();}
			else if(number == 5) {
				list.sortBooksWithSubject();}
			else if(number == 6) {
				list.listAllDetailsForABook();}
			else if(number == 7) {
				list.addBook();}
			else if(number == 8) {
				break;}
			number = input.nextInt();
		}
	}
}
