package PiMirror;

import org.jsoup.*;
import org.jsoup.nodes.Document;
import java.io.*;

public class PiMirror {
	
	static String temperature;
	static String condition;
	
	public static void weather() throws IOException {
		Document doc = Jsoup.connect("http://www.accuweather.com/en/us/atlanta-ga/30303/weather-forecast/348181").get(); 
		String text = doc.text();
		int i = text.indexOf("Local Weather Today");
		temperature = text.substring(i-5, i-1);
		System.out.println(temperature);
		i = text.indexOf("See Hourly");
		condition = text.substring(i-15,i-1);
		i = condition.indexOf(" ");
		condition = condition.substring(i+1);
		i = condition.indexOf(" ");
		condition = condition.substring(i+1);
		System.out.println(condition);
	}
	
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		weather();
	}

}