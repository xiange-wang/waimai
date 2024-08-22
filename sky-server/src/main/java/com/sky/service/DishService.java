package com.sky.service;

import com.sky.annotation.AutoFill;
import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.enumeration.OperationType;
import com.sky.result.PageResult;
import com.sky.vo.DishVO;

import java.util.List;

public interface DishService {

    /**
     * 新增菜品和对应的口味数据
     * @param dishDTO
     */
    public void saveWithFlavor(DishDTO dishDTO);

    PageResult pageQuery(DishPageQueryDTO dishPageQueryDTO);

    void deleteBatch(List<Long> ids);

    /**
     * 根据id来查询对应的菜品和口味数据
     * @param id
     * @return
     */
    DishVO getByIdWithFlavor(Long id);

    /**
     * 根据id动态修改菜品
     * @param dishDTO
     */
    @AutoFill(value = OperationType.UPDATE)
    void updateWithFlavor(DishDTO dishDTO);
}
