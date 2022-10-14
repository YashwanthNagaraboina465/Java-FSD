package com.samples.s01springcoredi.Constructor;

public class ShoppingMall {
	private Item item1;
	private int Sno;

	public ShoppingMall(Item item1, int sno) {
		super();
		this.item1 = item1;
		Sno = sno;
	}

	public Item getItem1() {
		return item1;
	}

	public void setItem1(Item item1) {
		this.item1 = item1;
	}

	@Override
	public String toString() {
		return "ShoppingMall [item1=" + item1 + ", Sno=" + Sno + "]";
	}

	

}
