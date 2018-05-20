package me.kezhenxu94.playground.jenkins.restful;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kezhenxu94 on 11/14/17.
 *
 * @author kezhenxu94 (kezhenxu94 at 163 dot com)
 */
@RequestMapping("hello")
@RestController
public class HelloController {

	@GetMapping
	public String hello() {
		return "Hello Jenkins";
	}
}
