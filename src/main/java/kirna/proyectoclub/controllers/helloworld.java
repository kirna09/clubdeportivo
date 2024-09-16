package kirna.proyectoclub.controllers;
import kirna.proyectoclub.models.usuario;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloworld {


    @GetMapping("/hello")
    public usuario hello() {
        usuario usuarios = new usuario("Juan", "juan@example.com", 30);
        return usuarios;
    }
}
