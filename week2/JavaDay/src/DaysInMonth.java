import java.util.Scanner;
public class DaysInMonth {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        int daysinMonth=0;
	        String MonthName = "Invalid";

	        System.out.println("Enter the month number: ");
	        String month = sc.next();

	        System.out.println("Enter the Year: ");
	        int year = sc.nextInt();

	        switch (month) {

	            case"1":
	            case "January":
	            case "Jan":
	            case " Jan.":
	                MonthName = "January";
	                daysinMonth = 31;
	                break;
	            case "2":
	            case "February":
	            case "Feb":
	            case "Feb.":
	                MonthName = "February";
	                if ((year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0))) {
	                    daysinMonth = 29;
	                    break;
	                } else {
	                    daysinMonth = 28;
	                    break;
	                }
	            case "3":
	            case "March":
	            case "Mar":
	            case "Mar.":
	                MonthName = "March";
	                daysinMonth = 31;
	                break;
	            case "4":
	            case "April":
	            case "Apr":
	            case "Apr.":
	                MonthName = "April";
	                daysinMonth = 30;
	                break;
	            case "5":
	            case "May":
	                MonthName = "May";
	                daysinMonth = 31;
	                break;
	            case "6":
	            case "June":
	            case "Jun":        
	                MonthName = "June";
	                daysinMonth = 30;
	                break;
	            case "7":
	            case "July":
	            case "Jul":
	                MonthName = "July";
	                daysinMonth = 31;
	                break;
	            case "8":
	            case "August":
	            case "Aug":
	            case "Aug.":
	                MonthName = "August";
	                daysinMonth = 31;
	                break;
	            case "9":
	            case "September":
	            case "Sep":
	            case "Sept.":
	                MonthName = "September";
	                daysinMonth = 30;
	                break;
	            case "10":
	            case "October":
	            case "Oct":
	            case "Oct.":
	                MonthName = "October";
	                daysinMonth = 31;
	                break;
	            case "11":
	            case "November":
	            case "Nov":
	            case "Nov.":            
	                MonthName = "November";
	                daysinMonth = 30;
	                break;
	            case "12":
	            case "December":
	            case "Dec":
	            case "Dec.":
	                MonthName = "December";
	                daysinMonth = 31;
	                break;
	        }
	        System.out.println(MonthName+" "+year+" has "+daysinMonth+" days\n");

	}

}
