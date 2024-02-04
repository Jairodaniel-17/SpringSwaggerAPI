package com.claro.api.c26926;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class C26926Application {

    public static void main(String[] args) {
        SpringApplication.run(C26926Application.class, args);
    }

    /**
     * Bean que configura la información de la API para la documentación de Swagger.
     * 
     * @return una instancia de OpenAPI con la información de la API.
     */
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Spring Boot API CLARO por C26926")
                        .contact(new io.swagger.v3.oas.models.info.Contact().email("jairodaniel.mt@gmail.com"))
                        .version("0.0.0")
                        .description(
                                "Las API que desarrolle las pueden probar aquí como también leer la documentación de cada endpoint")
                        .termsOfService("https://www.google.com/")
                        .license(new License().name("MIT").url("https://www.google.com/")));
    }

    @RestController
    static class HelloController {
        @Operation(tags = {
                "Bienvenida" }, method = "GET", summary = "Saludo", description = "Retorna un saludo en formato de JSON.")
        @GetMapping("/")
        public Map<String, String> hello() {
            Map<String, String> diccionario = new HashMap<>();
            diccionario.put("hola", "mundo");
            return diccionario;
        }
    }

}