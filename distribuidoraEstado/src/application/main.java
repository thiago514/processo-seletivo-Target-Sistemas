package application;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double SP = 67836.43,RJ = 36678.66, MG = 29229.88, ES = 27165.48, outros = 19849.53,
				total = SP + RJ + MG + ES + outros;
		
		double mSP = (SP*100)/total, mRJ = (RJ*100)/total, mMG = (MG*100)/total, mES = (ES*100)/total, Moutros = (outros*100)/total;
		
		System.out.printf("O percentual de SP foi de %.0f %%\n", mSP);
		System.out.printf("O percentual de RJ foi de %.0f %%\n", mRJ);
		System.out.printf("O percentual de MG foi de %.0f %%\n", mMG);
		System.out.printf("O percentual de ES foi de %.0f %%\n", mES);
		System.out.printf("O percentual dos outros estados foi de %.0f %%\n", Moutros);
		
		
		
		sc.close();

	}

}
