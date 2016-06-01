package test2;

public class WesternPerson extends Person{

	WesternPerson(String initialGivenName, String initialFamilyName, Integer initialAge) {
		super(initialGivenName, initialFamilyName, initialAge);
	}

	public String getFullName() {
		return getFamilyName() + " " + getGivenName();
	}
}
