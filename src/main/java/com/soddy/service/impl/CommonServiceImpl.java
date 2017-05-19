package com.soddy.service.impl;

import com.mongodb.BasicDBObject;
import com.soddy.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.UUID;

/**
 * 公共service实现
 * Created by soddygosongguochao on 2017/4/28.
 */
@Service
@Lazy(false)
public class CommonServiceImpl implements CommonService {

    @Autowired
    private SimpleMongoDbFactory mongoDbFactory;

    @Autowired
    private MongoOperations mongoOperations;

    @Autowired
    private RedisTemplate redisTemplate;

    @PostConstruct
    public void init() {

        BasicDBObject basicDBObject = new BasicDBObject();
        basicDBObject.append("_id", UUID.randomUUID().toString());
        basicDBObject.append("name", "test");

        this.mongoOperations.getCollection("cloudDemo").insert(basicDBObject);

        //redis test

        if(!this.redisTemplate.hasKey("testKey"))
        this.redisTemplate.opsForValue().set("testKey","测试蘑菇");

       final Object val =  this.redisTemplate.opsForValue().get("testKey");
        System.out.println(">>>>>>>>>>redis Test:"+val);

    }

}
