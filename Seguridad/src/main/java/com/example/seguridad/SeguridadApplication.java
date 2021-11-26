package com.example.seguridad;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.example.seguridad.entity.Rol;
import com.example.seguridad.repository.RolRepository;







@SpringBootApplication
public class SeguridadApplication implements CommandLineRunner {
@Autowired
private RolRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(SeguridadApplication.class, args);
	
	
	}

	@SuppressWarnings("deprecation")
	@Override
	public void run(String... args) throws Exception {
		List<Rol> pe= repository.listarRoles(2);
		for(int i=0;i<pe.size(); i++) {
			System.out.println(pe.get(i).getNombrerol());
		}
	}
}
