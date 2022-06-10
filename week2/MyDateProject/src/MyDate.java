import java.util.Scanner;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public MyDate() {
		super();
	}
	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public MyDate(String date) {
		super();
		String value[] = date.split(" ");
		
		
		switch (value[0]){
			case "January": this.month=1;break;
			case "February": this.month=2;break;
			case "March": this.month=3;break;
			case "April": this.month=4;break;
			case "May": this.month=5;break;
			case "June": this.month=6;break;
			case "July": this.month=7;break;
			case "August": this.month=8;break;
			case "September": this.month=9;break;
			case "October": this.month=10;break;
			case "November": this.month=11;break;
			case "December": this.month=12;	break;		
		}
		String dayString = value[1].replaceAll("\\D+","");
		this.day = Integer.parseInt(dayString);
		
		this.year = Integer.parseInt(value[2]);
	}
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {		
		this.day = day;
		
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		
		this.month = month;
		
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		
		this.year = year;
		
	}
	public void accept() {
		System.out.print("Enter a date(String): ");
		Scanner sc = new Scanner(System.in);
		String date = sc.nextLine();
		String value[] = date.split(" ");

		switch (value[0]){
			case "January":  this.month=1;break;
			case "February": this.month=2;break;
			case "March":	 this.month=3;break;
			case "April":    this.month=4;break;
			case "May":      this.month=5;break;
			case "June": 	 this.month=6;break;
			case "July":	 this.month=7;break;
			case "August":   this.month=8;break;
			case "September":this.month=9;break;
			case "October":  this.month=10;break;
			case "November": this.month=11;break;
			case "December": this.month=12;break;		
		}
		String dayString = value[1].replaceAll("\\D+","");
		this.day = Integer.parseInt(dayString);		
		this.year = Integer.parseInt(value[2]);		
	
		if(this.day<1 || this.day >31 || this.month<1 || this.month >12 ||this.year<1){
			System.out.println("Invalid date");
			System.exit(0);
		}

		switch(this.month){
			case 4:
			case 6:
			case 9:
			case 11:
				if(this.day ==31){
					System.out.println("Invalid date");
					System.exit(0);
				}
				
			case 2:				
				if((this.day ==29 && (this.year % 400 !=0 &&(this.year % 4 !=0 ||this.year % 100 ==0 ))) ||this.day >=30){
					System.out.println("Invalid date");
					System.exit(0);
				}
				
		}
	}
	public void print() {
		System.out.println("Date is :"+this.getDay()+"/"+this.getMonth()+"/"+this.getYear());
	}
	public static void printlist(MyDate date[],int length) {
		for(int i = 0; i < length; i++) {
			date[i].print();
		}
	}
	
	public void printlist(int format) {
		String dateFormat;
		switch(format) {
			// 1: dd/mm/yyyy
			case 1:
				dateFormat = this.day + " / " + this.month + " / " + this.year;
				System.out.println("Format dd/mm/yyyy: " + dateFormat);
				break;
				
			// 2: yy-mm-dd
			case 2:
				dateFormat = this.year%100 + " - " + this.month + " - " + this.day;
				System.out.println("Format yy/mm/dd: " + dateFormat);
				break;
				
			default:
				System.out.println("We only have to format of date: 1 and 2!");
				break;
		}
	}	
	
	
	
}
