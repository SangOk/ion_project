package ex01.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ex01/di/ctx.xml","ex01/di/applicationctx.xml");
		//ApplicationContext context = new ClassPathXmlApplicationContext("ex01/di/ctx.xml");
		
		MessageBeanImpl bean = context.getBean("messageBeanImpl", MessageBeanImpl.class);
		bean.sayHello();
		
		MessageBeanImpl bean2 = context.getBean("m2", MessageBeanImpl.class);
		bean2.sayHello();
	}
}
