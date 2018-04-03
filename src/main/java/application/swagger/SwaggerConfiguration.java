package application.swagger;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfiguration {

  @Value("${swagger.title}")
  private String swaggerTitle;

  @Value("${swagger.description}")
  private String swaggerDescription;

  @Bean
  public Docket swaggerSettings(){
    return new Docket(DocumentationType.SWAGGER_2)
        .select()
        .apis(RequestHandlerSelectors.basePackage("application.controller"))
        .build()
        .apiInfo(apiInfo());
  }

  private ApiInfo apiInfo(){
    return new ApiInfo(swaggerTitle,
        swaggerDescription,
        "1.0",
        "",
        new Contact("Ubercool", "https://github.com/ubersmart/springbootwithdocker", ""),
        "",
        "",
        new ArrayList<>()
    );
  }
}
