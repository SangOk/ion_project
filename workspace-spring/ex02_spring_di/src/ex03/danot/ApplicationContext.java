package ex03.danot;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationContext {
	@Bean
	public Mycats cat2() {
		ArrayList<String> hobbys = new ArrayList(); 
		hobbys.add("?ڲ???");
		hobbys.add("?߱???");
		
		Mycats myCats = new Mycats("????",13,hobbys);
		myCats.setWeight(15.3f);
		myCats.setColor("brawn");
		return myCats;
	}
	
}
