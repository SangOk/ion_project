package ex02.java.aop;

import java.lang.reflect.Proxy;

public class MainEntry {
	public static void main(String[] args) {
		Calc c = new CalcImpl();
		
		Calc proxy = (Calc)Proxy.newProxyInstance(
						c.getClass().getClassLoader(), // loader : 클래스 찾기
						c.getClass().getInterfaces(),  // interfaces : 행위(함수)
						new LogPringHandlerImpl(c) );   // h : 보조업무 구현
		
		//클래스 통해서 실행
		System.out.println(c.add(1, 2));
		System.out.println(c.mul(10, 2));
		
		// Proxy를 통해서 실행
		System.out.println(proxy.add(3, 5));
		System.out.println(proxy.mul(3, 4));
		System.out.println(proxy.sub(3, 4));
	}
}
