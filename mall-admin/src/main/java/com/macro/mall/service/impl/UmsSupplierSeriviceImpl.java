package com.macro.mall.service.impl;

import com.github.pagehelper.PageHelper;
import com.macro.mall.dto.UmsSupplierParam;
import com.macro.mall.mapper.UmsSupplierMapper;
import com.macro.mall.model.UmsSupplier;
import com.macro.mall.model.UmsSupplierExample;
import com.macro.mall.service.UmsSupplierService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UmsSupplierSeriviceImpl implements UmsSupplierService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UmsSupplierSeriviceImpl.class);

    @Autowired
    private UmsSupplierMapper umsSupplierMapper;

    @Override
    public List<UmsSupplier> list(Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        UmsSupplierExample supplierExample = new UmsSupplierExample();
        UmsSupplierExample.Criteria criteria = supplierExample.createCriteria();
        return umsSupplierMapper.selectByExample(supplierExample);
    }

    @Override
    public int create(UmsSupplierParam umsSupplierParam) {
        UmsSupplier umsSupplier = new UmsSupplier();
        BeanUtils.copyProperties(umsSupplierParam, umsSupplier);
        int count = umsSupplierMapper.insertSelective(umsSupplier);
        return count;
    }

    @Override
    public int update(Long id, UmsSupplierParam umsSupplierParam) {
        UmsSupplier umsSupplier = new UmsSupplier();
        umsSupplier.setId(id);
        BeanUtils.copyProperties(umsSupplierParam, umsSupplier);
        return umsSupplierMapper.updateByPrimaryKeySelective(umsSupplier);
    }

    @Override
    public UmsSupplier getItem(Long id) {
        return umsSupplierMapper.selectByPrimaryKey(id);
    }

    @Override
    public int delete(Long id) {
        return umsSupplierMapper.deleteByPrimaryKey(id);
    }
}
