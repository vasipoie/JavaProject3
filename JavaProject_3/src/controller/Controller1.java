package controller;

import java.util.Scanner;

import util.JDBCUtil;
import util.View;

public class Controller1 {

	static JDBCUtil jdbc = JDBCUtil.getInstance();
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		/*
		 * 테이블 FREE_BOARD 만들기
		 * 
		 * 1. 전체 테이블 조회	READ -2,4
		 * 2. 상세 페이지 조회	READ
		 * 3. 게시판 글 신규 등록	CREATE
		 * 4. 게시판 글 수정	UPDATE
		 * 5. 게시판 글 삭제	DELETE
		 * 
		 * 1.
		 * 게시번호 	제목	작성자	작성시간	내용(10자만 출력)
		 * 3		게시글3		테스트1	2023-11-01	오늘 날씨는 ....
		 * 2		게시글2		테스트1 2023-11-01	오늘 날씨는 ....
		 * 1		게시글1		테스트1	2023-10-31	오늘 날씨는 ....
		 * 
		 * 
		 */
		
		new Controller1().start();
	}

	 void start() {
		View view = View.HOME;
		while(true){
			switch(view) {
			case HOME:
				view = home();
				break;
			}
		}
	}

	 View home() {
//		printHome();
		return null;
	}
	
}
