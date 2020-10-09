
public class MedRecords implements Comparable<MedRecords> {
	private int age;
	private String name, bloodType;

	public MedRecords(String name, int age, String bloodType) {
		this.name = name;
		this.age = age;
		this.bloodType = bloodType;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public String getBloodType() {
		return bloodType;
	}

	public String toString() {
		return "(" + name + "," + age + "," + bloodType + ")";
	}

	public int compareTo(MedRecords o) {
		if (name != o.name) {
			return name.compareTo(o.name);
		} else if (age > o.age) {
			return 1;
		} else if (o.age > age) {
			return -1;
		} else {
			return bloodType.compareTo(o.bloodType);

		}

	}

}
