package com.study.springboot.bean;

import org.springframework.stereotype.Component;

@Component("printerA")
public class PrinterA implements Printer {

	@Override
	public void print(String message) {
		System.err.println("Printer A : " + message);
	}

}
