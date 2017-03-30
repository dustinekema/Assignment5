package edu.wmich.cs1120.la5;
/**
 * This method will add the two numerical data pieces together if the symbol that goes with them is "-"
 * Subtraction implements IOperaction
 * @author Ricardo Quiroga
 * @author Dustin Ekema
 *
 */
public class Subtraction implements IOperation {

	@Override
	public Integer perform(IExpression left, IExpression right) {
		return left.getValue() - right.getValue();
	}

}
