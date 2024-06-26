package com.example.FinalProjectWork.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.FinalProjectWork.model.Categoria;
import com.example.FinalProjectWork.service.CategoriaService;




@Controller
@RequestMapping("/sottocategoria")
public class SottoCategoriaController {
    @Autowired
    private CategoriaService categoriaService;

   

    @GetMapping
    public String getPage(
            Model model,
            @RequestParam(name = "id", required = false) Integer id
    ) {
        Categoria categoria = categoriaService.getCategoriaById(id);
        model.addAttribute("sottocategorie", categoria.getSottocategorie());
        return "sottocategoria";
    }
}
