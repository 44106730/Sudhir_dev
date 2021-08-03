
public class Pyramid {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<n;i++){
			for(int j=n-i;j>1;j--){
				System.out.println("");
			}
			for(int j=0;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println("\n");
		}
		
	}
	}


