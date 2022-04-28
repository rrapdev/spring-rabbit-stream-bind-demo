package br.com.roberth.springrabbitstreambinddemo;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;

import java.util.function.Consumer;

@SpringBootApplication
@EnableRabbit

public class SpringRabbitStreamBindDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringRabbitStreamBindDemoApplication.class, args);
    }

    @Bean
    public Consumer<Message<String>> paymentConsumer() {
        return it -> {
            System.out.println(it);
        };
    }

    @Bean
    public Consumer<Message<String>> arrecadationConsumer() {
        return it -> {
            System.out.println(it);
        };
    }

}
