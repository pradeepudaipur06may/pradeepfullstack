package com.example.springboot.util;

import com.example.springboot.response.SpeakingClockResponse;

public class TimeUtil {
	private static String[] hours 
	= new String[] {"twelve","one","two","three", "four", "five","six","seven","eight","nine","ten","eleven"};
	
	private static String[] ones 
	= new String[] {"","one","two","three", "four", "five","six","seven","eight","nine"};
	
	private static String[] teens 
	= new String[] {"ten","eleven","twelve","thirteen", "fourteen", "fifteen","sixteen","seventeen","eighteen","nineteen"};
	
	private static String[] tens
	= new String[] {"","","twenty","Thirty", "fourty", "fifty"};
	
	private static String getHour(int hour)
	{
		return hours[hour%12] + " ";
	}
	
	private static String getminute(int minute)
	{
		if(minute < 10)
		{
			return ones[minute] + ". ";
		}
		else if(minute > 9 &&  minute < 20)
		{
			return teens[minute % 10] + ". ";
		}
		else
		{
			String time= tens[minute/10];
			return  time+ " " + ones[minute % 10] + ". ";			
		}
	}
	
	private static String getMidDayNight(int hours)
	{
		return hours < 12? "It's Midnight":"It's Midday"; 
	}
	
	public static SpeakingClockResponse speakingClock(String time) {
		try {
			String array[] = time.split(":");
			
			if(array != null && array.length ==2 && array[0].length() <=2 && array[1].length() <=2)
			{				
				int hour =0;
				int minutes =0;
				try {
					hour = Integer.valueOf(time.split(":")[0]);
					minutes = Integer.valueOf(time.split(":")[1]);
				} catch (Exception e) {
					throw new Exception();
				}
				if(hour < 0 || hour > 24 || minutes<0 || minutes > 59)
				{
					return new SpeakingClockResponse("400","Invalid time format");
				}
				StringBuilder builder = new StringBuilder();				
				builder.append("It's ");
				builder.append(TimeUtil.getHour(hour));
				builder.append(TimeUtil.getminute(minutes));
				builder.append(TimeUtil.getMidDayNight(hour));				
				return new SpeakingClockResponse("200", builder.toString());				
			}
			else
			{
				return new SpeakingClockResponse("400","Invalid time format");
			}	
		} catch (Exception e) {
			return new SpeakingClockResponse("400","Invalid time format");
		}		
	}	
}
