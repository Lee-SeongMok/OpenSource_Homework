import java.util.Random;
import java.util.Scanner;
public class homework2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��ǻ�Ϳ� ���� ���� �������� �մϴ�.");
		while(true) {
			System.out.print("���� ���� ��!>>");
			Scanner scanner = new Scanner(System.in);
			String input= null;
			input = scanner.nextLine();
			Random random = new Random();
			int value = random.nextInt(3);
			
			if(value == 0) { //����
				if(input.equals("����")) {
					System.out.println("����� = " + input + " , ��ǻ�� = ����, �����ϴ�");
				}
				else if(input.equals("����")) {
					System.out.println("����� = " + input + " , ��ǻ�� = ����, ����ڰ� �̰���ϴ�");
				}
				else if(input.equals("��")) {
					System.out.println("����� = " + input + " , ��ǻ�� = ����, ����ڰ� �����ϴ�");
				}
			}
			else if (value == 1) {  //����
				if(input.equals("����")) {
					System.out.println("����� = " + input + " , ��ǻ�� = ����, ����ڰ� �����ϴ�");
				}
				else if(input.equals("����")) {
					System.out.println("����� = " + input + " , ��ǻ�� = ����, �����ϴ�");
				}
				else if(input.equals("��")) {
					System.out.println("����� = " + input + " , ��ǻ�� = ����, ����ڰ� �̰���ϴ�");
				}
			}
			else if (value == 2) {  //��
				if(input.equals("����")) {
					System.out.println("����� = " + input + " , ��ǻ�� = ��, ����ڰ� �̰���ϴ�");
				}
				else if(input.equals("����")) {
					System.out.println("����� = " + input + " , ��ǻ�� = ��, ����ڰ� �����ϴ�");
				}
				else if(input.equals("��")) {
					System.out.println("����� = " + input + " , ��ǻ�� = ��, �����ϴ�");
				}
			}
			if(input.equals("�׸�")) {
				System.out.println("������ �����մϴ�...");
				break;
			}
		}
	}
}
