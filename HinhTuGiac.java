package com.shape;

class HinhTuGiac implements IHinhHoc {
	
	private double dai,rong;
	
	public HinhTuGiac(double d, double r) {
		this.dai = d;
		this.rong = r;
	}

	@Override
	public double chuVi() {
		return (this.dai + this.rong) * 2;
	}

}
