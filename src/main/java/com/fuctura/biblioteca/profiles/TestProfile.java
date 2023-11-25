package com.fuctura.biblioteca.profiles;

import com.fuctura.biblioteca.services.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestProfile {

    @Autowired
    private DBService dbService;

    @Bean //indica que o método está disponivel a qualquer momento de execucao
    public void instanciaDB(){
        this.dbService.instanciaDB();
    }
}
