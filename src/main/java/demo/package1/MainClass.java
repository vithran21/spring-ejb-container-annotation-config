package demo.package1;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		ApplicationContext con = new AnnotationConfigApplicationContext(AnnotationConfiguration.class);

		System.out.println(con.getBean("mobile")); // using id

		ApplicationContext con2 = new AnnotationConfigApplicationContext(AnnotationConfiguration.class);

		System.out.println(con.getBeanDefinitionCount());
		System.out.println(Arrays.toString(con.getBeanDefinitionNames()));
	}

}
