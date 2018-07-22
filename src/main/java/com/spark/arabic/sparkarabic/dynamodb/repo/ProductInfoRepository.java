package com.spark.arabic.sparkarabic.dynamodb.repo;

import com.spark.arabic.sparkarabic.ProductInfo;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@EnableScan
public interface ProductInfoRepository extends
        CrudRepository<ProductInfo, String> {

        List<ProductInfo> findById(ProductInfo s);
}
