package cl.duoc.rabbitmq_tutorial.config;
import java.beans.BeanProperty;

import javax.naming.Binding;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration 
public class RabbitMQConfig {
    public static final String QUEUE_NAME="hello";

    public RabbitMQConfig(){
        System.out.println("<<<<<<<<<<RABBITMQ CONFIG CARGANDO!!!>>>>>");
    }

    @Bean 
    public Queue helloQueue(){
        System.out.println("<<<<<<<<<<CREANDO COLA HELLO!!!>>>>>");
        return new Queue(QUEUE_NAME,false);
    }

    @Bean
    public DirectExchange(){
        return new DirectExchange(EXCHAGE);
    }


    @Bean
    public BindingInfo(){
        return BindingBuilder
            .bind(allLogsQueue)
            .to(logsExchange)
            .with("INFO");

    
    }

    @Bean
    public Binding BindingWarning(){
        return BindingBuilder
            .bind(allLogsQueue())
            .to(logsExchange())
            .with("WARNING");  
    }

    @Bean
    public BindingErrorAll(){
        return BindingBuilder
            .bind(allLogsQueue)
            .to(logsExchange)
            .with("ERROR");

    
    }

    @Bean
    public BindingErrorOnly(){
        return BindingBuilder
            .bind(allLogsQueue)
            .to(logsExchange)
            .with("ERROR");

    
    }
    
}
