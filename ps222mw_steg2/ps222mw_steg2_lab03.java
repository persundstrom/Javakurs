/**
 *  ps222mw_steg2_lab03.java
 *	Programmet sätter tiden till 23.48 och ställer ett alarm på 6.15. Sen tickar programmet 500min.
 *  2014-06-19
 *  Per Sundström
 */

package ps222mw_steg2;

public class ps222mw_steg2_lab03 {
	public static void main(String[] args) {
		AlarmClock klocka = new AlarmClock(23, 48); // skapa ett objekt och skicka in 23,48 till konstruktorn i AlarmClock-klassen
		klocka.display(); // visa klockan
		klocka.setAlarmTime(6, 15); // sätt veckarklockan
		
		for (int i = 0; i < 500; i++) { // loopa 500 ggr
			klocka.timeTick();
		}
		klocka.display(); // visa klockan igen
	}
}

class AlarmClock {
	private int hours;
	private int minutes;
	private int alarmHours;
	private int alarmMinutes;
	private boolean alarmOn;

	public AlarmClock() {
		hours = 0;
		minutes = 0;
		alarmHours = 0;
		alarmMinutes = 0;
		alarmOn = false;
	}

	public AlarmClock(int hours, int minutes) {
		this.hours = hours;
		this.minutes = minutes;
		alarmHours = 0;
		alarmMinutes = 0;
		alarmOn = false;
	}

	public void setAlarmTime(int hours, int minutes) {
		alarmHours = hours;
		alarmMinutes = minutes;
		alarmOn = true;
	}

	public void setAlarmTime(boolean alarmOn) {
		this.alarmOn = alarmOn;
	}

	public void display() {
		if (minutes < 10) {
			System.out.printf("%d:0%d%n", hours, minutes);
		} else {
			System.out.printf("%d:%d%n", hours, minutes);
		}
	}

	public void timeTick() {
		++minutes;
		if (minutes == 60) {
			minutes = 0;
			++hours;
			if (hours == 24) {
				hours = 0;
			}
		}
		checkAlarm();
	}

	private void checkAlarm() {
		if (alarmOn && hours == alarmHours && minutes == alarmMinutes) {
			String time;
			if (minutes < 10) {
				time = String.format("%d:0%d", hours, minutes);
			} else {
				time = String.format("%d:%d", hours, minutes);
			}
			System.out.println(time + " - VAKNA, det är dags att gå upp!");
		}
	}
}
