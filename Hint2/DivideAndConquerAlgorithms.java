package Hint2;

/**
 * The class contains the Divide and Conquer-based Algorithms we are using. 
 */
public class DivideAndConquerAlgorithms {

	//----------------------------------------------
	// Class constructor
	//----------------------------------------------	
	/**
	 * Constructor of the class. Do not edit it.
	 */
	public DivideAndConquerAlgorithms(){}
		
	//-------------------------------------------------------------------
	// 0. iterativeDisplayElements --> Displays all elements of a MyList 
	//-------------------------------------------------------------------	
	/**
	 * Given a concrete MyList, this iterative algorithm displays its elements by screen (if any).
	 * @param m: The MyList we want to display its elements.	  
	 */	
	public void iterativeDisplayElements(MyList<Integer> m){
		//-----------------------------
		//SET OF OPS
		//-----------------------------

		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		int scenario = 0; 
		
		//Rule 1. MyList is empty
		if (m.length() == 0) 
			scenario = 1;
		//Rule 2. MyList is non-empty
		else
			scenario = 2;

		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		switch(scenario){	
				
		//Rule 1. MyList is empty
		case 1: 
			//1. We print the empty message
			System.out.println("Empty MyList");
			
			break;
			
		//Rule 2. MyList is non-empty
		case 2: 
			//1. We print the initial message
			int size = m.length();
			System.out.println("MyList Contains the following " + size + " items: ");
			
			//2. We traverse the items
			for (int i = 0; i < size; i++)
				System.out.println("Item " + i + ": " + m.getElement(i));
			
			break;
	
		}
		
	}

	//-------------------------------------------------------------------
	// 1. recursiveDisplayElements --> Displays all elements of a MyList  
	//-------------------------------------------------------------------	
	/**
	 * Given a concrete MyList, this recursive algorithm displays its elements by screen (if any).
	 * @param m: The MyList we want to display its elements.	  
	 */	
	public void recursiveDisplayElements(MyList<Integer> m){

		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		int scenario = 0; 	
	
		if (m.length() == 0) 
			scenario = 1;
		else if(m.length() == 1)
			scenario = 2;
		else
			scenario = 3;
				
		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		switch(scenario){	
		case 1:
			System.out.println("ERROR - List is empty");
			break;
		case 2:
			System.out.println(m.getElement(0));
			break;
		case 3:
			int firstEl = m.getElement(0);
			m.removeElement(0);
			System.out.println(firstEl);
			recursiveDisplayElements(m);
			m.addElement(0, firstEl);
			break;	
		}			
	}

	//-------------------------------------------------------------------
	// 2. smallerMyList --> Filters all elements in MyList smaller than e
	//-------------------------------------------------------------------	
	/**
	 * The function filters all elements of MyList being smaller than 'e'  
	 * @param m: The MyList we want to check.
	 * @param e: The number 'e' we want to compare each element of MyList to.
	 * @return: The new MyList containing just the elements being smaller than 'e'  
	 */	
	public MyList<Integer> smallerMyList(MyList<Integer> m, int e){
		//-----------------------------
		//Output Variable --> InitialValue
		//-----------------------------
		MyList<Integer> res = null;

		//-----------------------------
		//SET OF OPS
		//-----------------------------

		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		int scenario = 0; 				

		if (m.length() == 0) 
			scenario = 1;
		else
			scenario = 2;
		
		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		switch(scenario){	
		case 1:
			res = new MyDynamicList<Integer>();
			break;
		case 2:
			int firstEl = m.getElement(0);
			m.removeElement(0);
			res = smallerMyList(m, e);
			if(firstEl < e)
			{
				res.addElement(0, firstEl);
			}
			m.addElement(0, firstEl);
			break;
		}
		
		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------		
		return res;	
	}

	//-------------------------------------------------------------------
	// 3. biggerMyList --> Filters all elements in MyList bigger than e
	//-------------------------------------------------------------------	
	/**
	 * The function filters all elements of MyList being bigger than 'e'  
	 * @param m: The MyList we want to check.
	 * @param e: The number 'e' we want to compare each element of MyList to.
	 * @return: The new MyList containing just the elements being bigger or equal than 'e'  
	 */	
	public MyList<Integer> biggerEqualMyList(MyList<Integer> m, int e){
		//-----------------------------
		//Output Variable --> InitialValue
		//-----------------------------
		MyList<Integer> res = null;

		//-----------------------------
		//SET OF OPS
		//-----------------------------

		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		int scenario = 0; 				

		if (m.length() == 0) 
			scenario = 1;
		else
			scenario = 2;
		
		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		switch(scenario){	
		case 1:
			res = new MyDynamicList<Integer>();
			break;
		case 2:
			int firstEl = m.getElement(0);
			m.removeElement(0);
			res = biggerEqualMyList(m, e);
			if(firstEl >= e)
			{
				res.addElement(0, firstEl);
			}
			m.addElement(0, firstEl);
			break;
		}
		
		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------		
		return res;
	}
		
	//-------------------------------------------------------------------
	// 3. concatenate --> It concatenates 2 MyList   
	//-------------------------------------------------------------------	
	/**
	 * The function concatenates the content of 2 MyList.   
	 * @param m1: The first MyList.
	 * @param m2: The second MyList.
	 * @return: The new MyList resulting of concatenate the other 2 MyList
	 */	
	public MyList<Integer> concatenate(MyList<Integer> m1, MyList<Integer> m2){
		//-----------------------------
		//Output Variable --> InitialValue
		//-----------------------------
		MyList<Integer> res = null;

		//-----------------------------
		//SET OF OPS
		//-----------------------------

		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		int scenario = 0; 		

		if ((m1.length() == 0) && (m2.length() == 0)) 
		{
			scenario = 1;
		}
		else if (m1.length() == 0) 
		{
			scenario = 2;
		}
		else if (m2.length() == 0)
		{
			scenario = 3;
		}
		else
		{
			//System.out.println("case4");
			scenario = 4;
		}
		
		int firstEl;
		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
			
		switch(scenario){	
		case 1:
			res = new MyDynamicList<Integer>();
			break;
		case 2:
			firstEl = m2.getElement(0);
			m2.removeElement(0);
			res = concatenate(m1, m2);
			res.addElement(0, firstEl);
			m2.addElement(0, firstEl);
			break;
		case 3:
			firstEl = m1.getElement(0);
			m1.removeElement(0);
			res = concatenate(m1, m2);
			res.addElement(0, firstEl);
			m1.addElement(0, firstEl);			
			break;
		case 4:
			firstEl = m1.getElement(0);
			m1.removeElement(0);
			res = concatenate(m1, m2);
			res.addElement(0, firstEl);
			m1.addElement(0, firstEl);
			firstEl = m2.getElement(0);
			m2.removeElement(0);
			res = concatenate(m1, m2);
			res.addElement(m1.length(), firstEl);
			m2.addElement(0, firstEl);
			break;
		}
			
		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------		
		return res;	
	}
	
	//-------------------------------------------------------------------
	// 4. quickSort --> Sort a MyList using the method quick sort
	//-------------------------------------------------------------------	
	/**
	 * Given a concrete MyList, it computes a new sorted list using the method Quick Sort.
	 * @param m: The MyList we want to sort.
	 * @return: The new MyList being sorted.	  	  
	 */	  
	public MyList<Integer> quickSort(MyList<Integer> m){
		//-----------------------------
		//Output Variable --> InitialValue
		//-----------------------------
		MyList<Integer> res = null;

		//-----------------------------
		//SET OF OPS
		//-----------------------------

		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		int scenario = 0; 

		if (m.length() == 0) 
			scenario = 1;
		else if(m.length() == 1)
			scenario = 2;
		else
			scenario = 3;

		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
			
		switch(scenario){	
		case 1:
			res = new MyDynamicList<Integer>();
			break;	
		case 2:
			res = new MyDynamicList<Integer>();
			res.addElement(0, m.getElement(0));
			break;
		case 3:
			int firstEl = m.getElement(0);
			m.removeElement(0);
			res = concatenate(quickSort(smallerMyList(m, firstEl)), quickSort(biggerEqualMyList(m, firstEl)));
			res.addElement(quickSort(smallerMyList(m, firstEl)).length(), firstEl);
			m.addElement(0, firstEl);
		}		
	
		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------		
		return res;		
	}		
	
}
