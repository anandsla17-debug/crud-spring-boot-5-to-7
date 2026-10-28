package crudpackage.crudapi.Springconfig;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class Securityconfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http){
http.csrf(csrf->csrf.disable()).authorizeHttpRequests(auth->
        auth.requestMatchers("/courseapi/viewCourse").authenticated()
                .requestMatchers("/admin/reg").authenticated())
        .httpBasic(basic->{})
        .formLogin(form->form.permitAll());
return http.build();
    }


    @Bean
    public UserDetailsService userDetailsService(){
        UserDetails user1= User.withUsername("anand")
                .password(Ecry().encode("123"))
                .roles("ADMIN").build();
        return new InMemoryUserDetailsManager(user1);
    }

    @Bean
    public BCryptPasswordEncoder Ecry(){
        return new BCryptPasswordEncoder();
    }
}
