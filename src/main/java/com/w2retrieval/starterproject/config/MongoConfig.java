/*
package com.w2retrieval.starterproject.config;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.w2retrieval.starterproject.model.EETaxData;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.MongoTransactionManager;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.core.convert.MongoCustomConversions;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import com.w2retrieval.starterproject.model.EEFormData;

@Configuration
public class MongoConfig {
    @Bean
    public MongoCustomConversions customConversions()
    {
        List<Converter<?, ?>> converterList = new ArrayList<Converter<?, ?>>();
        converterList.add(new MyCustomWriterConverter());
        return new CustomConversions(converterList);
    }

    @ReadingConverter
    public class ListToEEFormDataConverter implements Converter<ArrayList<EETaxData>, EEFormData> {

        @Override
        public EEFormData convert(ArrayList<EETaxData> source) {
            return new EEFormData(source);
        }
    }
}


*/
