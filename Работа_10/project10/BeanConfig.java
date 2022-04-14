package project10;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class BeanConfig {
    @Bean
    public HarryPotter HarryPotterdoMagic() {
        return new HarryPotter();
    }
    @Bean
    public Voldemort VoldemortdoMagic() {
        return new Voldemort();
    }
    @Bean
    public RonWeesly RonWeeslydoMagic() {
        return new RonWeesly();
    }
}