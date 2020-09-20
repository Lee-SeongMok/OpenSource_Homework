import java.util.Random;
import java.util.Scanner;
public class homework2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("컴퓨터와 가위 바위 보게임을 합니다.");
		while(true) {
			System.out.print("가위 바위 보!>>");
			Scanner scanner = new Scanner(System.in);
			String input= null;
			input = scanner.nextLine();
			Random random = new Random();
			int value = random.nextInt(3);
			
			if(value == 0) { //가위
				if(input.equals("가위")) {
					System.out.println("사용자 = " + input + " , 컴퓨터 = 가위, 비겼습니다");
				}
				else if(input.equals("바위")) {
					System.out.println("사용자 = " + input + " , 컴퓨터 = 가위, 사용자가 이겼습니다");
				}
				else if(input.equals("보")) {
					System.out.println("사용자 = " + input + " , 컴퓨터 = 가위, 사용자가 졌습니다");
				}
			}
			else if (value == 1) {  //바위
				if(input.equals("가위")) {
					System.out.println("사용자 = " + input + " , 컴퓨터 = 바위, 사용자가 졌습니다");
				}
				else if(input.equals("바위")) {
					System.out.println("사용자 = " + input + " , 컴퓨터 = 바위, 비겼습니다");
				}
				else if(input.equals("보")) {
					System.out.println("사용자 = " + input + " , 컴퓨터 = 바위, 사용자가 이겼습니다");
				}
			}
			else if (value == 2) {  //보
				if(input.equals("가위")) {
					System.out.println("사용자 = " + input + " , 컴퓨터 = 보, 사용자가 이겼습니다");
				}
				else if(input.equals("바위")) {
					System.out.println("사용자 = " + input + " , 컴퓨터 = 보, 사용자가 졌습니다");
				}
				else if(input.equals("보")) {
					System.out.println("사용자 = " + input + " , 컴퓨터 = 보, 비겼습니다");
				}
			}
			if(input.equals("그만")) {
				System.out.println("게임을 종료합니다...");
				break;
			}
		}
	}
}
