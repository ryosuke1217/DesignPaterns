package test2;

public class EasternPerson extends Person{

	EasternPerson(String initialGivenName, String initialFamilyName, Integer initialAge) {
		super(initialGivenName, initialFamilyName, initialAge);
	}

	public String getFullName() {
		return getGivenName() + super.getFullName();
		//return super.getFamilyName() + " " + super.getGivenName();
	}
}
