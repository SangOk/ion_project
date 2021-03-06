package ex03.danot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=
				new AnnotationConfigApplicationContext(ApplicationContext.class);
		
		Mycats catsInfo = ctx.getBean("cat2",Mycats.class);
		catsInfo.catsInfoPrint();
		
		//org.springframework.context.ApplicationContext catsInfo2 = new ClassPathXmlApplicationContext("ex03/danot/ctx.xml");
		String configcontext = "classpath:ex03/danot/ctx.xml";
		
		AbstractApplicationContext context = new GenericXmlApplicationContext(configcontext);
		
		Mycats mycats = context.getBean("cat3", Mycats.class);
		
		mycats.setColor("blue");
		mycats.catsInfoPrint();
		
		context.close();
	}
}
