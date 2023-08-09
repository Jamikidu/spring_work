package di_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di_p.bicycle.Bicycle;
import di_p.bicycle.InterBiCycle;
import di_p.bicycle.Wheel;

public class Bicycle_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("------------------------------------------");
		AbstractApplicationContext context = //context 생성했을때 기본생성자가 생성
				new ClassPathXmlApplicationContext("di_xml/bicycle.xml");
		
		System.out.println("------------------------------------------");
		
		Bicycle bi1 = (Bicycle)context.getBean("bi1");
		Bicycle bi2 = (Bicycle)context.getBean("bi2");
		Bicycle bi3 = (Bicycle)context.getBean("bi3");
		

		System.out.println(bi1);
		System.out.println(bi2);
		System.out.println(bi3);

		/* 출력1 */
		for (String str : "bi1,bi2,bi3".split(",")) {
			Bicycle bc = context.getBean(str,Bicycle.class);
			System.out.println(bc);
		}
		
		/*출력2
		for (String str : "bi1,bi2,bi3".split(",")) {
			InterBiCycle bc = context.getBean(str,InterBiCycle.class);
			System.out.println(bc);
		}
		*/
	}

}
