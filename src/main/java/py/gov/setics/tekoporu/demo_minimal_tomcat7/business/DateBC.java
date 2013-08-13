package py.gov.setics.tekoporu.demo_minimal_tomcat7.business;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.ticpy.tekoporu.stereotype.BusinessController;

@BusinessController
public class DateBC implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -877999731369388741L;

	public String getCurrentDate(String timezone) {
		Date now = new Date();
		DateFormat df = new SimpleDateFormat("hh:mm:ss a,z", Locale.getDefault());
		df.setTimeZone(TimeZone.getTimeZone(timezone));
		String result = df.format(now);
		return result;
	}

}
