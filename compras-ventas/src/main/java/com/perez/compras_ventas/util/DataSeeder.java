package com.perez.compras_ventas.util;

import com.github.javafaker.Faker;
import com.perez.compras_ventas.entity.Usuario;
import com.perez.compras_ventas.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Random;

@Component
@RequiredArgsConstructor
public class DataSeeder implements ApplicationRunner {  // test data

    private final UsuarioRepository usuarioRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Faker faker = new Faker();
        Random random = new Random();
        //CREATE DATA SEEDING
        if(usuarioRepository.count() == 0){
            usuarioRepository.save(Usuario.builder()
                    .nombre(faker.name().firstName())
                    .apellido(faker.name().lastName())
                    .correo(faker.internet().emailAddress())
                    .direccion(faker.address().fullAddress())
                    .estado("ACTIVO")
                    .fechaNacimiento(LocalDate.now())
                    .dni(faker.number().digits(11))
                    .userName(faker.name().fullName())
                    .telefono(faker.phoneNumber().cellPhone())
                    .password(passwordEncoder.encode("123456"))
                    .build());
        }

        //ADD CATEGORIAS
        //ADD PRODUCTOS
        //ADD ALMACEN & SUCURSAL
        //ADD ALMACEN PRODUCTO
        //...
    }
}
