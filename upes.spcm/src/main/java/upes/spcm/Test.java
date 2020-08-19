package upes.spcm;

public class Test {
private int n=10;
public void f1(int n1)
{
	int n4=10;
	System.out.println(n1);
}
	public static void main(String[] args) {
		int n2=20;		
		System.out.println("hello sonar");
		if(n2==20)
		{
			System.out.println("Test Pass");
		}
		Test ob = new Test();
		ob.f1(30);
	}
}
