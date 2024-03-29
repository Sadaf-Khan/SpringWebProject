package com.dao;

import com.component.PaginationResult;
import com.example.demo.ProductInfo;
import com.model.Product;

public interface ProductDAO {

   
   
    public Product findProduct(String code);
   
    public ProductInfo findProductInfo(String code) ;
 
   
    public PaginationResult<ProductInfo> queryProducts(int page,
                       int maxResult, int maxNavigationPage  );
   
    public PaginationResult<ProductInfo> queryProducts(int page, int maxResult,
                       int maxNavigationPage, String likeName);

    public void save(ProductInfo productInfo);
   
}