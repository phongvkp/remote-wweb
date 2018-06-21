package com.shape;

public final class ShapeFactory {
	
	/**
	 * Chi tinh chu vi hinh tron va tu giac
	 * @param hinh : "tron" hoac "" (tu giac)
	 * @param args "tron": ban kinh "": dai x rong
	 * @return interface IHinhHoc
	 */
	public static IHinhHoc layChuVi(String hinh, double[] args) {
		if (hinh.equalsIgnoreCase("tron")) {
			return new HinhTron(args[0]);
		} else {
			return new HinhTuGiac(args[0], args[1]);
		}			
	}
	
}
