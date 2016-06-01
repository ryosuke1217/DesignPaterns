package test2;

public class Main {
	public static void main(String args[]) {
		WesternPerson westerPerson = new WesternPerson("Albelt", "Einstein", 26);
		EasternPerson easternPerson = new EasternPerson("信長", "織田",43);
		Person me = new Person("佐々木", "良輔", 28);

		System.out.println(westerPerson.getFullName());
		System.out.println(easternPerson.getFullName());
		System.out.println(me.getFamilyName());
		System.out.println(westerPerson.getFamilyName());
		System.out.println(easternPerson.getAge());

		Person[] people = {
		                   new WesternPerson("Albert", "Einstein", 26),
		                   new EasternPerson("信長", "織田", 47),
		                   new WesternPerson("Isaac", "Newton", 43),
		                   new EasternPerson("秀吉", "豊臣", 61),
		                   new WesternPerson("Galileo", "Galilei", 46),
		                   new EasternPerson("家康", "徳川", 73),
		};
		for(Person person : people) {
			System.out.println(person.getFullName());
		}
	}
}
