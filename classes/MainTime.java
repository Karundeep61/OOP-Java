class Time {
    private int hour;
    private int minute;
    private int second;

    public void setTime(int hour, int minute, int second) {
        if (hour >= 0 && hour < 24) {
            this.hour = hour;
        }
        if (minute >= 0 && minute < 60) {
            this.minute = minute;
        }
        if (second >= 0 && second < 60) {
            this.second = second;
        }
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour < 24) {
            this.hour = hour;
        } else {
            System.out.println("Invalid hour");
        }
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute < 60) {
            this.minute = minute;
        } else {
            System.out.println("Invalid minute");
        }
    }

    public void setSeconds(int second) {
        if (second >= 0 && second < 60) {
            this.second = second;
        } else {
            System.out.println("Invalid second");
        }
    }

    public void printUniversal() {
        System.out.printf("%2d:%2d:%2d", hour, minute, second);
    }

    public void printStandard() {
        String period;
        int standardHour = hour;

        if (hour == 0) {
            standardHour = 12;
            period = "AM";
        } else if (hour == 12) {
            period = "PM";
        } else if (hour > 12) {
            standardHour = hour - 12;
            period = "PM";
        } else {
            period = "AM";
        }

        System.out.printf("%02d:%02d:%02d %s", standardHour, minute, second, period);
    }
}

public class MainTime {
    public static void main(String[] args) {
        // Create an object of Time class
        Time time = new Time();

        // Set time to 13:45:20 (1:45:20 PM)
        time.setTime(13, 45, 20);

        // Print time in 24-hour format
        System.out.println("Universal time: ");
        time.printUniversal(); // Output: 13:45:20

        // Print time in 12-hour format with AM/PM
        System.out.println("Standard time: ");
        time.printStandard(); // Output: 01:45:20 PM

        // Set hour to 23 (11:00:00 PM) and update minute and second
        time.setHour(23);
        time.setMinute(0);
        time.setSeconds(0);

        // Print updated time in both formats
        System.out.println("Universal time: ");
        time.printUniversal(); // Output: 23:00:00

        System.out.println("Standard time: ");
        time.printStandard(); // Output: 11:00:00 PM
    }
}