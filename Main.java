import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		String name = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name here:");
		name = sc.nextLine();
		System.out.printf("Hello %s",name);
	}
}
