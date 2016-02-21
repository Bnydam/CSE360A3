/**Calculator.java includes several basic arithmetic operations:
 * add, subtract, multiply, integer divide, and get history; that can be
 * performed in succession to return a final total.

*@version February 20, 2016
*@author Brandon Nydam
*PIN: 618

*/

package cse360assign3;

public class Calculator {

	private int total;
	private String history;
	
	/** Constructs a new calculator object 
	 *  @param none
	 */
	public Calculator () 
	{
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	
	/** Returns the current total
	 *  @param none
	 */
	public int getTotal () 
	{
		return total;
	}
	
	
	/** Adds the parameter to the total
	 *  @param value	integer to be added to total
	 */
	public void add (int value) 
	{
		total += value;
		history = history + " + " + value;
	}
	
	
	/** Subtracts the parameter from the total 
	 *  @param value	integer to be subtracted from total
	 */
	public void subtract (int value) 
	{
		total = total - value;
		history = history + " - " + value;
	}
	
	
	/** Sets the new total to be the product of value and total 
	 *  @param value	integer to multiply total by.
	 */
	public void multiply (int value) 
	{
		total = total * value;
		history = history + " * " + value;
	}
	
	
	/** total is divided by the parameter, if value is 0, sets
	 *  total to 0
	 *  @param value	integer to divide total by
	 */
	public void divide (int value) 
	{
		if (value != 0)
			total = total/value;
		else
			total = 0;
		
		history = history + " / " + value;
	}
	
	
	/** Returns a String of the history of operations and operations values(not totals)
	 *  in chronological order
	 *  @param none	integer added to array
	 */
	public String getHistory () 
	{
		return history;
	}
}