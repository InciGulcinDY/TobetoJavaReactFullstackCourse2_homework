package org.example;

import org.example.business.ProductManager;
import org.example.core.logging.Logger;
import org.example.dataAccess.JdbcProductDao;
import org.example.entities.Product;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception{
        Product product1 = new Product(1, "IPHONE Xr", 1000);
        Logger[] loggers = {};

        ProductManager productManager = new ProductManager(new JdbcProductDao(), loggers);
        productManager.add(product1);
    }

}