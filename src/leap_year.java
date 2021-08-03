import java.util.Scanner;

public class leap_year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int Year =sc.nextInt();
		boolean flag=false;
		if(Year % 400==0){
			flag=true;
		}
		else if(Year%100==0){
			flag=false;
			
		}
else if(Year%4==0){
	flag=true;
	
}
else{
	flag=false;
}
		if(flag){
			System.out.println(Year);
			System.out.println("leap year");
		}
		else
		{
			System.out.println(Year);
			System.out.println("Not leap year");
			
			
		}
	}

}
