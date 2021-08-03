
public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Str="sidhir sudhir 01 s ";
		int count=0;
		char[] ch= Str.toCharArray();
		System.out.println("dupicate msg");
		for(int i=0;i<Str.length();i++){
			for(int j=i+1;j<Str.length();j++){
				if(ch[i]==ch[j]){
					
				
			System.out.println(ch[j]);
			count++;
			break;
			
		}

	}

	}}}

