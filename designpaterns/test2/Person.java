package test2;

public class Person {
	private String givenName;
	private String familyName;
	private Integer age;

	public Person(String initialGivenName, String initialFamilyName, Integer initialAge) {
		this.givenName = initialGivenName;
		this.familyName = initialFamilyName;
		this.age = initialAge;
	}

	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String newGivenName) {
		this.givenName = newGivenName;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String newFamilyName) {
		this.familyName = newFamilyName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer newAge) {
		this.age = newAge;
	}

	public String getFullName(){
		 return "a";
	 }
}
