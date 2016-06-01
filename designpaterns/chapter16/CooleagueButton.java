package chapter16;
import java.awt.Button;

public class CooleagueButton extends Button implements Colleague {
	private Mediator mediator;
	public CooleagueButton(String caption) {
		super(caption);
	}
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}
	public void setColleagueEnabled(boolean enabled) {
		setEnabled(enabled);
	}
}
