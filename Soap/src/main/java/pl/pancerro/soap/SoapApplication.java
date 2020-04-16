package pl.pancerro.soap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.pancerro.soap.schemas.RegisterCallResponse;
import pl.pancerro.soap.schemas.ResultsResponse;

@SpringBootApplication
public class SoapApplication {

    public static void main(String[] args) {
        SpringApplication.run(SoapApplication.class, args);
    }
    @Bean
    int testWebServices(SoapClient client) {
        RegisterCallResponse response = client.getRegisterCall();
        System.out.println(response.getExercise().getName());
        System.out.println(response.getExercise().getNote());

        ResultsResponse resultsResponse = client.getResults();
        System.out.println(resultsResponse.getEntry());
        return 0;
    }
}
