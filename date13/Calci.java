package date13;
import java.util.*;

public class Calci {
	
	int add (int a ,int b,int c){
		return a + b + c;
	}
	
	int sub (int a ,int b,int c){
		return a - b - c;
	}
	
	int mul (int a ,int b,int c){
		return a * b * c;
	}
	
	double div (int a ,int b,int c){
		return (a / b) / c;
	}
	
	int mod (int a ,int b,int c){
		return (a % b) % c;
	}
	
	
	
	public static void main(String[] args) {
		Scanner mc = new Scanner(System.in);
		Calci num = new Calci();
		
		System.out.println("Enter first number :");
		int num1 = mc.nextInt();
		System.out.println("Enter second number :");
		int num2 = mc.nextInt();
		
		System.out.println(num.add(10, num1, num2));
		System.out.println(num.sub(10, num1, num2));
		System.out.println(num.mul(10, num1, num2));
		System.out.println(num.div(10, num1, num2));
		System.out.println(num.mod(10, num1, num2));
		
	}

}
