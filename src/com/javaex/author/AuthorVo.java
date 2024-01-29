package com.javaex.author;

public class AuthorVo {
	
	//필드
	private int authorid;
	private String authorName;
	private String authorDesc;
	
	//생성자
	public AuthorVo() {
		super();
	}
	
	public AuthorVo(int authorid, String authorName, String authorDest) {
		super();
		this.authorid = authorid;
		this.authorName = authorName;
		this.authorDesc = authorDest;
	}

	//메소드
	public int getAuthorid() {
		return authorid;
	}

	public void setAuthorid(int authorid) {
		this.authorid = authorid;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getAuthorDest() {
		return authorDesc;
	}

	public void setAuthorDest(String authorDest) {
		this.authorDesc = authorDest;
	}

	//메소드 일반
	@Override
	public String toString() {
		return "AuthorVo [authorid=" + authorid + ", authorName=" + authorName + ", authorDesc=" + authorDesc + "]";
	}

	
}
