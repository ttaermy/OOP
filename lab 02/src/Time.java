public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        if (hour < 0 || hour > 23 ||
        minute < 0 || minute > 59 ||
        second < 0 || second > 59) {
            throw new IllegalArgumentException("Invalid time");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toUniversal() {
        return String.format("%2d:%02d:%02d", hour, minute, second);
    }

    public String toStandard() {
        int standardHour = hour % 12;
        if (standardHour == 0) {
            standardHour = 12;
        }

        String period = (hour < 12) ? "AM" : "PM";

        return String.format("%02d:%02d:%02d %s",
                standardHour, minute, second, period);
    }

    public void add(Time other) {
        this.second += other.second;
        this.minute += other.minute + this.second / 60;
        this.hour += other.hour + this.minute / 60;

        this.second %= 60;
        this.minute %= 60;
        this.hour %= 24;
    }

    public static void main(String[] args) {
        Time t1 = new Time(23, 5, 6);
        System.out.println("Universal: " + t1.toUniversal());
        System.out.println("Standard: " + t1.toStandard());

        Time t2 = new Time(4, 24, 33);
        t1.add(t2);

        System.out.println("After add: " + t1.toUniversal());
    }
}