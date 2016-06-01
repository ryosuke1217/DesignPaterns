package Calc;
import java.util.HashMap;
import java.util.Map;

public class Wadayama {
	private static Map<String,Calc.Memento> map = new HashMap<String,Calc.Memento>();

	public static void main(String arags[]) {
		Calc calc = new Calc();
		for (int n = 1; n <= 5; n++)  {
			calc.plus(n);
		}
		System.out.println(calc.getTemp());
		map.put("5までの足し算", calc.createMemento());

		Calc calc2 = new Calc();
		calc2.setMemento(map.get("5までの足し算"));
		for(int n  = 6; n<= 10; n++) {
			calc2.plus(n);
		}
		System.out.println(calc2.getTemp());
		map.put("10までの足し算", calc2.createMemento());

		Calc calc3 = new Calc();
		calc3.setMemento(map.get("10までの足し算"));
		for(int n = 11; n <= 90; n++)
		{
			calc3 .plus(n);
		}
		System.out.println(calc3.getTemp());
		map.put("90までの足し算", calc3.createMemento());
	}
}
