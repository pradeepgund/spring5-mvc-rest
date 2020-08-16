package com.pradeep.api.v1.mapper;

import com.pradeep.api.v1.model.CategoryDTO;
import com.pradeep.domain.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {

    CategoryMapper CATEGORY_MAPPER= Mappers.getMapper(CategoryMapper.class);

    CategoryDTO categoryToCategoryDTO(Category category);
}
