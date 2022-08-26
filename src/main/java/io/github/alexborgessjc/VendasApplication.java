package io.github.alexborgessjc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//A SpringBootApplication annotation irá fazer com que o spring entenda que a classe irá iniciar o spring boot
@SpringBootApplication
public class VendasApplication {
    public static void main(String[] args) {
        //Executando a aplicação
        SpringApplication.run(VendasApplication.class, args);
    }
}
