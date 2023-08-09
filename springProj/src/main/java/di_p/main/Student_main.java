package di_p.main;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di_p.Class1;
import di_p.Student;
import teacher.di_p.Exam;
import teacher.di_p.Stud;

public class Student_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("di_xml/student.xml");
		
		
		//학생 5명 생성 및 출력 (총점,평균은 학생함수안에서 계산)
		/*
		Student std1 = context.getBean("std1",Student.class);
		Student std2 = context.getBean("std2",Student.class);
		Student std3 = context.getBean("std3",Student.class);
		Student std4 = context.getBean("std4",Student.class);
		Student std5 = context.getBean("std5",Student.class);

		
		System.out.println(std1);
		System.out.println(std2);
		System.out.println(std3);
		System.out.println(std4);
		System.out.println(std5);
		*/
		
		/*
		ArrayList kors = context.getBean("kors",ArrayList.class);
		System.out.println(kors);
		 */
		
		
		Class1 class1 = context.getBean("class1",Class1.class);
		System.out.println(class1);
		

		System.out.println("======================================================================");
		for (Student stu: context.getBean("class1", Class1.class).getSet()) {
			System.out.println(stu);
		}
		
		
	}

}
