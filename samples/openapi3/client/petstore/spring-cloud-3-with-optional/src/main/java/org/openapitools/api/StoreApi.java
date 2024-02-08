/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import java.util.Map;
import org.openapitools.model.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Validated
public interface StoreApi {

    /**
     * DELETE /store/order/{orderId} : Delete purchase order by ID
     * For valid response try integer IDs with value &lt; 1000. Anything above 1000 or nonintegers will generate API errors
     *
     * @param orderId ID of the order that needs to be deleted (required)
     * @return Invalid ID supplied (status code 400)
     *         or Order not found (status code 404)
     */
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/store/order/{orderId}"
    )
    
    ResponseEntity<Void> deleteOrder(
         @PathVariable("orderId") String orderId
    );


    /**
     * GET /store/inventory : Returns pet inventories by status
     * Returns a map of status codes to quantities
     *
     * @return successful operation (status code 200)
     */
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/store/inventory",
        produces = "application/json"
    )
    
    ResponseEntity<Map<String, Integer>> getInventory(
        
    );


    /**
     * GET /store/order/{orderId} : Find purchase order by ID
     * For valid response try integer IDs with value &lt;&#x3D; 5 or &gt; 10. Other values will generate exceptions
     *
     * @param orderId ID of pet that needs to be fetched (required)
     * @return successful operation (status code 200)
     *         or Invalid ID supplied (status code 400)
     *         or Order not found (status code 404)
     */
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/store/order/{orderId}",
        produces = "application/json,application/xml"
    )
    
    ResponseEntity<Order> getOrderById(
        @Min(1L) @Max(5L)  @PathVariable("orderId") Long orderId
    );


    /**
     * POST /store/order : Place an order for a pet
     * 
     *
     * @param order order placed for purchasing the pet (required)
     * @return successful operation (status code 200)
     *         or Invalid Order (status code 400)
     */
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/store/order",
        produces = "application/json,application/xml",
        consumes = "application/json"
    )
    
    ResponseEntity<Order> placeOrder(
         @Valid @RequestBody Order order
    );

}
