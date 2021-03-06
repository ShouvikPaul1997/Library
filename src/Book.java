
public class Book implements Library {
	int bookId;
	String bookName;
	String authorName;
	int bookPrice;
	
	public Book(int bookId, String bookName, String authorName, int bookPrice) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
		this.bookPrice = bookPrice;
	}

	@Override
	public void rent(int day) {
		System.out.println("Your book name: "+bookName);
		System.out.println("Your book id: "+bookId);
		System.out.println("Your book author: "+authorName);
		System.out.println("Your book per day price: "+bookPrice);
		System.out.println("Item total: "+ bookPrice*day +"rs ");
	}
	
}
