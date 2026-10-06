package cl.duoc.rabbitmq_tutorial.service;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;
import cl.duoc.rabbitmq_tutorial.config.RabbitMQConfig;
@Service 
public class Sender {
    private final RabbitTemplate rabbitTemplate;
    public Sender(RabbitTemplate rabbitTemplate){
        this.rabbitTemplate = rabbitTemplate;
    }
    public void enviar(String nivel, String mensaje){
        rabbitTemplate.convertAndSend(RabbitMQConfig.EXCHANGE, nivel, mensaje);
        System.out.println("Enviado -->" + mensaje);
    }
}
