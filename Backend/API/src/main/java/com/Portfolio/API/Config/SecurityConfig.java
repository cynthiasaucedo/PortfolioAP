package com.Portfolio.API.Config;

import com.Portfolio.API.Exception.ProfileNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Autowired
    private ProfileNotFoundException profileNotFoundException;

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/").permitAll()   // Esto permite que cualquiera entre a cualquier parte de tu página web
                /*
                // Con esto puedes controlar quien entra a qué partes de tu aplicación/página dependiendo del rol que tengan
                .antMatchers("/home").hasRole("USER")
                .antMatchers("/education").hasRole("ADMIN")
                .antMatchers("/experience").hasRole("USER")
                .antMatchers("/projects").hasRole("USER")
                .antMatchers("/skills").hasRole("USER")
                */
                .anyRequest().authenticated()
                .and()
                .formLogin()    // Se crea una página de login para identificarse
                .and()
                .httpBasic();

        return http.build();
    }

    // Aquí se crean los usuarios con sus passwords y roles y se guardan en la memoria del programa,
    // al terminar la ejecución, se borran
    @Bean
    public UserDetailsService userDetailsService(){
        UserDetails user = User
                .withUsername("user")
                .password(passwordEncoder().encode("123456"))
                .roles("USER")
                .build();
        UserDetails admin = User
                .withUsername("admin")
                .password(passwordEncoder().encode("password"))
                .roles("USER", "ADMIN")
                .build();

        return new InMemoryUserDetailsManager(user, admin);
    }

    // Con este método se encriptan los passwords
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
