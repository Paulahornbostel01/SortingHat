import java.util.Arrays;

public class SelectionSort extends PapaSort {
	
	public SelectionSort (int [] l, String sortName)
	{
		super(l, sortName);
	}
	
	
	public void executeAlgorithm()
	{
		int length = (int)(super.getList().length);
		
		
		for (int u = 0; u < getList().length - 1; u++)
		{
			
			int biggest = getElement(0);
			int bigLoc = 0;
			for (int i = 0; i < length - u; i++)
			{
				if(super.getElement(i) > biggest)
				{
					biggest = getElement(i);
					bigLoc = i;
				}
			}
		
		swap(bigLoc, getList().length - 1 - u);
		//System.out.println(toString());
		
		}
	}
	
	public String toString()
	{
		return Arrays.toString(getList());
	}
	
	

}
