package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Map {

	public static void main(String[] args) {
		ArrayList<Integer> marks=new ArrayList<Integer>();
		marks.add(10);
		marks.add(20);
		marks.add(70);
		marks.add(40);
		//System.out.println(marks);
		List<Integer> updatedmarks=marks.stream().map(i->i+5).collect(Collectors.toList());
		//System.out.println(updatedmarks);
		int failedstudent=(int) marks.stream().filter(i->i<=20).count();
		//System.out.println(failedstudent);
		List<Integer> sortedlist=marks.stream().sorted().collect(Collectors.toList());
		//System.out.println(sortedlist);
		marks.stream().forEach(y-> System.out.print("["+ y+" "));
		
	}

}
