package io.slaweksapp.korean_Vocab_Tool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:db.properties")
public class KoreanVocabToolApplication {

	public static void main(String[] args) {
		SpringApplication.run(KoreanVocabToolApplication.class, args);
	}

}
