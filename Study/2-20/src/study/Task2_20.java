package study;

public class Task2_20 {

	public static void main(String[] args) {
		//④子クラスを元にしたインスタンスを作成して下さい。(インスタンス名：child)
		Child  child = new Child ();
		
		//⑤インスタンスchildでcallNameメソッドを呼び出して下さい。
		child.callName();
		
		//⑥インスタンスchildでupdateメソッドを呼び出して下さい。
		child.update();
		
		//⑦オーバーロードされたargumentメソッドを呼び出し解答画像になるように出力して下さい。
		child.argument();        // 引数0つの argument() を呼び出す
		child.argument(1);       // 引数1つの argument(int) を呼び出す
		child.argument(1, 1);
		

		
		
	}

}