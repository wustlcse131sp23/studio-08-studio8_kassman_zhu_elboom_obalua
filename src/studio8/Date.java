package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {

	private int month;
	private int day;
	private int year;
	private boolean holiday;
	
	public Date(int month, int day, int year, boolean holiday) {
		this.month = month;
		this.day = day;
		this.year = year;
		this.holiday = holiday;
	}
	
	public String toString() {
		return month + " " + day + " " + year + " " + "holiday: " + holiday;
	}
	
	public static void main(String args[]) {
		Date katie = new Date(12, 15, 2003, true);
		Date drew = new Date(9, 28, 2002, true);
		Date tobi = new Date(4, 15, 2005, false);
		Date josh = new Date(1, 20, 2004, false);
		Date paul = new Date(12, 16, 2002, false);
		
		Date d1 = new Date(1, 1, 2000, true);
		Date d2 = new Date(1, 1, 2000, true);
		
		//LinkedList<Date> list = new LinkedList<Date>();
		/*list.add(katie);
		list.add(drew);
		list.add(tobi);
		list.add(josh);
		list.add(paul);*/
		
		//list.add(d1);
		//list.add(d2);
		//list.add(d1);
		
		HashSet<Date> set = new HashSet<Date>();
	
		set.add(d1);
		set.add(d2);
		set.add(d1);
		
		System.out.println(set);
		
		//System.out.println(katie);
		//System.out.println(drew);
		//System.out.println(drew.equals(katie));
	}

	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}

}
