inspiration:https://spring.io/guides/gs/messaging-stomp-websocket/#initial
-spustenie:
Application.class>Ran As>Spring Boot Application
http://localhost:8080/

OR
mvn clean package
mvn spring-boot:run

 Or you can build the JAR file with mvn clean package and run the JAR by typing:
java -jar target/gs-messaging-stomp-websocket-0.1.0.jar
 
STOMP = Simple/Streamin Text Orientated Message Protocol 
- CONNECT
- SEND
- SUBSCRIBE
- UNSUBSCRIBE
- BEGIN
- COMMIT
- ABORT
- ACK
- NACK
- DISCONNECT

Communication between client and server is through a "frame" consisting of a number of lines. The first line contains the command, followed by headers in the form <key>: <value> (one per line), followed by a blank line and then the body content, ending in a null character. Communication between server and client is through a MESSAGE, RECEIPT or ERROR frame with a similar format of headers and body content.