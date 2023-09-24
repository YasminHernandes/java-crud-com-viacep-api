package dio.designpatterns.challenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class JavaDesignPatternsChallengeApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaDesignPatternsChallengeApplication.class, args);
	}

}
