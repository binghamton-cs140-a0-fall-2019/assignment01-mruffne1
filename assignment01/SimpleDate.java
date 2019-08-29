package assignment01;

public class SimpleDate {

	public int year;
	public int month;
	public int day;

	public static SimpleDate of(int yr, int m, int d) {
		SimpleDate returnValue = new SimpleDate();
		returnValue.year = yr;
		returnValue.month = m;
		returnValue.day = d;

		return returnValue;
	}

	public boolean before(SimpleDate other) {
		if (this.year < other.year) {
			return true;
		} else if ((this.year == other.year) && (this.month < other.month)) {
			return true;
		} else if ((this.year == other.year) && (this.month == other.month) && (this.day < other.day)) {
			return true;
		}

		return false;
	}
}
