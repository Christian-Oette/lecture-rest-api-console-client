package de.oette.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.web.client.RestTemplate;

@ShellComponent
public class MyCommands {

    @ShellMethod("List Todos")
    public void getTodos() {
        RestTemplate restTemplate = new RestTemplate();

        String url = "http://localhost:8090/todo";
        ResponseEntity<Object> result = restTemplate.getForEntity(url, Object.class);
        System.out.println(result.getBody());
    }
}