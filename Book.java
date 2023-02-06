package arrayList_library;

public class Book {
	private String bookName;
	private int publicationYear;
	private int page;
	private String subject;
	private double rating;
	
	String[] subjectType = {"Programming", "Data Structures", "Algorithms", "Operating Systems", "Gaming"};
	int[] subjectTypeNumber = {0, 0, 0, 0, 0};
	int[] publicationYearNumber = {0, 0, 0, 0, 0 ,0, 0, 0, 0, 0, 0, 0, 0, 0, 0 ,0, 0, 0, 0, 0, 0, 0, 0, 0, 0 ,0, 0, 0, 0, 0, 0, 0, 0, 0, 0 ,0, 0, 0, 0, 0};
	
	public Book(String bn, double r) {
		bookName = bn;
		publicationYear = choosePublicationYear();//1980 to 2019
		page = (int)(Math.random()*951) + 50;//50 to 1000 
		subject = chooseSubject();
		rating = r;//0.1 to 10.0
	}
	
	public Book(String bn, int py, int p, String s, double r) {
		bookName = bn;
		publicationYear = py;
		page = p;
		subject = s;
		rating = r;
	}
	
	public String chooseSubject() {
		int i = (int)(Math.random()* 5);
		if(subjectTypeNumber[i] < 5) {
			subjectTypeNumber[i] ++;
			return subjectType[i];
		}
		return chooseSubject();
	}
	
	public int choosePublicationYear() {
        int r = (int) (Math.random() * 40);
        if(publicationYearNumber[r] == 0) {
        	publicationYearNumber[r] = 1;
        	return r + 1980;
        }
        return choosePublicationYear();
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public int getPublicationYear() {
		return publicationYear;
	}
	
	public int getPage() {
		return page;
	}
	
	public double getRating() {
		return rating;
	}
	
	public String getSubject() {
		return subject;
	}

}
