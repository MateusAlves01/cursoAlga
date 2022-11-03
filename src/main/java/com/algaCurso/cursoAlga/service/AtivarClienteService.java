package com.algaCurso.cursoAlga.service;

import com.algaCurso.cursoAlga.model.Cliente;
import com.algaCurso.cursoAlga.notificadorEmail.Notificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AtivarClienteService {
    private Notificador notificador;

//    @Autowired
//    public AtivarClienteService(NotificadorEmail notificador) {
//        this.notificador = notificador;
//        System.out.println("ATIVAÇÃO-CLIENT-SERV");
//    }
//    public AtivarClienteService(String qualquel){
//
//    }

    public void ativar (Cliente cliente){
        cliente.isAtivo();
        notificador.notificar(cliente, "Seu cadastro no sistema está ativo");
    }

    @Autowired
    public void setNotificador(Notificador notificador) {
        this.notificador = notificador;
    }
}
