package com.concretepage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/secure/man/**").access("hasRole('MANAGERS')")
                .antMatchers("/secure/dev/**").access("hasRole('DEVELOPERS')")
                .and().formLogin()
                .loginPage("/login")
                .loginProcessingUrl("/appLogin")
                .usernameParameter("username")
                .passwordParameter("password")
                .defaultSuccessUrl("/secure/dev")
                .and().logout()
                .logoutUrl("/appLogout")
                .logoutSuccessUrl("/login")
                .and().exceptionHandling()
                .accessDeniedPage("/accessDenied");
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.ldapAuthentication()
                .userDnPatterns("uid={0},ou=people")
                .userSearchBase("ou=people")
                .userSearchFilter("uid={0}")
                .groupSearchBase("ou=groups")
                .groupSearchFilter("uniqueMember={0}")
                .contextSource()
                .url("ldap://localhost:2389/dc=concretepage,dc=com")
                .and()
                .passwordCompare()
                .passwordEncoder(passwordEncoder())
                .passwordAttribute("userPassword");
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        return passwordEncoder;
    }
} 