package JAVAPROGRAMS;
import java.util.*;
public class listitr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs=new HashSet<>();
		hs.add(23);
		hs.add(12);
		hs.add(10);
		hs.add(18);
		hs.add(23);
		hs.add(null);
		System.out.println(hs);
		//for(java.lang.Object a:hs)
		for(Integer a:hs)
		{
			System.out.println(a);
		}
		TreeSet<Integer> st=new TreeSet<>();
		st.add(200);
		st.add(100);
		st.add(500);
		st.add(300);
		//st.add(null);
		System.out.println(st);
		
		LinkedHashSet<Integer> lh=new LinkedHashSet<>();
		lh.add(2);
		lh.add(1);
		lh.add(4);
		lh.add(3);
		lh.add(null);
		System.out.println(lh);
		
		
	}

}
