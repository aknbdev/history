package uz.isystem.security.security;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@AllArgsConstructor
@NoArgsConstructor
public class JwtConfigurer extends SecurityConfigurerAdapter<DefaultSecurityFilterChain, HttpSecurity> {

     @Autowired private JwtTokenProvider jwtTokenProvider;

     @Override
     public void configure(HttpSecurity builder) throws Exception {
          JwtTokenFilter jwtTokenFilter = new JwtTokenFilter(jwtTokenProvider);

          builder.addFilterBefore(jwtTokenFilter, UsernamePasswordAuthenticationFilter.class);
     }
}
