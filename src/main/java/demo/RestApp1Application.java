package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker
public class RestApp1Application {

    public static void main(String[] args) {
        SpringApplication.run(RestApp1Application.class, args);
    }
}
