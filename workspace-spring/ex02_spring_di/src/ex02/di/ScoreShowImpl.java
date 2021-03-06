package ex02.di;

import java.util.Scanner;

class Func{
}

public class ScoreShowImpl implements ScoreShow{
	private ScoreImpl score;
	
	
	// setter method
	public ScoreShowImpl(ScoreImpl score) {
		this.score = score;
	}

	public void setScore(ScoreImpl score) {
		this.score=score;
	}
	
	@Override
	public void print() {
		String[] sub = {"국어","영어","전산","총정","평균"};
		Number[] func = {score.getKor(),score.getEng(),score.getCom(), score.total(), score.avg()};
		for(int i=0;i<5;i++) {
			System.out.println(sub[i] +" : " +func);
		}		
	}

	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		String[] sub = {"국어","영어","전산"};
		int[] num = new int[3];
		
		for(int i=0;i<3;i++) {
			System.out.println(sub+" 점수입력 : ");
			num[i]=sc.nextInt();
		}
		score.setKor(num[0]);
		score.setEng(num[1]);
		score.setCom(num[2]);
	}

}
