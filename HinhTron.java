package com.shape;

class HinhTron implements IHinhHoc {
	private double rad;
	
	public HinhTron(double rm) {
		this.rad = rm;
	}
	
	@Override
	public double chuVi() {
		return 2 * Math.PI * this.rad;
	}

}
