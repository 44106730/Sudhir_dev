
public class Fibonaci_Series {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int k;
		System.out.println(a+""+b);
		for(int i=0;i<=10;i++){
			k=a+b;
			
			a=b;
			b=k;
			
			System.out.println(k);
			
		}
		

	}

}
