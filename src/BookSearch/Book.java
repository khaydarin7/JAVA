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
		System.out.printf("����:%s\n", BookName);
		System.out.printf("����:%s\n", Author);
		System.out.printf("���ǻ�:%s\n", Publisher);
		System.out.printf("���ǳ⵵:%s\n", PublishingYear);
		System.out.printf("������:%d\n", Page);
		System.out.printf("������:%s\n", LibraryName);
		System.out.printf("���̵�:%s\n", ID);
		System.out.printf("����ó:%s\n", StorePlace);
		System.out.printf("����Ƚ��:%d\n", CheckOutNum);
		System.out.printf("���Ⱑ�ɿ���:%b\n", isCheckOut);	
		System.out.printf("----------------------\n");	
	}
}
//��Ʈ��+i : �鿩����