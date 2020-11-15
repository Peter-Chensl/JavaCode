package day1115List;

public class LinkList {
	private Link first;
	public LinkList()
	{
		first = null;
	}
	public boolean isEmpty()
	{
		return (first == null);
	}
	public void insertFirst(int id,double dd) {
		Link newLink = new Link(id, dd);
		newLink.next = first;
		first = newLink;
	}
	public Link deteleFirst()
	{
		Link temp = first;
		first = first.next;
		return temp;
	}
	public Link LinkFind(int key) {
		Link current = first;
		while(current.dData != key)
		{
			if(current.next == null)
				return null;
			else
				current = current.next;
		}
		return current;
	}
	public void displayList()
	{
		System.out.print("List(first-->last):");
		Link current = first;
		while(current!=	null) {
			current.disPlay();
			current = current.next;
		}
		System.out.println(" ");
	}
}
