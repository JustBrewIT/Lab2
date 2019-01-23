package dbrewer;

import bridges.connect.Bridges;
import bridges.base.Array;
import bridges.base.Element;

public class Setup {
	public static void main(String[] args) throws Exception {

	    /* Initialize a Bridges connection with your credentials */
	    /* TODO: plug your own BRIDGES credentials */
	    Bridges bridges = new Bridges(0, "dbrewer", "1076248786598");

	    /* Set an assignment title */
	    bridges.setTitle("Derrick Brewer");

	    
	    
//	    Using a for loop, initialize each array entry to store a square number (0, 1, 4, ...).
//	    Compile and run the code.
//	    Follow the link and check that you can see an array of square numbers.
	    
	    
	    /* Set up the array dimensions, allocate an Array of Elements */
	    /* TODO: Make an array of size 10 */
	    int arraySize = 10;
	    Array<Integer> arr = new Array<Integer> (arraySize);
	    //Array<Element> arr = new Array<Element> (arraySize);

	    for(int i = 1; i <= 10; i++) {
	    	//Element<Integer> n = new Element<Integer>(i * i);
	    	/* Populate the array with integers */
		    /* TODO: Make the array store square numbers*/
		    arr.getElement(i - 1).setValue(i * i);
		    arr.getElement(i - 1).setLabel(String.valueOf(i * i));


	    }
	    
	    
	    /* Tell BRIDGES which data structure to visualize */
	    bridges.setDataStructure(arr);

	    /* Visualize the Array */
	    bridges.visualize();
	}
}