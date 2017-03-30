package edu.wmich.cs1120.la5;

public class Literal implements IExpression {
private Integer value;
	@Override
	public Integer getValue() {
		// TODO Auto-generated method stub
		return value;
	}
	public void setValue(Integer value) {
		// TODO Auto-generated method stub
		this.value =value;
	}
	public Literal(int val){
		this.value = val;
	}
}
