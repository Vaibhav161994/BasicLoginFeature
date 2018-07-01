package com.vaibhav.basiclogin.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;

/**
 * Created by kaushv5 on 6/5/2018.
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

//    @Autowired
//    UserDetailServiceImpl userDetailService;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                .csrf().disable()
                .authorizeRequests()
                .antMatchers("/home").hasAnyRole("USER","ADMIN")
                .and().formLogin().loginPage("/login").defaultSuccessUrl("/home")
                .and().logout().permitAll();
    }


    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder builder) throws Exception{
//
        User.UserBuilder users = User.builder();

        builder.inMemoryAuthentication()
                .withUser(users.username("John").password(passwordEncoder.encode("1234")).roles("USER"))
                .withUser(users.username("mary").password(passwordEncoder.encode("12345")).roles("EMPLOYEE"))
                .withUser(users.username("susan").password(passwordEncoder.encode("1234")).roles("ADMIN"));
//        builder.
//                userDetailsService(userDetailService);
    }
}
