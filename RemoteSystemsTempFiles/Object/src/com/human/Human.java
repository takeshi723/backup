package com.human;

public class Human {
	public static String sei;
	/*フィールド変数　このクラス内ならどのメソッドでも使用できる変数*/
	public static String mei;

	public static void main(String[] args) {
		System.out.println("人間クラスのMainメソッド");

		HumanName humanName = new HumanName();

		String sei = humanName.sei;

		String mei = humanName.getMei();

		System.out.println(humanName.getName());

		HumanName humanName2 = new HumanName("tanaka","tarou");

		System.out.println(humanName2.getName());
	}
	/*ドット+スペースで補完できる*/

	    public String getName(){

	    	this.mei = "姓";
	    	this.mei = "名";

	    	return sei + mei;
	    }
}