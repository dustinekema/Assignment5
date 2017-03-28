package edu.wmich.cs1120.la5;

/**
 * This is the IOperation interface. It sets the required methods for any class that 
 * implements this interface.
 * 
 * @author Ricardo Quiroga
 * @author Dustin Ekema
 *
 */
public interface IOperation {
	
	/**
	 * This method sets a required method for a class. This method will perform the operation accordingly 
	 * and return the value.
	 * @param left
	 * @param right
	 * @return Integer this is the integer value that is returned.
	 */
	Integer perform(IExpression left, IExpression right);
}
