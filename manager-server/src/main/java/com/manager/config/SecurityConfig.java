package com.manager.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author ouyang
 * @date 2019/2/15 14:19
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin().loginPage("/login.html").loginProcessingUrl("/login").permitAll();
        http.logout().logoutUrl("/logout");
        http.csrf().disable();
        http.authorizeRequests().antMatchers("/login.html","/**/**.css","/img/**","/third-party/**").permitAll();
        http.authorizeRequests().antMatchers("/**").authenticated();
        http.httpBasic();
    }
}
