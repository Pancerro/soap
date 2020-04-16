package pl.pancerro.soap;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import pl.pancerro.soap.schemas.RegisterCallRequest;
import pl.pancerro.soap.schemas.RegisterCallResponse;
import pl.pancerro.soap.schemas.ResultsRequest;
import pl.pancerro.soap.schemas.ResultsResponse;

public class SoapClient extends WebServiceGatewaySupport {
    public RegisterCallResponse getRegisterCall() {
        RegisterCallRequest request = new RegisterCallRequest();
        return (RegisterCallResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://localhost:8088/mockApiPortSoap11", request);
    }

    public ResultsResponse getResults() {
        ResultsRequest request = new ResultsRequest();
        return (ResultsResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://localhost:8088/mockApiPortSoap11", request);
    }
}
