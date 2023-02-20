package com.example.SpringBoot;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.springboot.util.TimeUtil;

@SpringBootTest
class ApplicationTests {

	@Test
	void valid() throws Exception {
		assertEquals("It's eleven Thirty four. It's Midday", TimeUtil.speakingClock("23:34").getMessage());		
	}
	
	@Test
	void nullValue() throws Exception {
		assertEquals("400", TimeUtil.speakingClock(null).getCode());		
	}
	
	@Test
	void invalidValue() throws Exception {
		assertEquals("400", TimeUtil.speakingClock("25:35").getCode());		
	}

}
