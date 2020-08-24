package com.ashokit.util;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

@Component
public class AccountUtil {

	public List<String> getAllRoles() {
		return Arrays.asList("Case-Worker", "Admin");
	}

	public String generateTempPassword() {
		return new Random().ints(10, 33, 122).mapToObj(i -> String.valueOf((char) i)).collect(Collectors.joining());
	}

}
