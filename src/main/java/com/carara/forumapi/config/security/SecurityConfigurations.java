package com.carara.forumapi.config.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class SecurityConfigurations extends WebSecurityConfigurerAdapter {
    @Override //configurações de autenticação (controle de acesso, login...)
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        super.configure(auth);
    }

    @Override //configurações de autorização (quem pode acessar quais url, perfis de acesso)
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers(HttpMethod.GET, "/topicos").permitAll()
                .antMatchers(HttpMethod.GET, "/topicos/*").permitAll();
    }

    @Override //configurações de recursos estaticos
    public void configure(WebSecurity web) throws Exception {
        super.configure(web);
    }
}
