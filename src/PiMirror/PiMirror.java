package PiMirror;

import org.jsoup.*;
import org.jsoup.nodes.Document;
import java.io.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class PiMirror {
	
	String temperature;
	String condition;
	String time, date;
	
	public void weatherTime() throws IOException {
		Document doc = Jsoup.connect("http://www.accuweather.com/en/us/atlanta-ga/30303/weather-forecast/348181").get(); 
		String text = doc.text();
		int i = text.indexOf("Local Weather Today");
		temperature = text.substring(i-5, i-1);
		i = text.indexOf("See Hourly");
		condition = text.substring(i-15,i-1);
		i = condition.indexOf(" ");
		condition = condition.substring(i+1);
		i = condition.indexOf(" ");
		condition = condition.substring(i+1);

		DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
	    Date dateobj = new Date();
	    date = df.format(dateobj).substring(0,8);
	    time = df.format(dateobj).substring(9,17);
	}
	
	
	public void draw() {
		
	}
	
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	}

}