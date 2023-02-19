package jan_7_waits;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomeDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss_dd_MM_yyyy");
		String currentDate = dateFormat.format(date);
		System.out.println(currentDate);
	}

}
