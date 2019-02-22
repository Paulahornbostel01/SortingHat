import java.util.Arrays;

public class MergeSortRecursive extends PapaSort{
			
	public MergeSortRecursive(int [] l, String sortName)
	{
		super(l, sortName);
		//mergeList = l;
	}

	@Override
	public void executeAlgorithm() 
	{
		// TODO Auto-generated method stub
				
		mergeSort(0, this.getLength()-1);
	}
			
	private void mergeSort(int lStart, int lEnd)
	{
		int listLen = lEnd - lStart + 1;
	//	System.out.println("in MergeSort list len is " + listLen);
	//	System.out.println("in MergeSort list start and end are " + lStart + ", " + lEnd);
			
		if(listLen > 1) // The stopping condirion -- stop when list is 1
		{
			int lMiddle = ((lStart + lEnd)/2);
			mergeSort(lStart, lMiddle);
			mergeSort(lMiddle + 1, lEnd);
			
			merge(lStart, lMiddle, lMiddle + 1, lEnd); //recursive call because it calls itself
		}
	}
	
	
	private void merge(int start1, int end1, int start2, int end2)
	{
		//System.out.println("Hi Merge this");
		int l1 = start1;
		int l2 = start2;
		
		//Write code to do the merge
		int [ ] temp = new int [(end1-start1 + 1) + (end2-start2 + 1)];
		int tPointer = 0;
		
		while(l1 <= end1 && l2 <= end2)
		{
			if(this.getElement(l1) <= this.getElement(l2))
			{
				temp[tPointer] = this.getElement(l1);
				l1++;
			}else {
				temp[tPointer] = this.getElement(l2);
				l2++;
			}
			tPointer++;
			//System.out.println(Arrays.toString(temp));
		}
		
		//Cleanup - put extras on temp
		for(int tp = tPointer; tp<temp.length; tp++)
		{
			if(l1<= end1)
			{
				temp[tp]=this.getElement(l1);
				l1++;
			}else {
				temp[tp]= this.getElement(l2);
				l2++;
				
				
			}
			//System.out.println(Arrays.toString(temp));
		}
		
		//More cleanup = copy everything back to numList
		for(int i = start1, t = 0; i<=end2; i++, t++)
		{
			this.setElement(i, temp[t]);
			//System.out.println(Arrays.toString(temp));
		}
	}

}

