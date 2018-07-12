package com.halim.genericclasslar;

public class Ogrenci {

	private String isim;

	public Ogrenci(String isim) {
		super();
		this.isim = isim;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	@Override //bu toString ile bu Oðrenci objesini sysout ile direk yazýlabilmesini saðlar.
	public String toString() {

		return "Isým : " + isim;
	}
	
	
	
}
