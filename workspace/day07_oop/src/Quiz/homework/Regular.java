package Quiz.homework;

public class Regular extends Employ {
	private int pay;
	public Regular(String name, String phone, String partition, String position, int pay) {
		super(name, phone, partition, position);
		this.pay = pay;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	@Override
	public String toString() {
		return super.toString() + ", 월급 = " + pay;
	}
	
}
