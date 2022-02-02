package com.generation.PrimeiraAplicacao.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class Controller {
	
	 //Criação de end-point 
	@GetMapping ("/mentalidades") // "mentalidades" pagina gerada, ultima parte do link
	public String mentalidades() {
		return "Mentalidade de Persistencia pois tive que tentar diversas vezes realizar as atividades envolvendo spring";
	}
	
	@GetMapping ("/objetivos_de_aprendizagem")
	public String objetivos_de_aprendizagem() {
		return "Esta semana vou me dedicar a aprender a utilizar as ferramentas propostas nas aulas, como o Spring, e a ler e entender novas documentações. ";
	}
	
}
