package com.soddy.groovy

import org.springframework.context.annotation.Lazy
import org.springframework.stereotype.Component

import javax.annotation.PostConstruct

/**
 * groovy test
 * Created by soddygosongguochao on 2017/5/2.
 */
@Component
@Lazy(false)
class DemoTest {


    @PostConstruct
    public void init(){
        //test
        println "groovy init test demo!";
        final String testStr = ",,,,c,c,,,,,,,,,,,,,";
        final String testStr1 = ",,,,,,,,,,,,,,,,";
        String[] res = testStr.split(",");
        String[] res1 = testStr1.split(",");
        println "res:"+ res.toString();
        println "res1:"+ res1.toString();
    }
}
