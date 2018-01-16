package com.koitt.java.board.controller;

import java.util.Scanner;

import com.koitt.java.board.service.BoardService;

public class BoardController {
	
	private BoardService service;
	private Scanner input;
	
	public BoardController( ) {
		this.service = new BoardService();
		this.input = new Scanner(System.in);
	}
	
	public static void main(String[] args) {
	
		BoardController controller = new BoardController();
		
		
	}
}
