package chap_8;

public class Main1 {

	public static void main(String[] args) {
		//聖職者インスタンスを生成
	    Cleric c = new Cleric();
	    //名前を定義
	    c.name = "聖職者A";
	    //mpを定義
	    c.mp = 5;
	    
	    //メソッドの実行
	    c.selfAid();
	    c.pray(5);
	}

}