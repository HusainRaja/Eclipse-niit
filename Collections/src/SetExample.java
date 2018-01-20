import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class SetExample {
	public static void main(String args[]) {
		Set lst=new HashSet();
		Set s1=new TreeSet();
		Set s2=new TreeSet().descendingSet();
		lst.add(10);
		lst.add("hello");
		lst.add(12.25f);
		//lst.add("hello");
		System.out.println(lst);
	}
}
