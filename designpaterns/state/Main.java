package state;

public class Main {
	public static void main(String[] args) {
		State badmood = new BadMoodState();
		State ordinary = new OrdinaryState();
		Yumichan yumichan = new Yumichan();

		System.out.println(badmood.morningGreet());
		System.out.println(badmood.getProtectionForCold());
		System.out.println(ordinary.morningGreet());
		System.out.println(ordinary.getProtectionForCold());

		yumichan.changeState(ordinary);
		System.out.println(yumichan.morningGreet());
		System.out.println(yumichan.getProtectionForCold());
		
	}
}
