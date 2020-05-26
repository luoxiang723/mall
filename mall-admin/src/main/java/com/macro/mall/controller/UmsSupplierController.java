package com.macro.mall.controller;

import com.macro.mall.common.api.CommonPage;
import com.macro.mall.common.api.CommonResult;
import com.macro.mall.dto.UmsSupplierParam;
import com.macro.mall.model.UmsSupplier;
import com.macro.mall.service.UmsSupplierService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 供应商管理Controller
 */
@Controller
@Api(tags = "UmsSupplierController", description = "供应商管理")
@RequestMapping("/supplier")
public class UmsSupplierController {

    @Autowired
    private UmsSupplierService umsSupplierService;

    @ApiOperation("查询供应商")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<UmsSupplier>> getList(@RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                         @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<UmsSupplier> supplierList = umsSupplierService.list(pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(supplierList));
    }

    @ApiOperation("添加产品分类")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult create(@Validated @RequestBody UmsSupplierParam umsSupplierParam,
                               BindingResult result) {
        int count = umsSupplierService.create(umsSupplierParam);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("修改商品分类")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult update(@PathVariable Long id,
                               @Validated
                               @RequestBody UmsSupplierParam umsSupplierParam,
                               BindingResult result) {
        int count = umsSupplierService.update(id, umsSupplierParam);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("根据id获取供应商")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<UmsSupplier> getItem(@PathVariable Long id) {
        UmsSupplier umsSupplier = umsSupplierService.getItem(id);
        return CommonResult.success(umsSupplier);
    }

    @ApiOperation("删除供应商")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult delete(@PathVariable Long id) {
        int count = umsSupplierService.delete(id);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }
}
