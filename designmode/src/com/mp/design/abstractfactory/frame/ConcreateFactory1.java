package com.mp.design.abstractfactory.frame;

public class ConcreateFactory1 implements AbstracFactory{

	@Override
	public AbstractProductA createProductA() {
		return new ProductA1();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ProductB1();
	}
	
}
