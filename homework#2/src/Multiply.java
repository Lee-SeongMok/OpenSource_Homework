import java.util.Scanner;
import java.util.InputMismatchException;
public class Multiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int m=0, n=0;
		while(true) {
			System.out.print("곱하고자 하는 두 수 입력>>");
			try {
				n = scanner.nextInt();
				m = scanner.nextInt();
				break;
			}
			catch(InputMismatchException e) {
				System.out.println("실수는 입력하면 안됩니다.");
				scanner.next();
			}
		}
		System.out.println(n + " x " + m + "= "+ n*m);
		scanner.close();
	}

}
