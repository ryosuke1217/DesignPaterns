package test;

public class ClassOfGenericsExtends {
	/**
	 * ジェネリックなクラスを定義します。
	 * 継承クラスはBaseクラスを指定します。
	 * @param <T>
	 */
	private static class Example<T extends Base> {
		private T param;
		public T getParam() {
			return param;
		}
		public void setParam(T param) {
			this.param = param;
		}
	}
	/**
	 * ジェネリクスで指定されるextendsクラスです。
	 */
	private static abstract class Base {
		public String baseParam;
	}
	/**
	 * Baseを継承したクラスです。
	 * その１
	 */
	private static class Abase extends Base {
	}
	/**
	 * Baseを継承したクラスです。
	 * その２
	 */
	private static class Bbase extends Base {
	}
	/**
	 * メイン処理です。
	 */
	public static void main(String arg[]) {
		// Abaseを生成します。
		Abase aClass = new Abase();
		aClass.baseParam = "これはAbaseクラスです。";
		// ジェネリクスにAbaseを指定します。
		Example<Abase> aExample = new Example<Abase>();
		aExample.setParam(aClass);
		System.out.println(aExample.getParam().baseParam);

		// Bbaseを生成します。
		Bbase bClass = new Bbase();
		bClass.baseParam = "これはBbaseクラスです。";

		// ジェネリクスにBbaseを指定します。
		Example<Bbase> bExample = new Example<Bbase>();
		bExample.setParam(bClass);
		System.out.println(bExample.getParam().baseParam);
	}
}
