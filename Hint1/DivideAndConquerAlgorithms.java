package Hint1;


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
	// 1. maxInt --> Computes Max Element of a MyList 
	//-------------------------------------------------------------------	
	/**
	 * The function returns the maximum integer of the m (-1 if m is empty). 
	 * @param m: The MyList we want to display its elements.
	 * @return: The maximum element of MyList	  
	 */	
	public int maxInt(MyList<Integer> m){
		int res = -1;
		if(m.length() > 0)
		{
			int firstEl = m.getElement(0);
			m.removeElement(0);
			res = maxInt(m);
			if(firstEl > res)
			{
				res = firstEl;
			}
			m.addElement(0, firstEl);
		}
		return res;
	}
	
	//-------------------------------------------------------------------
	// 2. isReverse --> Computes if MyList sorted in reverse order 
	//-------------------------------------------------------------------	
	/**
	 * The function states whether m is sorted in reverse order or not.  
	 * @param m: The MyList we want to display its elements.
	 * @return: If MyList is sorted in reverse order  
	 */	
	public boolean isReverse(MyList<Integer> m){
		boolean res = true;
		if(m.length() > 1)
		{
			int firstEl = m.getElement(0);
			int secondEl = m.getElement(1);
			m.removeElement(0);
			if(isReverse(m))
			{
				if(firstEl < secondEl)
				{
					res = false;
				}
			}
			
		}
		return res;
	}

	//-------------------------------------------------------------------
	// 3. getNumAppearances --> Computes the amount of times that number appears in MyList  
	//-------------------------------------------------------------------	
	/**
	 * The function returns the amount of times that number appears in m.   
	 * @param m: The MyList we want to display its elements.
	 * @param number: The number we want to compute its appearances for.
	 * @return: If MyList is sorted in reverse order  
	 */	
	public int getNumAppearances(MyList<Integer> m, int number){
		int res = 0;
		if(m.length() == 0)
		{
			return res;
		}
		else
		{
			int firstEl = m.getElement(0);
			m.removeElement(0);
			res += getNumAppearances(m, number);
			if(firstEl == number)
			{
				res++;
			}
			m.addElement(0, firstEl);
			return res;
		}
	}
	
	//-------------------------------------------------------------------
	// 4. n_toThePowerof_m --> Computes the m power of n
	//-------------------------------------------------------------------	
	/**
	 * The function computes the m power of n.
	 * @param n: The MyList we want to use as base.
	 * @param m: The power of n we want to compute
	 * @return: n to the power of m.  
	 */	

	public int n_toThePowerof_m(int n, int m){
		int res = 1;
		if(m > 0)
		{
			m--;
			res = n_toThePowerof_m(n, m);
			res *= n;
			m++;
		}
		return res;
	}
	
	//-------------------------------------------------------------------
	// 5. lucas --> Computes the n term of the Lucas series
	//-------------------------------------------------------------------	
	/**
	 * The function computes the n term of the Lucas series
	 * @param n: The index of the term we want to compute
	 * @return: The term computed 
	 */	
	public int lucas(int n){
		int res;
		if(n == 0)
		{
			res = 2;
		}
		else if(n == 1)
		{
			res = 1;
		}
		else
		{
			n--;
			res = lucas(n) + lucas(n - 1);
			n++;
		}
		return res;
	}

	//-------------------------------------------------------------------
	// 6. drawImage --> Displays an image following the required pattern
	//-------------------------------------------------------------------	
	/**
	 * The function should print in the screen a diagonal of symbols. The number of symbols is fixed by the parameter numberStars. 
	 * @param numberStars: The number of stars required
	 */	
	public void drawImage(int numberStars){
		if(numberStars == 0)
		{
			System.out.println("ERROR - No stars to print");
		}
		else if(numberStars == 1)
		{
			System.out.println("*");
		}
		else
		{
			numberStars--;
			drawImage(numberStars);
			for(int i = 0; i < numberStars; i++)
			{
				System.out.print(" ");
			}
			System.out.println("*");
			numberStars++;
		}	
	}
	
}
