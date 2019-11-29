package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IProductService implements ProductService {

    private static Map<Integer, Product> productMap = new HashMap();
    static {
        productMap.put(1,new Product(1,"Iphone 5S","https://img.thuthuatphanmem.vn/uploads/2018/09/26/hinh-nen-chu-cho-bong-tren-bai-co-xanh-dep_052809960.jpg"));
        productMap.put(2,new Product(2,"Iphone 6S","https://img.thuthuatphanmem.vn/uploads/2018/09/26/hinh-nen-chu-cho-bong-tren-bai-co-xanh-dep_052809960.jpg"));
        productMap.put(3,new Product(3,"Iphone 7 Plus","https://img.thuthuatphanmem.vn/uploads/2018/09/26/hinh-nen-chu-cho-bong-tren-bai-co-xanh-dep_052809960.jpg"));
        productMap.put(4,new Product(4,"Iphone 8","https://img.thuthuatphanmem.vn/uploads/2018/09/26/hinh-nen-chu-cho-bong-tren-bai-co-xanh-dep_052809960.jpg"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public Product findByID(int id) {
        return productMap.get(id);
    }

    @Override
    public void save(Product product) {
        productMap.put(product.getProduct_id(),product);
    }

    @Override
    public void update(int id, Product product) {
        productMap.put(id,product);
    }

    @Override
    public void delete(int id) {
        productMap.remove(id);
    }
}
