package api.apimanagement.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student channo = new Student(
                   "Channo",
                    "channo1010@gmail.com",

                    LocalDate.of(1999,10,10)
            );
            Student dara = new Student(
                    "Dara",
                    "dara1010@gmail.com",

                    LocalDate.of(1998,10,10)
            );
            repository.saveAll(
                    List.of(channo,dara)
            );
        };
    }

}
