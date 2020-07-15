package demo;

import java.util.Arrays;

public class textDemo {
	public static void main(String[] args)
	{
		Shape a[]=new Shape[5];
		a[0]=new Rectange(4,6);
		a[1]=new Square(6);
		a[2]=new Ellipse(5,3);
		a[3]=new Circular(5);
		a[4]=new Hexagon(6);
		String c[]=new String[5];
		c[0]=a[0].area();
		c[1]=a[1].area();
		c[2]=a[2].area();
		c[3]=a[3].area();
		c[4]=a[4].area();
		String s[]=new String[5];
		s[0]=a[0].zhouchang();
		s[1]=a[1].zhouchang();
		s[2]=a[2].zhouchang();
		s[3]=a[3].zhouchang();
		s[4]=a[4].zhouchang();
		System.out.println("Sort by area:");
		System.out.println("s:");
		Arrays.sort(c);
		for(int i=0;i<5;i++)
		{
            System.out.println(c[i]);
		}
		System.out.println("Sort by perimeter:");
		System.out.println("c::");
		Arrays.sort(s);
		for(int j=0;j<5;j++)
		{
			System.out.println(s[j]);
		}
	}

}
