package edu.sjsu.cmpe.cache.client;

import com.mashape.unirest.http.Unirest;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Client {

    public static void main(String[] args) throws Exception {
        System.out.println("Starting Cache Client...");
        CRDTClient crcl= new CRDTClient();
	System.out.println("Step1:put 1=>a");
        crcl.put(1, "a"); 
	System.out.println("thread sleep");
        Thread.sleep(30*1000);
       
	System.out.println("Step2:put 2=>a");
	crcl.put(1, "b");
	System.out.println("thread sleep");
        Thread.sleep(30*1000);
        
        String str= crcl.get(1);
        System.out.println("Step 3: get(1) is" + str);

        System.out.println("Exiting Client...");
        Unirest.shutdown();
    }

}
