package studio8;

import java.util.Objects;

public class Appointment {
	
	private Class Date;
	private Class Time;
	private Date date;
	private Time time;
	
	public Appointment(Date date, Time time) {
		this.date = date;
		this.time = time;
	}

	public static void main(String[] args) {
		Date date = new Date(12, 16, 2002, false);
		Time time = new Time(1, 28, false);
		
		Appointment hookup = new Appointment(date,time);
		System.out.println(hookup);
	}
	
	public String toString() {
		return date + " " + time;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(Date, Time);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(Date, other.Date) && Objects.equals(Time, other.Time);
	}

}
