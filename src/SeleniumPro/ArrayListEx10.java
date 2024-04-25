package SeleniumPro;

import java.util.ArrayList;

public class ArrayListEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		ArrayList al = new ArrayList();
		al.add("soniya");
		al.add("aa");
		al.add(12);
		ArrayList al2 = new ArrayList();
		al2.addAll(al);
		System.out.println(al2);
		al2.remove(0);	
		System.out.println(al2);		
		boolean a =al2.contains(al);
		System.out.println(a);
		
		

	}

}
