package custom.autoconfigure

import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.PropertySource

@Configuration
class CustomAutoConfigure

@PropertySource("classpath:eureka.properties")
@EnableEurekaClient
@Configuration
class EurekaConfiguration

@PropertySource("classpath:zipkin.properties")
@Configuration
class ZipkinConfiguration

//@Configuration
//@EnableSwagger2
//class SwaggerConfiguration {
//    @Bean
//    fun api(): Docket {
//        return Docket(DocumentationType.SWAGGER_2)
//            .select()
//            .apis(RequestHandlerSelectors.any())
//            .paths(PathSelectors.any())
//            .build()
//    }
//}