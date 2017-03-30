package edu.wmich.cs1120.la5;
/**
 * This method uses the IExpression op, left and right to be used in the addition/subtraction methods
 * @author Ricardo Quiroga
 * @author Dustin Ekema
 *
 */
public class BinaryExpression implements IExpression {
private Integer value;
private IOperation op;
private IExpression left;
private IExpression right;
	@Override
	public Integer getValue() {
		// TODO Auto-generated method stub
		return value;
	}
	
	public void setValue(Integer value) {
		// TODO Auto-generated method stub
		this.value = value;
	}
	BinaryExpression(IOperation op, IExpression left,IExpression right){
		this.op=op;
		this.left =left;
		this.right=right;
		
	}
}
