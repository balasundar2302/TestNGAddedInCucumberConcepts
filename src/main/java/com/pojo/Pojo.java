package com.pojo;

public class Pojo {

	int i = 10;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public static void main(String[] args) {
		Pojo po = new Pojo();
		System.out.println(po.getI());

		po.setI(20);
		System.out.println(po.getI());
	}

}
