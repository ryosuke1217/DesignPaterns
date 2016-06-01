package state;

public class Yumichan {
	private State state = null;

	void changeState(State state) {
		this.state = state;
	}

	public String morningGreet() {
		return this.state.morningGreet();
	}

	public String getProtectionForCold() {
		return this.state.getProtectionForCold();
	}
}
