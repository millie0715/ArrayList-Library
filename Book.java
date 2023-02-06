package arrayList_library;

import java.util.Random;

public class Book {
	private String bookName;
	private int publicationYear;
	private int page;
	private String subject;
	private double rating;
	
	private static final String[] subjectType = {"Programming", "Data Structures", "Algorithms", "Operating Systems", "Gaming"};
	private static int[] subjectTypeNumber = {0, 0, 0, 0, 0};
	private static boolean[] generatedNumbers = new boolean[40];
    private static Random random = new Random();
	
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
		int randomIndex = random.nextInt(subjectType.length);
        while (subjectTypeNumber[randomIndex] >= 5) {
            randomIndex = random.nextInt(subjectType.length);
        }
        subjectTypeNumber[randomIndex]++;
        return subjectType[randomIndex];
	}
	
	public int choosePublicationYear() {
		int randomNumber = 1980 + random.nextInt(40);
        while (generatedNumbers[randomNumber - 1980]) {
            randomNumber = 1980 + random.nextInt(40);
        }
        generatedNumbers[randomNumber - 1980] = true;
        return randomNumber;
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
