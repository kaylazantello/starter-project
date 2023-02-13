package com.w2retrieval.starterproject.converter;

import com.w2retrieval.starterproject.model.EEFormData;

import com.w2retrieval.starterproject.model.EETaxData;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@ReadingConverter
public class EEFormDataConverter implements Converter<List<EETaxData>, EEFormData> {
    @Override
    public EEFormData convert(List<EETaxData> source) {
        System.out.println("EEFormDataConverter Called\n");
        return new EEFormData(source);
    }
}


/*
*
*
*
package com.sample.app.converter;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.stereotype.Component;

@Component
@ReadingConverter
public class ZonedDateTimeReadConverter implements Converter<Date, ZonedDateTime> {

 @Override
 public ZonedDateTime convert(Date date) {
  System.out.println("Reading Converter called");
  return date.toInstant().atZone(ZoneOffset.UTC);
 }

}

*
*
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.baeldung.model.User;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class UserWriterConverter implements Converter<User, DBObject> {

    @Override
    public DBObject convert(final User user) {
        final DBObject dbObject = new BasicDBObject();
        dbObject.put("name", user.getName());
        dbObject.put("age", user.getAge());
        if (user.getEmailAddress() != null) {
            final DBObject emailDbObject = new BasicDBObject();
            emailDbObject.put("value", user.getEmailAddress().getValue());
            dbObject.put("email", emailDbObject);
        }
        dbObject.removeField("_class");
        return dbObject;
    }

}

*
* */