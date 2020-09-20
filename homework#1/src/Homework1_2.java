import java.util.Scanner;
public class Homework1_2 {

	public static void main(String[] args) {
		int num1, num2, result = 0;
		char operator;
		System.out.print("연산>>");
		Scanner scanner = new Scanner(System.in);
		num1=scanner.nextInt();
		operator=scanner.next().charAt(0);
		num2=scanner.nextInt();
		
		switch(operator) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		}
		System.out.printf("%d %s %d 의 계산 결과는  %d.%n",num1, operator, num2, result);
	}

}
