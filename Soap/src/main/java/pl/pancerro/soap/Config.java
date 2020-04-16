package pl.pancerro.soap;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class Config {
    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("pl.pancerro.soap.schemas");
        return marshaller;
    }

    @Bean
    public SoapClient apiPortClient(Jaxb2Marshaller marshaller) {
        SoapClient client = new SoapClient();
        client.setDefaultUri("http://localhost:8088/mockApiPortSoap11");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}
