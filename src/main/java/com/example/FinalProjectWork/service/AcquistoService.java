package com.example.FinalProjectWork.service;

import jakarta.servlet.http.HttpSession;
import com.example.FinalProjectWork.model.Acquisto;
import com.example.FinalProjectWork.model.Prodotto;
import com.example.FinalProjectWork.model.Utente;

import java.util.List;

public interface AcquistoService {
    public List<Acquisto> getAcquisti();
     
    
    void inviaAcquisto(Utente utente, List <Prodotto> prodottiNelCarrello, String indirizzoSpedizione, String metodoPagamento, HttpSession session);
    
     
    Acquisto getAcquistoById(int id);


	
    
   
}
