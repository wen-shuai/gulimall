package com.wenshuai.gulimall.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wenshuai.common.utils.PageUtils;
import com.wenshuai.common.utils.Query;

import com.wenshuai.gulimall.product.dao.CategoryDao;
import com.wenshuai.gulimall.product.entity.CategoryEntity;
import com.wenshuai.gulimall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Autowired
    CategoryDao categoryDao;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );
        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> getAllCategories() {
        List<CategoryEntity> categoryEntities = categoryDao.selectList(null);
        List<CategoryEntity> root = categoryEntities.stream().filter((item) -> {
            if (item.getParentCid() == 0) return true;
            return false;
        }).map((item)->{
            item.setCategoryEntities( this.getChildCategories(item, categoryEntities) );
            return item;
        }).sorted((a, b) -> {
            return (a.getSort() == null?0:a.getSort() ) -( b.getSort() == null ? 0:b.getSort() );
        }).collect(Collectors.toList());
        return root;
    }

    private List<CategoryEntity> getChildCategories(CategoryEntity parent, List<CategoryEntity> entities){
        List<CategoryEntity> collect = entities.stream().filter((item) -> {
            if (item.getParentCid() == parent.getCatId()) return true;
            return false;
        }).map((item) -> {
            item.setCategoryEntities( this.getChildCategories(item, entities) );
            return item;
        }).sorted((a, b) -> {
            return (a.getSort() == null?0:a.getSort() ) -( b.getSort() == null ? 0:b.getSort() );
        }).collect(Collectors.toList());
        return collect;
    }
}