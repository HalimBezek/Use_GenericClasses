package com.halim.genericclasslar;

//buradaki E asl�nda g�nderilen fakl� t�rden verileri E nerede varsa o t�rde kullan demek oluyor diyebliliriz.
public class YazdirmaSinifi<E> {
	
	public void yazdir(E[] dizi) {
		
		for(E e: dizi) //for-each dong�s�
		{
			System.out.println(e); //not : ogrenci s�n�f� i�indeki toString metodu obje yazd�r�lmak istendi�inde aktifle�ip yazd�r�lm�� oldu.
		}
	}

}
