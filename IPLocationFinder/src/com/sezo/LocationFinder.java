package com.sezo;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class LocationFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//ping  google.com
		//173.194.112.78
		if(args.length!=1){
			System.out.println("You need to pass one IP adress!!!");
		}
		else{
			
			String ipAdres= args[0];
			GeoIPService ipService= new GeoIPService();
			GeoIPServiceSoap geoIPServiceSoap=ipService.getGeoIPServiceSoap();
			
			GeoIP geoIp=geoIPServiceSoap.getGeoIP(ipAdres);
			
		
			System.out.println(geoIp.getCountryName());
		}
		
		
	}

}
