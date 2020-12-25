package task01;

public class MonthValues {

	Months[] masMon = Months.values();
	private String string;
	boolean flag = false;

	public MonthValues(String string) {
		super();
		for (Months m : masMon) {
			if (m.name().equals(string)) {
				System.out.println(string);
				flag = true;
			}
		}
		if (flag) {
			this.string = string;
		}

	}

	public String getString() {
		return string;
	}

}