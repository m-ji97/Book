package com.javaex.book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookSelect2 {

	public static void main(String[] args) {
		
		List<BookVo> booklist = new ArrayList<BookVo>();

		// 0. import java.sql.*;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			// 1. JDBC 드라이버 (Oracle) 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. Connection 얻어오기
			String url = "jdbc:mysql://localhost:3306/book_db";
			conn = DriverManager.getConnection(url, "book", "book");
			
			// 3. SQL문 준비 / 바인딩 / 실행
			String query = "";
			query += " select book_id, ";
			query += " 		  book_name, ";
			query += " 		  book_desc, ";
			query += " 		  from Book ";
			
			//바인딩
			pstmt = conn.prepareStatement(query);
			
			//실행
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int no = rs.getInt("book_id");
				String name = rs.getString("book_name");
				String desc = rs.getString("book_desc");
				
				BookVo bookvo = new BookVo(no, name, desc);
				
				booklist.add(bookvo);
			}	
			
			// 4.결과처리
			System.out.println(booklist.toString());
			for(int i =0; i<booklist.size(); i++) {
				int no = booklist.get(i).getBook_id();
				String name = booklist.get(i).getBook_Name();
				String desc = booklist.get(i).getBook_Desc();
				
				System.out.println(no+'\t'+name+'\t'+desc);
			}
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("error: 드라이버 로딩 실패 - " + e);
		} catch (SQLException e) {
			System.out.println("error:" + e);
		} finally {
			// 5. 자원정리
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				System.out.println("error:" + e);
			}
		}
	}

}
