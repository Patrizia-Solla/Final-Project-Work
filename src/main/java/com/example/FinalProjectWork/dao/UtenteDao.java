package com.example.FinalProjectWork.dao;

import org.springframework.data.repository.CrudRepository;


import com.example.FinalProjectWork.model.Utente;

public interface UtenteDao extends CrudRepository<Utente, Integer> {
    Utente findByUsernameAndPassword(String username, String password); // serve per recuperare le credenziali dell'utente, quindi per il login
    Utente findByUsername(String username); // verifica l'unicità dell'username
    Utente findByEmail(String email);
    Utente findByPassword(String password);
}