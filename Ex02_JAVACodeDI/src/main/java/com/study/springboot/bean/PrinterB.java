package com.study.springboot.bean;

public class PrinterB implements Printer {

	@Override
	public void print(String message) {
		System.err.println("Printer B : " + message);
	}

}
