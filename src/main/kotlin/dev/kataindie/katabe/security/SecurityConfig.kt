package dev.kataindie.katabe.security

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.http.SessionCreationPolicy
import org.springframework.security.web.SecurityFilterChain

@Configuration
@EnableWebSecurity
class SecurityConfig {
    @Bean
    fun securityFilterChain(http: HttpSecurity): SecurityFilterChain {
        // Disable CSRF (cross site request forgery)
        http.csrf().disable();
        // No session will be created or used by spring security
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);

        // Entry points
        http.authorizeHttpRequests()//
            .requestMatchers("/api/auth/**").permitAll()//
            .requestMatchers("/api/users/**").permitAll()//
            // Disallow everything else..
            .anyRequest().authenticated();

        // Optional, if you want to test the API from a browser
        http.httpBasic().disable()
        http.apply()

        return http.build()
    }
}