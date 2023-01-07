import java.util.*;

class VectorDemo
{
	public static void main(String args[])
	{
		Vector v = new Vector();

		Scanner scr = new Scanner(System.in);

		System.out.print("Enter Size : ");
		int n = scr.nextInt();

		System.out.print("Enter "+n+" elements : ");
		while(n>0)
		{
			String ele = scr.next();
			v.add(ele);
			n--;
		}

		System.out.println("Vector is : "+v);

		System.out.println("Using Iterator : ");

		Iterator it = v.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

		System.out.println("Using ListIterator : ");

		ListIterator lit = v.listIterator();
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}

		System.out.println("-------------------------------");

		while(lit.hasPrevious())
		{
			System.out.println(lit.previous());
		}

		System.out.print("Enter Element : ");
		String ele = scr.next();
		System.out.print("Enter Position : ");
		int pos = scr.nextInt();

		 if(pos<v.size())
		{
			v.set(pos,ele);
			System.out.println("After replace : "+v);
		}
		else
		{
			System.out.println("Index position is out of range");
		} 

		try
		{
			v.set(pos,ele);
			System.out.println("After replace : "+v);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Index position is out of range");
		}		

		System.out.print("Enter Position : ");
		pos = scr.nextInt();

		System.out.println("Element at "+pos+" position is : "+v.get(pos)); 

		System.out.println("Index of abc is : "+v.indexOf("abc"));

		System.out.println("Last Index of abc is : "+v.lastIndexOf("abc"));

		//System.out.println("Contains abc : "+v.contains("abc"));
		if(v.contains("abc")==true)
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not Found");
		}

		v.remove(1);
		System.out.println("Vector is : "+v);		

		Vector v1 = new Vector();
		v1.add("aa");
		v1.add("bb");
		v1.add("cc");
		v1.add("dd");
	
		v.addAll(v1);
		System.out.println("Vector is : "+v);		

		System.out.println("Vector is : "+v.containsAll(v1));		

		v.removeAll(v1);
		System.out.println("Vector is : "+v);		

		v.retainAll(v1);
		System.out.println("Vector is : "+v);		

		v.clear();
		System.out.println("Vector is : "+v);		

		boolean ans = v.isEmpty();
		System.out.println("Vector is : "+ans);
	}
}