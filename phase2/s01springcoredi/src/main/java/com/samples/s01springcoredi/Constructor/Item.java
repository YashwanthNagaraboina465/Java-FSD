package com.samples.s01springcoredi.Constructor;

public class Item {
	
	private int id;
	private String Name;
	private String Price;
	private double Quantity;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("inside Setter");
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		Price = price;
	}
	public double getQuantity() {
		return Quantity;
	}
	public Item() {
		super();
	}
	public void setQuantity(double quantity) {
		Quantity = quantity;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", Name=" + Name + ", Price=" + Price + ", Quantity=" + Quantity + "]";
	}
public void m1() {
	System.out.println("inside m1");
}
}
