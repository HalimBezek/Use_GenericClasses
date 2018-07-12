package com.halim.genericclasslar;

//buradaki E aslýnda gönderilen faklý türden verileri E nerede varsa o türde kullan demek oluyor diyebliliriz.
public class YazdirmaSinifi<E> {
	
	public void yazdir(E[] dizi) {
		
		for(E e: dizi) //for-each dongüsü
		{
			System.out.println(e); //not : ogrenci sýnýfý içindeki toString metodu obje yazdýrýlmak istendiðinde aktifleþip yazdýrýlmýþ oldu.
		}
	}

}
