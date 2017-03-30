package edu.wmich.cs1120.la5;
/**
 * This method takes in the symbols from the .dat file into and operator(- or +) , val1 and val2
 * @author Ricardo Quiroga
 * @author Dustin Ekema
 *@param operator 
 *@param val1
 *@param val2
 */
public class ExpressionFactory {
	private char operator;
	private int val1;
	private int val2;
/**
 * This method goes to the method Addition or Subtraction based on the operator
 * @param operator
 * @param val1
 * @param val2
 * @return
 */
	public static IExpression getExpression(char operator, int val1, int val2) {
	Literal lit1 = new Literal(val1);
	Literal lit2 = new Literal(val2);
	
	Subtraction sub = new Subtraction();
		if(operator == '+'){
	Addition add = new Addition();
	BinaryExpression exp = new BinaryExpression(add,lit1,lit2);
	return exp;
			
		}
	return null;
	}
	
}
