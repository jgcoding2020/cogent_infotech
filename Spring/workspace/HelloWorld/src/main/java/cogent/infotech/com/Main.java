package cogent.infotech.com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//Person class setter based injection
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("cogent/infotech/com/config.xml");
		Person p = (Person)ctx.getBean("person");
		System.out.println("Person id: " + p.getId());
		System.out.println("Person name: " + p.getName());
		System.out.println("Person age: " + p.getAge());
	}
}