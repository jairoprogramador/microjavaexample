package jairogalvez.com.test;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundo {

    @GetMapping
    public String holaMundo(){
        return "hola como estas soy una nueva prueba ddd";
    }

}
