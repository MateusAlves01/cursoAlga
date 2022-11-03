package com.algaCurso.cursoAlga.notificadorEmail;

import com.algaCurso.cursoAlga.model.Cliente;
import org.springframework.stereotype.Component;

@Component
public class NotificadorEmail implements Notificador {

    public NotificadorEmail(){
        System.out.println("Notificador EMAIL");
    }
    public void notificar(Cliente cliente, String mensagem){
        System.out.printf("Notificando %s através do e-mail %s: %s\n",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }
}
