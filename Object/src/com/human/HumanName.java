package com.human;

public class HumanName {

		public String sei;
	    private String mei;

	    public HumanName(){
	    	/*コンストラクタ　インスタンス化のコピー
	    	 * フィールド変数に値を入れる=変数の初期化*/
	    	sei = "姓";
	    	mei = "名";
	    }
	    	/*getName=名前を取得するメソッド
	    	 * String 返ってくるデータ型を指定→String型を返す*/

	    public HumanName(String sei, String mei){

	    	this.sei = sei;
	    	this.mei = mei;
	    }


        public String getName(){
        	return sei + mei;
        }

        public String getMei(){
        	return mei;
        }
}