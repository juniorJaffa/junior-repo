/**
 * 
 */
package stomp.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import stomp.model.Greeting;
import stomp.model.HelloMessage;

/**
 * The @MessageMapping annotation ensures that if a message is sent to
 * destination "/hello", then the greeting() method is called.</br></br>
 * 
 * Internally, the implementation of the method simulates a processing delay by
 * causing the thread to sleep for 3 seconds. This is to demonstrate that after
 * the client sends a message, the server can take as long as it needs to
 * process the message asynchronously. The client may continue with whatever
 * work it needs to do without waiting on the response.</br></br>
 * 
 * After the 3 second delay, the greeting() method creates a Greeting object and
 * returns it. The return value is broadcast to all subscribers to
 * "/topic/greetings" as specified in the @SendTo annotation.
 * 
 * @author kubincanek@gmail.com
 *
 */
@Controller
public class GreetingController {


    @MessageMapping("/hello") // Endpoint
    @SendTo("/topic/greetings") // client do SUBSCRIBE na topic /greetings
    public Greeting greeting(HelloMessage message) throws Exception {
    	
        Thread.sleep(3000); // simulated delay
        return new Greeting("Ahoj, " + message.getName() + "! <<-WebSocket response=STOPM(Streaming=Simple Text Orientated Message Protocol)");
    }

}