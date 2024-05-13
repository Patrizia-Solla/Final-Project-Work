package com.example.FinalProjectWork.service;

import java.util.List;

import com.example.FinalProjectWork.model.Sottocategoria;

public interface SottocategoriaService {
	
	List<Sottocategoria> getSottocategorie();
	Sottocategoria getSottocategoriaById(int id);
	
}
