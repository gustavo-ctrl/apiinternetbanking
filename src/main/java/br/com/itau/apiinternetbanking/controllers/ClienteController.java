package br.com.itau.apiinternetbanking.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ClienteController {
    @GetMapping("/cliente/cadastro")
    public String cadastrocliente(){
        return "teste cadastro cliente";
    }

    @GetMapping("/cliente/teste")
    public String teste(){
        String texto = "hudson";
        Integer numeroInteiro = 1;
        Double numeroDinheiro = 100.90;
        Long numeroLong = 400334242L;
        List<String> listaTexto = new ArrayList<>();
        listaTexto.add("hudson saiu");
        listaTexto.add("rudini saiu");
        listaTexto.add("aulanildao");
        return listaTexto.get(1);
    }

}

