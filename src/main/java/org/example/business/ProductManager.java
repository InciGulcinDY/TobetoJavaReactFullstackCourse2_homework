package org.example.business;

import org.example.core.logging.Logger;
import org.example.dataAccess.JdbcProductDao;
import org.example.dataAccess.ProductDao;
import org.example.entities.Product;

import java.util.List;

public class ProductManager {
    private ProductDao productDao;
    private Logger[] loggers;

    //Dependency Injection


    public ProductManager(ProductDao productDao, Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception {
        //Business Rules:
        if(product.getUnitPrice() < 10){
            throw new Exception("The product price is not allowed to be less than 10") ;
        }

        productDao.add(product);

        for (Logger logger:loggers) {
            logger.log(product.getName());
        }
    }
}
