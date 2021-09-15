package BookSearch;

class Book{
	private String BookName;
	private String Author;
	private String Publisher;
	private String PublishingYear;
	private int Page;
	private String LibraryName;
	private int ID;
	private String StorePlace;
	private int CheckOutNum;
	private boolean isCheckOut;

	public Book() {

	}
	public Book(String BookName,String Author,
			String Publisher,String PublishingYear,
			int Page,String LibraryName,int ID,
			String StorePlace,int CheckOutNum,boolean isCheckOut)
	{
		this.BookName=BookName;
		this.Author=Author;
		this.Publisher=Publisher;
		this.PublishingYear=PublishingYear;
		this.Page=Page;
		this.LibraryName=LibraryName;
		this.ID=ID;
		this.StorePlace=StorePlace;
		this.CheckOutNum=CheckOutNum;
		this.isCheckOut=isCheckOut;
	}

	public String getBookName() {
		return BookName;
	}
	public String getPublishingYear() {
		return PublishingYear;
	}
	
	public void showBookInfo() {
		System.out.printf("제목:%s\n", BookName);
		System.out.printf("저자:%s\n", Author);
		System.out.printf("출판사:%s\n", Publisher);
		System.out.printf("출판년도:%s\n", PublishingYear);
		System.out.printf("페이지:%d\n", Page);
		System.out.printf("도서관:%s\n", LibraryName);
		System.out.printf("아이디:%s\n", ID);
		System.out.printf("소장처:%s\n", StorePlace);
		System.out.printf("대출횟수:%d\n", CheckOutNum);
		System.out.printf("대출가능여부:%b\n", isCheckOut);	
		System.out.printf("----------------------\n");	
	}
}
//컨트롤+i : 들여쓰기