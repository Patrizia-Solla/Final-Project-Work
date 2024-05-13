package com.example.FinalProjectWork.service;



import jakarta.servlet.http.HttpSession;

public interface CarrelloService {

    void aggiungiProdotto(int id, HttpSession session);

    void rimuoviProdotto(int id, HttpSession session);

    void svuotaCarrello(HttpSession session);

   

}
