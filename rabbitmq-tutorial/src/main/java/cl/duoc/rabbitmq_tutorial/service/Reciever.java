package cl.duoc.rabbitmq_tutorial.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import cl.duoc.rabbitmq_tutorial.config.RabbitMQConfig;

@Service 
public class Reciever {
    @RabbitListener(queues = RabbitMQConfig.QUEUE_NAME)
    public void recibir (String mensaje){
        System.out.println("RECIBIDO <-- " + mensaje);
    }
}
