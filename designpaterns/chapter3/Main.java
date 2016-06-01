package chapter3;

public class Main {
	public static void main(String[] args){
		//"H"をもったCharDisplayのインスタンスを1個作る。
		AbstractDisplay d1 = new CharDisplay('H');
		//"Hello, world"をもったStringDisplayのインスタンスを1個作る。
		AbstractDisplay d2 = new StringDisplay("Hello, world");
		//"こんにちは"をもったStringDisplayのインスタンスを1個作る。
		AbstractDisplay d3 = new StringDisplay("こんにちは。");
		d1.display();
		d2.display();
		d3.display();
	}
}
