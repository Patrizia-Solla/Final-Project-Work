package com.example.FinalProjectWork.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FinalProjectWork.dao.SottocategoriaDao;
import com.example.FinalProjectWork.model.Sottocategoria;

@Service
public class SottocategoriaServiceImpl implements SottocategoriaService{
	
	@Autowired
	private SottocategoriaDao sottocategoriaDao;

	
	@Override
	public List<Sottocategoria> getSottocategorie() {
		return (List<Sottocategoria>) sottocategoriaDao.findAll();
	}

	@Override
	public Sottocategoria getSottocategoriaById(int id) {
		return sottocategoriaDao.findById(id).get();
	}

	
	
}
