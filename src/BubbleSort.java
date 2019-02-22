import java.util.Arrays;

public class BubbleSort extends PapaSort{

	int [] myList;
	
	public BubbleSort (int [] l, String sortName)
	{
		super(l, sortName);
	}
	
	public void swap(int place1, int place2)
	{
		int temp = myList [place2];
		myList[place2] = myList[place1];
		myList[place1] = temp;
		
		
		
	}
	
	public String toString()
	{
		return Arrays.toString(myList);
	}
	
	
	public void doBubbleSort()
	{
		//Loop through numbers, find biggest
		
	for(int u = 0; u < myList.length - 1; u++)
	{
		for(int i = 0; i < myList.length - 1; i++)
		{
			if( myList[i + 1] < myList [i])
			{
				swap(i, i + 1);
			}
		}
		
		//System.out.print(toString());
	}
	}
	
	//Roche's
	
	private boolean bubbleIt(int end)
	{
		boolean didSwap = false;
		for(int i = 0; i < end; i++)
		{
			if(super.getElement(i)> super.getElement(i + 1))
			{
				super.swap(i, i +1);
				didSwap = true;
			}
		}
		
		return didSwap;
	}
	
	public void executeAlgorithm()
	{
		boolean notDone = true;
		int bubbleEnd = super.getList().length -1;
		
		do
		{
			notDone = bubbleIt(bubbleEnd);
			if(notDone)
			{
				bubbleEnd -= 1;
			}
		}while (notDone && bubbleEnd >= 1);
	}
}

