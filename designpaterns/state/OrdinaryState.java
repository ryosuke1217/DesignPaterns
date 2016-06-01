package state;

public class OrdinaryState implements State {
	public String morningGreet() {
		return "おっす！";
	}

	public String getProtectionForCold() {
		return "走る";
	}
}
