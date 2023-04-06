package com.w2retrieval.starterproject.config;

import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.mongodb.core.convert.MongoCustomConversions;
import com.w2retrieval.starterproject.converter.EEFormDataConverter;

@Configuration
public class MongoConfig {
    @Bean
    public MongoCustomConversions customConversions()
    {
        List<Converter<?, ?>> converterList = new ArrayList<Converter<?, ?>>();
        converterList.add(new EEFormDataConverter());
        return new MongoCustomConversions(converterList);
    }

}
