package com.cricapp.client;

import java.util.Scanner;

import com.cricapp.exception.CricketerNotFoundException;
import com.cricapp.model.Cricketer;
import com.cricapp.service.CricketerService;
import com.cricapp.service.CricketerServiceImp;

public class CricketerMain {

	public static void main(String[] args) {
		CricketerService cs = new CricketerServiceImp();
		System.out.println("Cricketers lists..\n");
		for (Cricketer i : cs.getAll()) {
			System.out.println(i);
		}
		System.out.println("\nPlease enter the ranking of the cricketer you want to find");
		Scanner kb = new Scanner(System.in);
		int rank = kb.nextInt();
		try {
			System.out.println(cs.getByRanking(rank));
			System.out.println("\nPlease enter the role of the cricketer you want to find");
			String role = kb.next();
			for (Cricketer j : cs.getByRole(role)) {
				if (j != null) {
					System.out.println(j);
				}
			}

		} catch (CricketerNotFoundException e) {
			System.out.println(e.getMessage());
		}
		kb.close();
	}

}
