import java.util.Arrays;

public class Check_intervals_08 {
    public static boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        for (int i = 0; i < intervals.length - 1; i++) {
            if (intervals[i][1] > intervals[i + 1][0]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] intervals = { { 0, 30 }, { 5, 10 }, { 15, 20 } };

        boolean canAttendAllMeetings = canAttendMeetings(intervals);

        System.out.println("Can attend all meetings : " + canAttendAllMeetings);
    }
}
