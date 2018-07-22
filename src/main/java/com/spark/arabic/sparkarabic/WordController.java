package com.spark.arabic.sparkarabic;

import com.fasterxml.jackson.annotation.JsonView;
import com.spark.arabic.sparkarabic.dynamodb.repo.ProductInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;
import java.util.List;


@RestController
public class WordController {

    @Autowired
    ProductInfoRepository repository;
   // @Value("${multipart.location")
    //@RequestMapping(value = "/")

    @RequestMapping(value = "/words")
    public String sayHi() {
        return "his";
    }

    @RequestMapping(value = "/add")
    public String add() {
        //repository.findAll();
        ProductInfo dave = new ProductInfo("22", "25");
        //dave.setId("111");
        repository.save(dave);
        return "donea";
    }

    public static class EntityVisibility {
        public static class Public { }
        public static class Detailed extends Public { }
        public static class Internal extends Detailed { }
    }


    @JsonView(EntityVisibility.Public.class)
    @RequestMapping(value = "/list")
    public Response<List<ProductInfo>> list() {
        List<ProductInfo> list = (List<ProductInfo>) repository.findAll();
        System.out.println(list);
        return  (Response<List<ProductInfo>>)list;
    }
}
