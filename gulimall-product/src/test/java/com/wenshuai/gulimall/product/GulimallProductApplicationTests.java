package com.wenshuai.gulimall.product;

import com.wenshuai.common.utils.PageUtils;
import com.wenshuai.gulimall.product.entity.BrandEntity;
import com.wenshuai.gulimall.product.entity.CategoryEntity;
import com.wenshuai.gulimall.product.service.BrandService;
import com.wenshuai.gulimall.product.service.CategoryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Autowired
    CategoryService categoryService;


    @Test
    void contextLoads() {

        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("wenshuai");
        brandEntity.setDescript("this is a test");
        brandService.save(brandEntity);

    }

    @Test
    void test(){
        List<CategoryEntity> allCategories = categoryService.getAllCategories();
        System.out.println(allCategories);

    }

}
