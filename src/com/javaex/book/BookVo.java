package com.javaex.book;

public class BookVo {
	
	//필드
	private int book_id;
	private String book_Name;
	private String book_Desc;
	
	
	//생성자
	public BookVo() {
		super();
	}

	public BookVo(int book_id, String book_Name, String book_Desc) {
		super();
		this.book_id = book_id;
		this.book_Name = book_Name;
		this.book_Desc = book_Desc;
	}

	//메소드
	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public String getBook_Name() {
		return book_Name;
	}

	public void setBookName(String book_Name) {
		this.book_Name = book_Name;
	}

	public String getBook_Desc() {
		return book_Desc;
	}

	public void setBook_Desc(String book_Desc) {
		this.book_Desc = book_Desc;
	}

	//메소드 일반
	@Override
	public String toString() {
		return "BookVo [book_id=" + book_id + ", book_Name=" + book_Name + ", book_Desc=" + book_Desc + "]";
	}

}
