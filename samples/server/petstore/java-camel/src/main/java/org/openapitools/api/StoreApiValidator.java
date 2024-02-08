/**
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.3.0).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.api;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;
import org.apache.camel.LoggingLevel;

@Component
public class StoreApiValidator extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        onException(Exception.class)
            .log(LoggingLevel.ERROR, "${exception.message}: ${exception.stacktrace}")
            .handled(true)
            .process("validationErrorProcessor");
        
        from("direct:validate-deleteOrder")
            .id("validate-deleteOrder")
            .to("direct:deleteOrder");
        
        from("direct:validate-getInventory")
            .id("validate-getInventory")
            .to("direct:getInventory")
            .to("bean-validator://validate-response");
        
        from("direct:validate-getOrderById")
            .id("validate-getOrderById")
            .to("direct:getOrderById")
            .to("bean-validator://validate-response");
        
        from("direct:validate-placeOrder")
            .id("validate-placeOrder")
            .to("bean-validator://validate-request")
            .to("direct:placeOrder")
            .to("bean-validator://validate-response");
        
    }
}
