package ku.cs.kafe.config;

/**
 * Name: Puri Limwongrujirat
 * Student ID: 6510450844
 */

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ComponentConfig {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
