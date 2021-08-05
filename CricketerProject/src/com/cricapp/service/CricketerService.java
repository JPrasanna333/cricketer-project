package com.cricapp.service;

import com.cricapp.exception.CricketerNotFoundException;
import com.cricapp.model.Cricketer;

public interface CricketerService {
	public Cricketer getByRanking(int rank)throws CricketerNotFoundException;
	public Cricketer[] getAll();
	public Cricketer[] getByRole(String role) throws CricketerNotFoundException ;

}
