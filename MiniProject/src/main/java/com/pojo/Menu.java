package com.pojo;

public class Menu {
	private int id, price, qty, available;
	private String name, type;
	@Override
	public String toString() {
		return "Menu [id=" + id + ", price=" + price + ", qty=" + qty + ", available=" + available + ", name=" + name
				+ ", type=" + type + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public Menu(int id, int price, int qty, int available, String name, String type) {
		super();
		this.id = id;
		this.price = price;
		this.qty = qty;
		this.available = available;
		this.name = name;
		this.type = type;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getAvailable() {
		return available;
	}
	public void setAvailable(int available) {
		this.available = available;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
