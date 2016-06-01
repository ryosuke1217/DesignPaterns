package state;

public class BadMoodState implements State {
	public String morningGreet() {
		return "おお";
	}

	public String getProtectionForCold() {
		return "ももひき";
	}
}
