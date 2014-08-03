/**
 * 
 */
package stomp.model;

/**
 * To model the greeting representation	, make POJO.</br>
 * Spring will use the Jackson JSON library to automatically marshal instances of type Greeting into JSON.
 * 
 * @author kubincanek@gmail.com
 *
 */
public class Greeting {

    private String content;

    public Greeting(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

}
