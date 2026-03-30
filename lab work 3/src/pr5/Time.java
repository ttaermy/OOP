package pr5;

class Time implements Comparable<Time> {

    private int hours;
    private int minutes;
    private int seconds;

    public Time(int h, int m, int s) {
        this.hours = h;
        this.minutes = m;
        this.seconds = s;
    }

    public String toString() {
        return hours + ":" + minutes + ":" + seconds;
    }

    public int compareTo(Time other) {
        if (this.hours != other.hours)
            return this.hours - other.hours;

        if (this.minutes != other.minutes)
            return this.minutes - other.minutes;

        return this.seconds - other.seconds;
    }
}
