import java.util.Scanner;
public class Triagolnik {

	public static void main(String[] args) {
		double a,b,c;
		Scanner tastatura= new Scanner (System.in); 
		 
		System.out.println("Programata proveruva dali se formira triagolnik i dali e pravoagolen, ostroagolen ili tapoagolen");
		System.out.println("Vnesi ja prvata strana");
		a=tastatura.nextDouble();
		System.out.println("Vnesi ja vtorata strana");
		b=tastatura.nextDouble();
		System.out.println("Vnesi ja tretata strana");
		c=tastatura.nextDouble();
		if (a+c>b&& a+b>c && b+c>a) {
			System.out.println ("Se formira triagolnik: ");
		}
			else {
				System.out.println ("Ne se formira triagolnik");
				System.exit(0);
				
			}
			
			if (c*c== a*a + b*b || a*a==b*b+c*c || b*b==c*c+a*a) {
			System.out.println("Triagolnikot e pravoagolen") ;}
			
			else if (a*a+b*b>c*c&&c*c+b*b>a*a&&+c*c>b*b) {
			System.out.println ("Triagolnikot e tapoagolen");
			}

	}

}