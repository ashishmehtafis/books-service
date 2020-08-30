package books.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Book {


	private String id;
	private String bookName;
	private String author;
	private Long availableCopies;
	private Long totalCopies;
	
	public Book() {
		
	}
	
	public Book(String bookName, String author, Long availableCopies, Long totalCopies) {
		this.bookName = bookName;
		this.author = author;
		this.availableCopies = availableCopies;
		this.totalCopies = totalCopies;
	}

	@Id
	@Column(name = "book_id", nullable = false)
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@Column(name = "book_name", nullable = false)
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	@Column(name = "author", nullable = false)
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Column(name = "available_copies", nullable = false)
	public Long getAvailableCopies() {
		return availableCopies;
	}
	public void setAvailableCopies(Long availableCopies) {
		this.availableCopies = availableCopies;
	}
	
	@Column(name = "total_copies", nullable = false)
	public Long getTotalCopies() {
		return totalCopies;
	}
	public void setTotalCopies(Long totalCopies) {
		this.totalCopies = totalCopies;
	}
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", author=" + author + ", availableCopies=" + availableCopies
				+ ", totalCopies=" + totalCopies + "]";
	}	
}
