package com.effective.java.item36;

public interface ChildInterface extends BaseInterface {
	
	// Writing out all these methods with Override annotation again here in the childInterface, isn't it a lot of code duplication?? 
	@Override
	public int size();
	
	@Override
	public void remove(Object o);

}
