package com.cricapp.service;

import com.cricapp.exception.CricketerNotFoundException;
import com.cricapp.model.Cricketer;

public class CricketerServiceImp implements CricketerService {

	@Override
	public Cricketer getByRanking(int rank) throws CricketerNotFoundException {
		Boolean b = false;
		Cricketer c = null;
		for (Cricketer i : getAll()) {
			if (i.getRanking() == rank) {
				b = true;
				c = i;
			}
		}
		if (b == false) {
			throw new CricketerNotFoundException("Invalid Cricketer Ranking");
		}
		return c;
	}

	@Override
	public Cricketer[] getByRole(String role) throws CricketerNotFoundException {
		Boolean b = false;
		Cricketer[] c = new Cricketer[5];
		int i = 0;
		for (Cricketer j : getAll()) {
			if (j.getRole().equalsIgnoreCase(role)) {
				b = true;
				c[++i] = j;
			}
		}
		if (b == false) {
			throw new CricketerNotFoundException("Invalid Cricketer Ranking");
		}
		return c;

	}

	@Override
	public Cricketer[] getAll() {
		Cricketer cric[] = new Cricketer[5];
		cric[0] = new Cricketer("Virat", 18, "Batsman", 1);
		cric[1] = new Cricketer("Dhoni", 7, "Batsman", 25);
		cric[2] = new Cricketer("Gayle", 333, "Batsman", 20);
		cric[3] = new Cricketer("Aswin", 99, "Bowler", 2);
		cric[4] = new Cricketer("Starc", 15, "Bowler", 4);
		return cric;
	}

}
