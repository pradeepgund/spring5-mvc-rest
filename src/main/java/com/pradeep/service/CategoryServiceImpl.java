package com.pradeep.service;

import com.pradeep.api.v1.mapper.CategoryMapper;
import com.pradeep.api.v1.model.CategoryDTO;
import com.pradeep.repositories.CategoryRepository;

import java.util.List;
import java.util.stream.Collectors;

public class CategoryServiceImpl implements CategoryService {

    CategoryMapper mapper;
    CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryMapper mapper, CategoryRepository categoryRepository) {
        this.mapper = mapper;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<CategoryDTO> getAllCategories() {
        return categoryRepository.findAll()
                .stream()
                .map(mapper::categoryToCategoryDTO)
                .collect(Collectors.toList());
    }

    @Override
    public CategoryDTO getCategoryByName(String name) {
        return mapper.categoryToCategoryDTO(categoryRepository.findByName(name));
    }
}
