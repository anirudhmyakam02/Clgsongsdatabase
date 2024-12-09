package com.data.clgsongs.authentication;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ApiAuthenticationConfiguratoin {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(
                auth->{
                    auth
                        .requestMatchers("/admin/**").authenticated()
                            .requestMatchers("/h2-console/**").authenticated()
                            .anyRequest().permitAll();
                }
        );

        http.sessionManagement(
                session->session.sessionCreationPolicy
                        (SessionCreationPolicy.STATELESS)
                 )
                .csrf().disable();
        http.httpBasic();
        http.headers().frameOptions().sameOrigin();

        return http.build();
    }
}
