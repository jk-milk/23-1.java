package Unit5;
public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        this(0, 0, 0);
    }

    public Time(int hour, int minute, int second) {
        if (0 <= hour && hour <= 23) {
            this.hour = hour;
        } else {
            this.hour = 0;
        }

        if (0 <= minute && minute <= 59) {
            this.minute = minute;
        } else {
            this.minute = 0;
        }

        if (0 <= second && second <= 59) {
            this.second = second;
        } else {
            this.second = 0;
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
