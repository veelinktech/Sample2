package PracticeProgram;

public class Example3 {

	public static void main(String[] args) {
int n=153,p=0;
int tem=n;
while(n>0) {
	int rem=n%10;
	p=(p)+(rem*rem*rem);
	n=n/10;
	
}
if(tem==p) {
	System.out.println("Armstrong Number");
	
	}else {
		System.out.println("Not Armstrong");
}
	}

}
