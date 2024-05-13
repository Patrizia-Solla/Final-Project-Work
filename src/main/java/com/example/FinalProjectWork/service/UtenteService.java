package com.example.FinalProjectWork.service;

import jakarta.servlet.http.HttpSession;
import com.example.FinalProjectWork.model.Utente;

public interface UtenteService {
    boolean loginUtente(String username, String password, HttpSession session);
    void registraUtente(Utente utente);
    boolean controlloUsername(String username);
    boolean controlloEmail(String email);
    void modificaUtente (Utente utente);
   // boolean controlloPassword(String password);
}
