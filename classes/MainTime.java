// Define the Time class with the required methods
class Time {
    // Attributes (Fields)
    private int hour; // 0-23 for 24-hour clock
    private int minute; // 0-59
    private int second; // 0-59

    // Method a: setTime to set hour, minute, and second
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

    // Method b: setHour to set only the hour
    public void setHour(int hour) {
        if (hour >= 0 && hour < 24) {
            this.hour = hour;
        } else {
            System.out.println("Invalid hour. Must be between 0 and 23.");
        }
    }

    // Method c: setMinute to set only the minute
    public void setMinute(int minute) {
        if (minute >= 0 && minute < 60) {
            this.minute = minute;
        } else {
            System.out.println("Invalid minute. Must be between 0 and 59.");
        }
    }

    // Method d: setSeconds to set only the seconds
    public void setSeconds(int second) {
        if (second >= 0 && second < 60) {
            this.second = second;
        } else {
            System.out.println("Invalid second. Must be between 0 and 59.");
        }
    }

    // Method e: printUniversal to print time in 24-hour format (HH:MM:SS)
    public void printUniversal() {
        System.out.printf("%02d:%02d:%02d\n", hour, minute, second);
    }

    // Method f: printStandard to print time in 12-hour format with AM/PM
    public void printStandard() {
        String period;
        int standardHour = hour;

        if (hour == 0) {
            standardHour = 12; // Midnight is 12 AM
            period = "AM";
        } else if (hour == 12) {
            period = "PM"; // Noon is 12 PM
        } else if (hour > 12) {
            standardHour = hour - 12; // Convert to 12-hour format
            period = "PM";
        } else {
            period = "AM";
        }

        System.out.printf("%02d:%02d:%02d %s\n", standardHour, minute, second, period);
    }
}

// Define the Main class to test the Time class
public class MainTime {
    public static void main(String[] args) {
        // Create an object of Time class
        Time time = new Time();

        // Set time to 13:45:20 (1:45:20 PM)
        time.setTime(13, 45, 20);

        // Print time in 24-hour format
        System.out.print("Universal time: ");
        time.printUniversal(); // Output: 13:45:20

        // Print time in 12-hour format with AM/PM
        System.out.print("Standard time: ");
        time.printStandard(); // Output: 01:45:20 PM

        // Set hour to 23 (11:00:00 PM) and update minute and second
        time.setHour(23);
        time.setMinute(0);
        time.setSeconds(0);

        // Print updated time in both formats
        System.out.print("Universal time: ");
        time.printUniversal(); // Output: 23:00:00

        System.out.print("Standard time: ");
        time.printStandard(); // Output: 11:00:00 PM
    }
}