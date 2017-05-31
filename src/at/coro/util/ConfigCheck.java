package at.coro.util;

import java.net.InetAddress;

import org.apache.commons.validator.routines.InetAddressValidator;

import sun.net.InetAddressCachePolicy;

public class ConfigCheck {

	private boolean checkPort(String port){
		long lport = Long.parseLong(port);
		if(lport > 0 && lport < 65535){
			return true;
		}
		return false;
	}
	
	private boolean checkIP(String Address){
		InetAddressValidator val = new InetAddressValidator();
		return val.isValid(Address);
	}
}
