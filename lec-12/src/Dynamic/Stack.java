package Dynamic;

public class Stack {
	private T[] arr;
	private int top;
	
	public Stack()
	{
		this.arr=(T[])new Object[maxSize];
		this.top=-1;
	}
	public int size()
	{
		return 0;

	}
	public boolean isEmpty()
	{
		
		return false;
	}
	public T top() //throws StackEmptyException
	{
		if(this.top==-1)
		{
//			throw new StackEmptyException();
			System.out.println("");
		}
		return null;
	}
	public void push(T data)// throws StackFullException
	{
		if(this.top==this.arr.length-1)
		{
			System.out.println("Stack is full");
			//double the array only change
		}
		this.top++;
		this.arr[this.top]=data;
	}
	public String toString()
	{
		String retval="";
		for(int i=this.top;i>=0;i--)
		{
			
		}
		
		return retval;
	}
	public void display()
	{
		System.out.println(this);
	}
}
