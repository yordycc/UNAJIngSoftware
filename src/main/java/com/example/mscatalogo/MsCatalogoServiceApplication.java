package com.example.mscatalogo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@SpringBootApplication
@RestController
public class MsCatalogoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsCatalogoServiceApplication.class, args);
	}

	@GetMapping("/categoria")
	public List<Map<String, Object>> listarDummy() {
		return Collections.singletonList(Map.of("id", 1, "nombre", "Categoria Prueba UNAJ"));
	}
}
