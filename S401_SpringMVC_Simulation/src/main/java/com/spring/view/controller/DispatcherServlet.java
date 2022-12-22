package com.spring.view.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DispatcherServlet() {	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		process(request, response);
	}

	private void process(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		//1. 클라이언트에 요청 path 정보를 추출함
		String uri = request.getRequestURI();
		System.out.println(uri);
		String path = uri.substring(uri.lastIndexOf("/")); // uri에서  마지막"/"에서 이후 정보 출력
		System.out.println(path);
		
		//2. 클라이언트의 요청 path에 따라 적절히 분기 처리 수행
		if (path.equals("/login.do")) {
			System.out.println("로그인 처리");
		} else if (path.equals("/logout.do")) {
			System.out.println("로그아웃 처리");
		} else if (path.equals("/insertBoard.do")) {
			System.out.println("보드 등록 처리");
		} else if (path.equals("/updateBoard.do")) {
			System.out.println("보드 수정 처리");
		} else if (path.equals("/getBoardList.do")) {
			System.out.println("보드 목록 검색 처리");
		}   
	}

}
