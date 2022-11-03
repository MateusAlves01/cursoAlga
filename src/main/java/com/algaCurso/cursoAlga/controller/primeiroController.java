package com.algaCurso.cursoAlga.controller;

import com.algaCurso.cursoAlga.model.Cliente;
import com.algaCurso.cursoAlga.service.AtivarClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class primeiroController {

    private AtivarClienteService ativarClienteService;

    public primeiroController(AtivarClienteService ativarClienteService) {
        this.ativarClienteService = ativarClienteService;
    }

    @GetMapping("/Hello")
    @ResponseBody
    public String Hello(){
        Cliente joão = new Cliente("João", "joao@gmail.com", "34999521");
             ativarClienteService.ativar(joão);
        return "hello";
    }
}
