package com.macro.mall.service;

import com.macro.mall.dto.UmsSupplierParam;
import com.macro.mall.model.UmsSupplier;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UmsSupplierService {

    /**
     * 分页获取供应商
     * @param pageSize
     * @param pageNum
     * @return
     */
    List<UmsSupplier> list(Integer pageSize, Integer pageNum);

    /**
     * 创建供应商
     * @param umsSupplierParam
     * @return
     */
    @Transactional
    int create(UmsSupplierParam umsSupplierParam);

    /**
     * 修改供应商
     * @param id
     * @param umsSupplierParam
     * @return
     */
    @Transactional
    int update(Long id, UmsSupplierParam umsSupplierParam);

    /**
     * 根据id获取供应商
     * @param id
     * @return
     */
    UmsSupplier getItem(Long id);

    /**
     * 删除供应商
     * @param id
     * @return
     */
    int delete(Long id);
}
