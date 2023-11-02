package com.study.springboot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.study.springboot.bean.Config;
import com.study.springboot.bean.Member;
import com.study.springboot.bean.Printer;
import com.study.springboot.bean.PrinterB;

//@SpringBootApplication
public class Ex02JavaCodeDiApplication {

	public static void main(String[] args) {
		// SpringApplication.run(Ex02JavaCodeDiApplication.class, args);

		// 1. IoC 컨테이너 생성
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Member member1 = (Member) context.getBean("member1");
		member1.print();

		Member member2 = context.getBean("hello", Member.class);
		member2.print();

		//Printer printer = (Printer) context.getBean("printerB");
		//member1.setPrinter(printer);
		//member1.print();

		if (member1 == member2) {
			System.out.println("동일한 객체입니다.");
		} else {
			System.out.println("서로 다른 객체입니다.");
		}
	}

}
