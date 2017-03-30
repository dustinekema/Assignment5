package edu.wmich.cs1120.la5;
/**
 * This method uses the IExpression op, left and right to be used in the addition/subtraction methods
 * @author Ricardo Quiroga
 * @author Dustin Ekema
 *@param value
 *@param left
 *@param right
 *@param op
 */
public class BinaryExpression implements IExpression {
private Integer value;
private IOperation op;
private IExpression left;
private IExpression right;
	@Override
	/**
	 * getter for value
	 */
	public Integer getValue() {
		// TODO Auto-generated method stub
		return value;
	}
	/**
	 * setter for value
	 * @param value
	 */
	public void setValue(Integer value) {
		// TODO Auto-generated method stub
		this.value = value;
	}
	/**
	 * This is the constructor of the method BinaryExpression
	 * @param op
	 * @param left
	 * @param right
	 */
	BinaryExpression(IOperation op, IExpression left,IExpression right){
		this.op=op;
		this.left =left;
		this.right=right;
		
	}
}
