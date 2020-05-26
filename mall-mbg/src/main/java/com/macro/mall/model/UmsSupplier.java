package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class UmsSupplier implements Serializable {
    private Long id;

    @ApiModelProperty(value = "供应商名称")
    private String supplierName;

    @ApiModelProperty(value = "状态  0-停用  1-启用")
    private Integer status;

    @ApiModelProperty(value = "联系人")
    private String contractMan;

    @ApiModelProperty(value = "联系电话")
    private String contractPhone;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", supplierName=").append(supplierName);
        sb.append(", status=").append(status);
        sb.append(", contractMan=").append(contractMan);
        sb.append(", contractPhone=").append(contractPhone);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
