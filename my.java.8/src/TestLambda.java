import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestLambda {

	public static void main(String args[]){
		
		String [] names = {"a", "b", "c", "d"};
		
		List<String> names1 = new ArrayList<>();
		names1.addAll(Arrays.asList(names));
		
		List<String> names2 = new ArrayList<>();
		names2.addAll(Arrays.asList(names));
		
		Collections.sort(names1, new Comparator<String>(){

			@Override
			public int compare(String arg0, String arg1) {
				return arg0.compareTo(arg1);
			}
		});
		
		TestLambda test = new TestLambda();
		test.sortUsingJava7(names1);
		test.sortUsingJava7(names2);
		
		System.out.println(names1);
		System.out.println(names2);
	}
	
	public void sortUsingJava7(List<String> names){
		Collections.sort(names, new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
			
		});
	}
	
	public void sortUsingJava8(List<String> names){
		Collections.sort(names, (name1, name2)-> name1.compareTo(name2));
	}
}
