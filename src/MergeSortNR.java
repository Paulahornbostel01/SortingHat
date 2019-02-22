import java.util.Arrays;

public class MergeSortNR extends PapaSort {
	
	//int mergeList [];
	
	public MergeSortNR(int [] l, String sortName)
	{
		super(l, sortName);
		//mergeList = l;
	}

	@Override
	public void executeAlgorithm() {
		// TODO Auto-generated method stub
		
	/*	merge(0,0,1,1);
		merge(2,2,3,3);
		merge(4,4,5,5);
		merge(6,6,7,7);
		merge(8,8,9,9);*/
		
		for(int j = 1, e = 0; Math.pow(2.0, (double)(e)) <= this.getLength(); j*=2, e++ )
		{
			for (int i = 0; i<=this.getLength() - 1; i += j*2)
			{
				if((i+(j*2) - 1) < this.getLength()) 
				{
					merge(i, i+j-1, i+j, i+(j*2) -1);
				}else {
					merge(i, i+j-1, i+j, this.getLength()-1);
				}
			}
			//System.out.println(j);
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
