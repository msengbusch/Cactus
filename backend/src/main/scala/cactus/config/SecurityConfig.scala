package cactus.config

import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.{EnableWebSecurity, WebSecurityConfigurerAdapter}

@Configuration
@EnableWebSecurity
class SecurityConfig extends WebSecurityConfigurerAdapter{

  override def configure(http: HttpSecurity): Unit = {
    http.httpBasic().disable()
    http.formLogin().disable()
  }
}
