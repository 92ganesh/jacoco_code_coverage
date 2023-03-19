package app;

import org.springframework.boot.SpringApplication;

@org.springframework.boot.autoconfigure.SpringBootApplication
public class SpringBootApplication {
    public static void main(String[] args) {
       SpringApplication.run(SpringBootApplication.class, args);

       /*

       -javaagent:D:/Projects/SpringDemo/org.jacoco.agent-0.8.7-runtime.jar=destfile=D:/Projects/SpringDemo/jacoco.exec,append=true,includes=app.*

        */
    }
}
