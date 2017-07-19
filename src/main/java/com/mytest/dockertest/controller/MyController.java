/**
 * 
 */
package com.mytest.dockertest.controller;

import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mytest.dockertest.domain.Lucky;

/**
 * @author harishrohini
 *
 */

@RestController
public class MyController {
	
	Random random = new Random();
	
	@RequestMapping("/")
	public String dockerHello() {
		return "Docker test!";
	}
	
	@RequestMapping("/myluck")
	public Lucky checkMyLuck() {
		int randomNum = random.nextInt();
		
		JustanInterface justanInterface = (random) -> {
			if(random %2 == 0)
				return "Lucky!!";
			return "Not Lucky :(";
		};
		
		return new Lucky(randomNum, justanInterface.giveResult(randomNum));
	}
	
	public interface JustanInterface {
		public String giveResult(int random);
	}
	
}
