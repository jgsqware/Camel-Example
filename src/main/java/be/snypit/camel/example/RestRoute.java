package be.snypit.camel.example;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;

public class RestRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
//        restConfiguration().component("restlet").bindingMode(RestBindingMode.json).port("54001");
        restConfiguration()
                .component("servlet")
                .bindingMode(RestBindingMode.json)
                .contextPath("/adm-replication")
                .port("8181");

        rest("/replication")
                .post("/{cus}/{contractDate}")
                .produces("application/json")
                .consumes("application/json")
                .to("mock:TestRoute");
    }
}
