package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotEmpty;

public class UmsSupplierParam {

    @ApiModelProperty("供应商名称")
    @NotEmpty(message = "供应商名称不能为空")
    private String supplierName;

    @ApiModelProperty(value = "状态",required = true)
    private Integer status;

    @ApiModelProperty("联系人")
    private String contractMan;

    @ApiModelProperty("联系电话")
    private String contractPhone;

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getContractMan() {
        return contractMan;
    }

    public void setContractMan(String contractMan) {
        this.contractMan = contractMan;
    }

    public String getContractPhone() {
        return contractPhone;
    }

    public void setContractPhone(String contractPhone) {
        this.contractPhone = contractPhone;
    }
}
