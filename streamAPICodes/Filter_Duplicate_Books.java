/**
 * 
 */
package streamAPICodes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Sujan5
 *
 */
public class Filter_Duplicate_Books {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Book> books = new ArrayList<>();
		
		IntStream.range(1, 4).forEach(s->books.add(new Book(s%2,"Book" + s)));
		
		books.stream().collect(Collectors.groupingBy(Book::getBookID)).entrySet()
			.stream().filter(b->b.getValue().size()==1)
			.forEach(b->System.out.println(b.getKey() + " " + b.getValue().get(0).getBookName()));
	}

}

class Book {
	
	private int bookID;
	private String bookName;
	public Book(int bookID, String bookName) {
		super();
		this.bookID = bookID;
		this.bookName = bookName;
	}
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	@Override
	public String toString() {
		return "Book [bookID=" + bookID + ", bookName=" + bookName + "]";
	}
	
	
	
}