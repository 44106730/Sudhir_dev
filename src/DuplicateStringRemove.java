
public class DuplicateStringRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String St="SudhirSudhir";
		//int count=0;
		StringBuilder str=new StringBuilder(St);
		//char[] ch=St.toCharArray();
		for(int i=0;i<=St.length();i++){
			for(int j=i+1;j<=St.length();j++){
				if(St.charAt(i)==St.charAt(j)){
					str.deleteCharAt(j);
						
						
					}
				}
			}
		System.out.println(str);
		}

	}


