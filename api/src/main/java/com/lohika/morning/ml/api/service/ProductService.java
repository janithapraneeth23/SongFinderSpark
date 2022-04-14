package com.lohika.morning.ml.api.service;

import com.lohika.morning.ml.spark.driver.service.product.ProductMLService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ProductService {

    @Autowired
    private ProductMLService productMLService;

    @Value("C:\\Backup\\spark-ml-samples-master\\training-set\\product")
    private String productTrainingSetCsvFilePath;

    @Value("C:\\Backup\\spark-ml-samples-master\\training-set\\product")
    private String productTestSetCsvFilePath;

    public Map<String, Object> trainRandomForestClassifier() {
        return productMLService.trainRandomForestClassifier(productTrainingSetCsvFilePath, productTestSetCsvFilePath);
    }

}
