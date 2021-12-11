package kidkoder;
import java.util.*;
public class clothing {
	public static void main(String[] args) {
		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(34563456, "Joe");
		map.put(23423234, "Biden");
		map.put(76897897, "Donald");
		map.put(67867886, "Trump");
		map.put(45674567, "Hillary");
		//map
		System.out.println(map);
		//entries
		for(Map.Entry entry : map.entrySet()) {
			System.out.print(entry.getKey()+" "+entry.getValue()+" ");
		}
		System.out.println();
		//keys
		for(int x : map.keySet()) {
			System.out.print(x+ " ");
		}
		System.out.println();
		//values
		for(String s : map.values()) {
			System.out.print(s + " ");
		}
		System.out.println();
	}	
}
