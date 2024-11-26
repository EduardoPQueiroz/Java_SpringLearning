package br.com.etechoracio.pw_study.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwageerConfig {

    @Bean
    public OpenAPI openAPI(){
        return new OpenAPI()
                .info(new Info()
                        .title("Sturdy -rest API")
                        .description("Rest Api da aplicação Study Etec")
                        .version("1.0"))
                .externalDocs(
                        new ExternalDocumentation()
                                .description("ETEC Horacio Augusto da Silveira")
                                .url("https://etechoracio.com.br/has/"));
    }
}
