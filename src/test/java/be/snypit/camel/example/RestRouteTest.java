package be.snypit.camel.example;

import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.impl.DefaultExchange;
import org.apache.camel.test.blueprint.CamelBlueprintTestSupport;
import org.junit.Test;

public class RestRouteTest extends CamelBlueprintTestSupport {

    @Produce
    ProducerTemplate producerTemplate;

    @Override
    protected String getBlueprintDescriptor() {
        return "OSGI-INF/blueprint/blueprint-camel.xml";
    }

    @Test
    public void testName() throws Exception {

        DefaultExchange defaultExchange = new DefaultExchange(context);

    }
}