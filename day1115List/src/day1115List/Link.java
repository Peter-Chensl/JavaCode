package day1115List;

public class Link {
	public int iData;
	public double dData;
	public Link next;
	
	public Link(int id,double dd) {
		iData = id;
		dData = dd;
		// TODO Auto-generated constructor stub
	}
	public void disPlay()
	{
		System.out.print("{" + iData + "," + dData + "}");
	}
}
