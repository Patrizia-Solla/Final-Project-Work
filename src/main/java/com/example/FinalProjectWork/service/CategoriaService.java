package com.example.FinalProjectWork.service;

import java.util.List;

import com.example.FinalProjectWork.model.Categoria;

public interface CategoriaService {
    void registraCategoria(Categoria categoria);
    List<Categoria> getCategorie();
    Categoria getCategoriaById(int id);
    void cancellaCategoria(int id);
}
