package com.macro.mall.mapper;

import com.macro.mall.model.UmsSupplier;
import com.macro.mall.model.UmsSupplierExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UmsSupplierMapper {
    long countByExample(UmsSupplierExample example);

    int deleteByExample(UmsSupplierExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsSupplier record);

    int insertSelective(UmsSupplier record);

    List<UmsSupplier> selectByExample(UmsSupplierExample example);

    UmsSupplier selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsSupplier record, @Param("example") UmsSupplierExample example);

    int updateByExample(@Param("record") UmsSupplier record, @Param("example") UmsSupplierExample example);

    int updateByPrimaryKeySelective(UmsSupplier record);

    int updateByPrimaryKey(UmsSupplier record);
}
