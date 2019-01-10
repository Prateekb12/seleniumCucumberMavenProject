package helper;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utilities {
	
	public String timestamp() {
		Date dateObj = new Date();
		String dateFormat = "dd-MMM-yyyy (hh-mm-ss)";
		SimpleDateFormat format = new SimpleDateFormat(dateFormat);
		return format.format(dateObj).toString();
	}
	
}
