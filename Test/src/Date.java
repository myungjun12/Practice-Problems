import java.util.Calendar;

public class Date {
	
	public static void main(String[] args) {
		Date now = new Date();
		Calendar calendar = Calendar.getInstance();
		int thisYear = calendar.get(Calendar.YEAR);
		System.out.println(thisYear);
		int thisMonth = calendar.get(Calendar.WEEK_OF_YEAR);
		System.out.println(thisMonth);
		int lastDayOfMonth = calendar.getActualMaximum(Calendar.DATE);
		System.out.println(lastDayOfMonth);
	
	


	}
}

