package edu.wmich.cs1120.la5;
/** This method takes value and returns the integer value 
 * @author Ricardo Quiroga
 * @author Dustin Ekema
 * @param value
 */
public class Literal implements IExpression {
private Integer value;
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
		this.value =value;
	}
	/**
	 * creates int val and is the constructor for Literal 
	 * @param val
	 */
	public Literal(int val){
		this.value = val;
	}
}
