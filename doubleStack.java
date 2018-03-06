// double stack class that will add and move elements from each end of the stack

public class doubleStack {
	private int topRed;						//top of stack Red
	private int topBlue;						//top of stack Blue
	private int size;						//size of stack array
	private String[] dStack;					//new stack
	private int count=0;						//counter for elements in array
	
	public doubleStack(int x)  				//constructor to add double stack
	{
		size = x;							//sets size of stack
		dStack = new String[size];			//creates a new stack
		topRed = -1;							//sets top of side Red to -1
		topBlue = size;						//sets top of side Blue to size of array
	}
	
	public void pushRed(String r)			//put item on top of side Red
	{
		if (!isFull())						//checks to see if the stack is full
		{
			dStack[++topRed] = r;			//increment and insert String
			count++;							//increase count
		}	
		else 								//stack is full, no room to push
			System.out.println("Can not push " + r + ", stack is full");
	}
	
	public void pushBlue(String b)			//put item on top of side Blue
	{		
		if (!isFull())						//checks to see if the stack is full
		{
			dStack[--topBlue] = b;			//increment and insert String
			count++;							//increase count
		}	
		else 								//stack is full, no room to push
			System.out.println("Can not push " + b + ", stack is full");
	}

	public String popRed()					//remove String from Red side
	{
		if (!isEmptyRed())
		{
			count--;							//decrease count
			return dStack[topRed--];			//return String and deduct from top
		}
		else
			return "Can not pop from Red, stack is empty";
	}
	
	public String popBlue()					//remove String from Blue side
	{
		if (!isEmptyBlue())
		{
			count--;							//decrease count
			return dStack[topBlue++];		//return String and deduct from top
		}
		else
			return "Can not pop from Blue, stack is empty";
	}
	
	public void popAllRed()					//removes all from Red side
	{
		while(!isEmptyRed())
			System.out.println(popRed());
	}
	
	public void popAllBlue()					//removes all from Blue side
	{
		while(!isEmptyBlue())
			System.out.println(popBlue());
	}
	
	public String peekRed()					//peek at top of stack Red
	{
		return dStack[topRed];
	}
	
	public String peekBlue()					//peek at top of stack Blue
	{
		return dStack[topBlue];
	}
	
	public boolean isEmptyRed()				//is true if stack Red is empty
	{
		return (topRed == -1);
	}
	
	public boolean isEmptyBlue()				//is true if stack Blue is empty
	{
		return (topBlue == size);
	}
	
	public boolean isEmpty()					//is true if entire stack is empty
	{
		return (count == 0);
	}
	
	public boolean isFull()					//is true if stack is full
	{
		return (count == size);
	}

	public int getTopRed() {
		return topRed;
	}

	public void setTopRed(int topRed) {
		this.topRed = topRed;
	}

	public int getTopBlue() {
		return topBlue;
	}

	public void setTopBlue(int topBlue) {
		this.topBlue = topBlue;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
