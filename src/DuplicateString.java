
public class DuplicateString {
		 public static void main(String argu[]) {

		  String str = "sudhir01201210215455";
		  int cnt = 0;
		  char[] inp = str.toCharArray();
		  System.out.println("Duplicate Characters are:");
		  for (int i = 0; i < str.length(); i++) {
		   for (int j = i + 1; j < str.length(); j++) {
		    if (inp[i] == inp[j]) {
		     System.out.println(inp[j]);
		     System.out.println("\n");
		     cnt++;
		     break;
		    }
		   }
		  }
		 }
		}
