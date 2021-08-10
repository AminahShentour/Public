package com.example.run;

import java.sql.*;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import Classes.Client;

//JDBC driver name and database URL

//static final String JDBC_DRIVER = "org.postgresql.Driver";
//static final String db_url = "jdbc:postgresql://localhost/bankdb";

//Datebase credentials
//static final String USER = "postgres";
//static final PASS = "20December2012";

@SpringBootApplication
public class BankConsoleAppApplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int ch = 0;
		//while (ch != 4) {
			System.out.println("What would you like to do today?");
			System.out.println("1.Employee sign-in");
			System.out.println("2.Client sign-in");
			System.out.println("3.Create an account");
			System.out.println("4.Exit");
			ch =sc.nextInt();	
			
			switch(ch) {
			case 1: 
			case 2:Client.Login();
			case 3:Client.SetNamePassBalance();
			//}
		}
		System.out.println("You have Existed successfully.");
	}
	
	public void ClientView () {
		
		// Prints the client screen of options
		
		Scanner sc = new Scanner(System.in);
		
		int ch = 0;
		while (ch != 4) {
		System.out.println("Please make a selection:");
		System.out.println("1. Deposit money.\n");
		System.out.println("2. Withdraw money.\n");
		System.out.println("3. Check balance.\n");
		System.out.println("4. Logout and exit. ");
		ch =  sc.nextInt();
		
	/*	switch(ch) {
		case:
		case:
		case:
		case:
		}*/
		sc.close();
	}

		
	}
		//SpringApplication.run(BankConsoleAppApplication.class, args);
		
		
}
