package test;

public class ClassOfGenerics {

	/**
	 * ジェネリクスなクラスを定義します。
	 * @param <T>      
	 */
	private static class Example<T> {
		private T param;

		public T getParam() {
			return param;
			}

		public void setParam(T param) {
			this.param = param;
			}
	}
	/**
	** メイン処理です
	*/
	public static void main(String arg[]) {
	// ジェネリクスにStringを指定します。
	Example<String> strExample = new Example<String>();
	strExample.setParam("test!");
	System.out.println("ジェネリクスな型にStringを指定した結果:"
			+ strExample.getParam());
	// ジェネリクスにIntegerを指定します。
	Example<Integer> intExample = new Example<Integer>();
	intExample.setParam(1);
	System.out.println("ジェネリクスな型にIntegerを指定した結果:" + intExample.getParam());
	}
}
