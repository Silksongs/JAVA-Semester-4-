package project10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        Magican Voldemort = context.getBean(Voldemort.class);
        Magican HarryPotter = context.getBean(HarryPotter.class);
        Magican RonWeesly = context.getBean(RonWeesly.class);
        Voldemort.doMagic();
        HarryPotter.doMagic();
        RonWeesly.doMagic();
    }
}
