import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapsExample {
	public static void main(String ar[]) {
		Map m=new HashMap();
		m.put(1,"hello");
		m.put(2, 153.7);
		m.put(3, "yo");
		m.put("hey", 147);
		System.out.println(m);
		System.out.println(m.get(1));
		System.out.println(m.get("hey"));
		
		Set ks=m.keySet();
		System.out.println(ks);
		
		Collection values=m.values();
		System.out.println(values);
		
		Set es=m.entrySet();
		System.out.println(es);
	}
}
