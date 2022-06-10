
public class DateTest {
	
	public static void main(String[] args) {			
		MyDate date[] = new MyDate[10];
		int datecount =0;
		date[0]= new MyDate(14,03,2001);
		datecount ++;
		date[0].print();
		
		date[1]= new MyDate("January 14th 2021");
		datecount ++;
		date[1].print();	
		
		if(DateUtils.CompareTwoDate(date[0], date[1])<0) {
			 System.out.println("First Day is after Second day about:" + DateUtils.CompareTwoDate(date[1], date[0]) +" days" );
		}else if(DateUtils.CompareTwoDate(date[0], date[1])==0) {
			System.out.println("Both Days are equal. ");
		}else {
			System.out.println("First day is before second day about: " + DateUtils.CompareTwoDate(date[0], date[1])+ " days");
		}
				
		date[2] = new MyDate();
		date[2].accept();
		datecount ++;
		date[2].print();	
		
		date[2].printlist(2);
		
		
		DateUtils.datesort(date, datecount);
		System.out.println("List of date after sorting is:");
		MyDate.printlist(date,datecount);
		
		
	}
	
}
