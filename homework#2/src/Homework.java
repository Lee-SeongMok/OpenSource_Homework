import java.util.Scanner;
import java.lang.Math;
public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			System.out.print("첫번째 원의 반지름을 입력하세요 >>");
			Scanner scanner1 = new Scanner (System.in);
			int first_x = scanner1.nextInt();
			int first_y = scanner1.nextInt();
			int first_radius = scanner1.nextInt();
			System.out.print("두번째 원의 반지름을 입력하세요 >>");
			Scanner scanner2 = new Scanner (System.in);
			int second_x = scanner2.nextInt();
			int second_y = scanner2.nextInt();
			int second_radius = scanner2.nextInt();
			
			double length = Math.sqrt((first_x - second_x)*(first_x - second_x) + (first_y - second_y)*(first_y - second_y));
			if((first_radius + second_radius)>=length) {
				System.out.println("두 원은 서로 겹친다.");
			}
			else {
				System.out.println("두 원은 서로 겹치지 않는다.");
			}
		}
	}

}
