
import java.util.*;

public class MedRecordsClient extends MedRecords {

	public MedRecordsClient(int age, String name, String bloodType) {
		super(name, age, bloodType);
	}

	public static void main(String[] args) {
		ArrayList<MedRecords> list1 = new ArrayList<MedRecords>();
		list1.add(new MedRecords("Jack", 7, "A"));
		list1.add(new MedRecords("Jessi", 10, "O"));
		list1.add(new MedRecords("Jack", 7, "A"));
		list1.add(new MedRecords("Monica", 8, "AB"));
		list1.add(new MedRecords("Bill", 9, "B"));
		list1.add(new MedRecords("Pete", 56, "AB"));
		list1.add(new MedRecords("David", 56, "O"));
		list1.add(new MedRecords("Conner", 18, "AB"));
		list1.add(new MedRecords("Riley", 20, "B"));
		list1.add(new MedRecords("Styles", 23, "O"));

		System.out.println("Before : " + list1);
		Collections.sort(list1);
		System.out.println("After  : " + list1);
	}

}
