package studio8;

import java.util.Objects;

public class Time {
	
	private int hour;
	private int minute;
	private boolean typeHour; //24 hour = true

	public Time(int hour, int minute, boolean typeHour) {
		this.hour = hour;
		this.minute = minute;
		this.typeHour = typeHour;
	}
	
	public String toString() {
		return hour + ":" + minute;
	}
	
	public static void main(String args[]) {
		Time rightNow = new Time(1, 28, false);
		System.out.print(rightNow);
	}

	@Override
	public int hashCode() {
		return Objects.hash(hour, minute, typeHour);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute && typeHour == other.typeHour;
	}

}