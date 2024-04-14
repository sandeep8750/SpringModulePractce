package in.ineuron.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.comp.EnggCourse;
import in.ineuron.comp.EnggCourse2;

public class ClientApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("in/ineuron/cfg/applicationContext2.xml");
		EnggCourse2 enggCourse = context.getBean("CS",EnggCourse2.class);
		System.out.println(enggCourse);
		((AbstractApplicationContext) context).close();
	}
}
