import java.util.Scanner;
import java.util.InputMismatchException;
public class Multiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int m=0, n=0;
		while(true) {
			System.out.print("���ϰ��� �ϴ� �� �� �Է�>>");
			try {
				n = scanner.nextInt();
				m = scanner.nextInt();
				break;
			}
			catch(InputMismatchException e) {
				System.out.println("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.");
				scanner.next();
			}
		}
		System.out.println(n + " x " + m + "= "+ n*m);
		scanner.close();
	}

}
