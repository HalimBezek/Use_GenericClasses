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

	@Override //bu toString ile bu O�renci objesini sysout ile direk yaz�labilmesini sa�lar.
	public String toString() {

		return "Is�m : " + isim;
	}
	
	
	
}
