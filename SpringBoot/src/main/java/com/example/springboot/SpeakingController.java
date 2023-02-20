package com.example.springboot;

import org.apache.catalina.connector.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.response.SpeakingClockResponse;
import com.example.springboot.util.TimeUtil;

@RestController
@RequestMapping("/clock")
public class SpeakingController {
	
	@GetMapping("/gettime/{time}")
	public SpeakingClockResponse getTime(@PathVariable String time)
	{					
		return TimeUtil.speakingClock(time);				
	}
}
