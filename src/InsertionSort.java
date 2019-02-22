
public class InsertionSort extends PapaSort {
	
	public InsertionSort(int[] l, String sortName)
	{
		super(l, sortName);
	}

	@Override
	public void executeAlgorithm() {
		// TODO Auto-generated method stub
		
		//Concept is longwinded bubbleSort
		
		for(int i = 1; i < this.getLength(); i ++)
		{
			int j = i;
			while(j > 0 && getElement(j) < getElement(j-1))
			{
				swap(j, j-1);
				j--;
			}
		}
		
		
		
	}

	
	
}
