import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class DateUtils {
	
	public static int CompareTwoDate(MyDate date1, MyDate date2) {	
		LocalDate lodate1 = LocalDate.of(date1.getYear(), date1.getMonth(), date1.getDay());
		LocalDate lodate2 = LocalDate.of(date2.getYear(), date2.getMonth(), date2.getDay());
		return lodate1.compareTo(lodate2);
	}
	
	public static void datesort(MyDate[] date,int length ) {
		for(int i = 0; i < length; i++) {
			for(int j = 0; j <length; j++) {
				if(CompareTwoDate(date[i], date[j]) < 0) {
					MyDate temp = date[i];
					date[i] = date[j];
					date[j] = temp;
				}
			}
		}	
	}
}