package ex01.objectClass;

class Rectangle{
	int x, y;
	public Rectangle() {
		x=y=10;
	}
	public void disp() {
		System.out.println(x + ", " + y);
	}
	public String toString() {
		return x+", "+y;
	}
}

public class ToStringMain {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.disp();
		System.out.println(r);//해당 객체의 메모리 위치 출력
		
	}
}
