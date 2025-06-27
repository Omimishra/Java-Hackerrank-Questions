import java.util.Calendar;
import java.util.Locale;

public class date_time {
    //You are given a date. You just need to write the method which returns the day on that date. To simplify your task, we have provided a portion of the code in the editor.
    // https://www.hackerrank.com/challenges/java-date-and-time/problem?isFullScreen=true
    public static String findDay(int month, int day, int year) {
  Calendar cal = Calendar.getInstance();  // Create a Calendar instance
        // Set the date to the specified year, month, and day
        cal.set(year, month - 1, day);  
        return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase(); // Get the day of the week in long format and convert to uppercase
    }
}
