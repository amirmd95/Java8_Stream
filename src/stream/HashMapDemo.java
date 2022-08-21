package stream;


import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

public class HashMapDemo {

	public static void main(String[] args) {
		Vector<Integer> v =new Vector<>();
		v.addElement(10);
		v.addElement(21);
		v.addElement(33);
		v.addElement(40);
		v.addElement(50);
		System.out.println(v);
		List<Integer> v2=v.stream().filter(i->i%2==0).collect(Collectors.toList());
		List<Integer> v3=v.stream().map(m->m*m).collect(Collectors.toList());
		
		System.out.println(v2);
		System.out.println(v3);
		
		

	}

}
