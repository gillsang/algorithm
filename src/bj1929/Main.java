package bj1929;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int first = sc.nextInt(), last = sc.nextInt();
		int cnt;
		
		for(int i=first; i<=last; i++) {
			cnt = 0;
			if(i == 1) cnt ++;
			
			for(int j=2;j<=Math.sqrt(i);j++) {
				if(i % j == 0) {
					cnt++;
					break;
				}
			}
			if(cnt == 0) {
				System.out.println(i);
			}
		}
	}
}
