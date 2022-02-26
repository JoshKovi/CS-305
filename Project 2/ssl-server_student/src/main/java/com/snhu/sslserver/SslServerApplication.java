package com.snhu.sslserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@SpringBootApplication
public class SslServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SslServerApplication.class, args);
	}

}
@RestController
class ServerController{   
    @RequestMapping("/hash")
    public String myHash(){
    	//Name, byte array and MessageDigester are all instantiated (data is defined as my name and digested is null)
    	String data = "Joshua Kovacevich: Project2";
    	byte[] digested = null;
    	MessageDigest messageDigester;
    	
    	//Try Catch loop catches bad algorithm inputs
    	try {
    		//Creates instance of SHA-512 Digest, then assigns digest to digested with data string
    		messageDigester = MessageDigest.getInstance("SHA-512");
    		digested = messageDigester.digest(data.getBytes());
        	
    	}catch(NoSuchAlgorithmException e) {
    		System.out.println("Failed to load message digester.");
    	}
    	
    	//Uses String builder to convert each byte to hex
    	StringBuilder sb = new StringBuilder();
    	for(byte hashByte : digested) {
    		int intVal = 0xff & hashByte;
    		if (intVal < 0x10) {
    			sb.append('0');
    		}
    		sb.append(Integer.toHexString(intVal));
    	}
    	
        return "<p>data:&emsp;"+ data + "<p>SHA-512 Used&emsp;:&emsp;CheckSum Value&emsp;" + sb.toString() ;
    }
}