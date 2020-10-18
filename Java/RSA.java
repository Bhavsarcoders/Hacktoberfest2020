import java.util.Scanner;
import java.lang.Math;
public class RSA {

	public static void main(String[] args) {
		int plaintext,p,q;
		int e,z,n,d=0,C,D;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the plaintext");
		plaintext = scan.nextInt();
		System.out.println("Enter the First Prime Number");
		p = scan.nextInt();
		System.out.println("Enter the Second Prime Number");
		q = scan.nextInt();
		n = p * q;
		z = (p-1) * (q-1);
		System.out.println("Value of n :"+n);
		System.out.println("Value of z :"+z);
		for(e=2;e<z;e++) {
			if(gcd(e,z)==1)
				break;
		}
		System.out.println("the value of e = "+e); 
		 for(int i=0;i<=9;i++){
			 int x=1+(i*z);
			 if(x%e==0){
				 d=x/e;
				 break;
			 }
		 }
		 System.out.println("the value of d = "+d);
		 C = (int)Math.pow(plaintext,e)%n;
		 System.out.println("Encrypted Message is = "+C);
		 D = (int)Math.pow(C,d)%n;
		 System.out.println("Decrypted Message is = "+D);
	}
	public static int gcd(int e,int z) {
		if(e==0)
			return z; 
		else
			return gcd(z%e,e);
	}

}
