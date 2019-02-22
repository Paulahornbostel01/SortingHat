import java.util.Arrays;

public class SortingHat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Make a very specific array
		
		int howMany = 21;
		//int[ ] nums = getRandom(howMany);
		int[ ] nums0 = getAscendingOrder(howMany);
		int[ ] nums2 = getRandom(howMany);
		int[ ] nums1 = nums2.clone();
		int[ ] nums3 = getDescendingOrder(howMany);
		int[ ] nums4 = {1,3,5,7,9,11,13,15,   2,4,6,8,10,12,14,16,18,20,22};
		
		
		
		//int[ ] nums2 = getDescendingOrder(howMany);
		//int[ ] nums3 = getDescendingOrder(howMany);
		//System.out.println(Arrays.toString(nums0));
		//System.out.println(Arrays.toString(nums1));
	//	System.out.println(Arrays.toString(nums2));
	//	System.out.println(Arrays.toString(nums3));
		
		
		//Running Selection Sort
		/*SelectionSort sSort = new SelectionSort (nums2, "Selection Sort");
		sSort.executeAlgorithm();
		System.out.println(Arrays.toString(nums2));
		doTiming(sSort, "Selection Sort");*/
		
		//Running Bubble Sort
	/*	BubbleSort bSort = new BubbleSort (nums1, "Bubble Sort");
		bSort.executeAlgorithm();
		System.out.println(Arrays.toString(nums1));
		doTiming(bSort, "Bubble Sort");*/
		
		//Running Insertion Sort
	/*	InsertionSort iSort = new InsertionSort (nums2, "Insertion Sort");
		iSort.executeAlgorithm();
		System.out.println(Arrays.toString(nums2));
		doTiming(iSort, "Insertion Sort");*/
		
		//Merge Sort Non-Recursive
		
		System.out.println("Before Merge Sort Non-Recursive is: ");
		System.out.println(Arrays.toString(nums2));
		
		MergeSortNR ms = new MergeSortNR(nums2, "MS Non-Recursive");
		doTiming(ms, "MS Non-Recursive");
	/*	ms.merge(0,
				7,
				8,
				numList.length - 1
				);*/
		
		System.out.println("After Merge Sort Non-Recursive is: ");
		System.out.println(Arrays.toString(nums2));
		
		//Merge Sort Recursive
		
		System.out.println("Before Merge Sort Recursive is: ");
		System.out.println(Arrays.toString(nums1));
		
		MergeSortRecursive msR = new MergeSortRecursive(nums1, "MS Recursive");
		doTiming(msR, "MS Recursive");
		if(listCheck(nums1) == true)
		{
			System.out.println("I checked new list and it is good!");
		}
		
		System.out.println("After Merge Sort Recursive is: ");
		System.out.println(Arrays.toString(nums1));
		
		
		
	}
	
	public static void doTiming(PapaSort s, String whichSort)
	{
		long start0 = System.currentTimeMillis();
		long start1 = System.nanoTime();
		
		s.executeAlgorithm();

		long end0 = System.currentTimeMillis();
		long end1 = System.nanoTime();
		long theTime0 = end0 - start0;
		long theTime1 = end1-start1;
		
		if (s.getLength() < 100)
		{
			System.out.println("Time for " + whichSort + " on " +
		s.getLength() + " numbers is: " + theTime1 +
		" (nano) seconds");
		}else{
			System.out.println("Time for " + whichSort + " on " +
					s.getLength() + " numbers is: " + theTime0 +
					" (milli) seconds");
		}
		
	}
	
	
	public static int[] getRandom (int n)
	{
		int [ ] nList = new int [n];
		
		for (int i = 0; i < nList.length; i++)
		{
			nList[i] = (int)(Math.random() *1000);
		}
		
		return nList;
	}

	public static int[ ] getAscendingOrder (int n)
	{
		int [] nList = new int [n];
		
		for (int i = 0; i < n; i++)
		{
			nList[i] = i + 1;
		}
		return nList;
	}
	
	public static int[ ] getDescendingOrder (int n)
	{
		int [] nList = new int [n];
		
		for (int i = 0; i < n; i++)
		{
			nList[i] = n - i;
		}
		return nList;
	}
	
	public static boolean listCheck(int [ ] l)
	{
		for(int i = 0; i < l.length - 1; i++)
		{
			if(l[i] > l[i+1])
			{
				return false;
			}
		}
		return true;
	}
	
	
}
