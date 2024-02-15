package com.example.apuntes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApp {

	public static void main(String[] args) {
		SpringApplication.run(MainApp.class, args);
		System.out.println("Hello world");

		/*La aplicación solo cargará el index.html si existe
			- Para ello, lo creamos en /src/main/resources/static/index.html
			- Con él creado, Tomcat abrirá la página en el puerto localhost:8080 */

		/* Si el puerto está ocupado, se puede cambiar en:
			/src/main/resources/application.properties
			y poner:
			server.port=XXXX
		 */
	}

}
