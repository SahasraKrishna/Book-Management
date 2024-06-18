package bookmgmt;

import java.util.Scanner;

public class BookArrayDemo {
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
		System.out.print("no.of books:");
		int n=s.nextInt();
		Book[] books = new Book[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Title:");
			String title=s.nextLine();
			String titlev=s.nextLine();
			System.out.print("author:");
			String author=s.nextLine();
			System.out.print("price:");
			double price=s.nextDouble();
			System.out.print("rating:");
			double rating=s.nextDouble();
			books[i] = new Book(title, author, price, rating);
		}
		for (int i = 0; i < n; i++) {
            System.out.println(books[i]);
        }
	}
}
