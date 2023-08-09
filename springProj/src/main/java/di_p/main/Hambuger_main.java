package di_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di_p.HambugerSet;
import di_p.bicycle.Bicycle;

public class Hambuger_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = //context 생성했을때 기본생성자가 생성
		new ClassPathXmlApplicationContext("di_xml/hambuger.xml");
		
		HambugerSet hs1 = (HambugerSet)context.getBean("hs1");
		

		System.out.println(hs1);

	}

}
