package com.kec.eb.main;
import java.util.*;
import com.kec.eb.service.ConnectionService;

public class EBMain {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Reading Unit :)");
			int cr = sc.nextInt();
			int pr = sc.nextInt();
			System.out.println("Choose Domestic(D) or Commercial(C)");
			String type = sc.next();
			System.out.println(new ConnectionService().generateBill(cr,pr,type));
		}
		
	}

}
