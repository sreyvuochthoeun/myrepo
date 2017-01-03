import java.util.*;
public class CollectionsRe {
	public static void main(String[] args) {
		   // list object
		   ArrayList  arrlist = new ArrayList();  
		   // add data
		   arrlist.add("Research ");
		   arrlist.add("Java Programming");
		   arrlist.add("Scientific");
		   arrlist.add("User Interface");
		   arrlist.add("Network");

		   System.out.println("Subjects :"+arrlist);
		      
		   // reverse the list
		   Collections.reverse(arrlist);
		      
		   System.out.println("The Reverse of subjects :"+arrlist);
		   }
}
