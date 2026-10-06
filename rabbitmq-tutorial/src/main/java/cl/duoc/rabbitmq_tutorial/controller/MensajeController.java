package cl.duoc.rabbitmq_tutorial.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.rabbitmq_tutorial.service.Sender;

@RestController 
@RequestMapping("/mensajes")
public class MensajeController {
    private final Sender sender;
    public MensajeController(Sender sender){
        this.sender = sender;
    }
    @PostMapping
    public String enviar(@RequestBody String texto){
        sender.enviar(texto);
        return "Mensaje Enviado a RabbitMQ";
    }
}
