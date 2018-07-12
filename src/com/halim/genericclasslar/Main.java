package com.halim.genericclasslar;

import java.util.ArrayList;

/**generic class lar ve generic metotlar aslýnda birçok türü desteklemek için kullanýlabilecek durumlardý.
 * *örneðin toplama(int a, int b) gibi bir metoda sadece int deðerler gönderilebilir.
 * *bu durumdan kurtulmak için yani türden baðýmsýz iþlem yapmak için generic class lar kullanýrýz.
 * 	ArrayList<String> arrayList1 = new ArrayList<String>();
	ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
	bu arraylist durumunda görüldüðü gibi String ve ya Integer deðerler alabilmektedir.
 * */
public class Main {

	public static void main(String[] args) {

		Character[] char_dizi = {'j','a','v','a'};
		Integer[]  int_dizi = {1,2,3,4,5,6};
		String[] string_dizi = {"java","c++","php"};
		Ogrenci[] ogrenci_dizi = {new Ogrenci("Mustafa"),new Ogrenci("Merve"),new Ogrenci("Mehmet")};
	/*Normalde bunlarýn hepsini yazdýrmak için ayrý ayrý class veye metotlar ile saðlamamýz gerekiyordu.
	 * bu durumda aslýnda hepsi yazdýrmayla alakalý olurdu sadce tür farklýdýr.*/
		

		YazdirmaSinifi<Character> character_yazdir = new YazdirmaSinifi<Character>(); //E nin yerine Character dizisi gidecek;
		YazdirmaSinifi<Integer> Integer_yazdir = new YazdirmaSinifi<Integer>();
		YazdirmaSinifi<String> String_yazdir = new YazdirmaSinifi<String>();
		YazdirmaSinifi<Ogrenci> Ogrenci_yazdir = new YazdirmaSinifi<Ogrenci>();
		
		character_yazdir.yazdir(char_dizi);//diziyi yazdýrmasý için gonderdik
		System.out.println("*************************************");
		Integer_yazdir.yazdir(int_dizi);
		System.out.println("*************************************");
		String_yazdir.yazdir(string_dizi);
		System.out.println("*************************************");
		Ogrenci_yazdir.yazdir(ogrenci_dizi);
	}

}
