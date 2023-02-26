package zama.learning.shared.service;

import java.util.Date;

public class SharedService {
	public static String process() {
		String status = "Process using Shared Service - v2: "+new Date();
		System.out.println(status);
		return status;
	}
}
