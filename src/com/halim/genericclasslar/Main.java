package com.halim.genericclasslar;

import java.util.ArrayList;

/**generic class lar ve generic metotlar asl�nda bir�ok t�r� desteklemek i�in kullan�labilecek durumlard�.
 * *�rne�in toplama(int a, int b) gibi bir metoda sadece int de�erler g�nderilebilir.
 * *bu durumdan kurtulmak i�in yani t�rden ba��ms�z i�lem yapmak i�in generic class lar kullan�r�z.
 * 	ArrayList<String> arrayList1 = new ArrayList<String>();
	ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
	bu arraylist durumunda g�r�ld��� gibi String ve ya Integer de�erler alabilmektedir.
 * */
public class Main {

	public static void main(String[] args) {

		Character[] char_dizi = {'j','a','v','a'};
		Integer[]  int_dizi = {1,2,3,4,5,6};
		String[] string_dizi = {"java","c++","php"};
		Ogrenci[] ogrenci_dizi = {new Ogrenci("Mustafa"),new Ogrenci("Merve"),new Ogrenci("Mehmet")};
	/*Normalde bunlar�n hepsini yazd�rmak i�in ayr� ayr� class veye metotlar ile sa�lamam�z gerekiyordu.
	 * bu durumda asl�nda hepsi yazd�rmayla alakal� olurdu sadce t�r farkl�d�r.*/
		

		YazdirmaSinifi<Character> character_yazdir = new YazdirmaSinifi<Character>(); //E nin yerine Character dizisi gidecek;
		YazdirmaSinifi<Integer> Integer_yazdir = new YazdirmaSinifi<Integer>();
		YazdirmaSinifi<String> String_yazdir = new YazdirmaSinifi<String>();
		YazdirmaSinifi<Ogrenci> Ogrenci_yazdir = new YazdirmaSinifi<Ogrenci>();
		
		character_yazdir.yazdir(char_dizi);//diziyi yazd�rmas� i�in gonderdik
		System.out.println("*************************************");
		Integer_yazdir.yazdir(int_dizi);
		System.out.println("*************************************");
		String_yazdir.yazdir(string_dizi);
		System.out.println("*************************************");
		Ogrenci_yazdir.yazdir(ogrenci_dizi);
	}

}
