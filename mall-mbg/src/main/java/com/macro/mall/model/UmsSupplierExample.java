package com.macro.mall.model;

import java.util.ArrayList;
import java.util.List;

public class UmsSupplierExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UmsSupplierExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIsNull() {
            addCriterion("supplier_name is null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIsNotNull() {
            addCriterion("supplier_name is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameEqualTo(String value) {
            addCriterion("supplier_name =", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotEqualTo(String value) {
            addCriterion("supplier_name <>", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThan(String value) {
            addCriterion("supplier_name >", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_name >=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThan(String value) {
            addCriterion("supplier_name <", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThanOrEqualTo(String value) {
            addCriterion("supplier_name <=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLike(String value) {
            addCriterion("supplier_name like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotLike(String value) {
            addCriterion("supplier_name not like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIn(List<String> values) {
            addCriterion("supplier_name in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotIn(List<String> values) {
            addCriterion("supplier_name not in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameBetween(String value1, String value2) {
            addCriterion("supplier_name between", value1, value2, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotBetween(String value1, String value2) {
            addCriterion("supplier_name not between", value1, value2, "supplierName");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andContractManIsNull() {
            addCriterion("contract_man is null");
            return (Criteria) this;
        }

        public Criteria andContractManIsNotNull() {
            addCriterion("contract_man is not null");
            return (Criteria) this;
        }

        public Criteria andContractManEqualTo(String value) {
            addCriterion("contract_man =", value, "contractMan");
            return (Criteria) this;
        }

        public Criteria andContractManNotEqualTo(String value) {
            addCriterion("contract_man <>", value, "contractMan");
            return (Criteria) this;
        }

        public Criteria andContractManGreaterThan(String value) {
            addCriterion("contract_man >", value, "contractMan");
            return (Criteria) this;
        }

        public Criteria andContractManGreaterThanOrEqualTo(String value) {
            addCriterion("contract_man >=", value, "contractMan");
            return (Criteria) this;
        }

        public Criteria andContractManLessThan(String value) {
            addCriterion("contract_man <", value, "contractMan");
            return (Criteria) this;
        }

        public Criteria andContractManLessThanOrEqualTo(String value) {
            addCriterion("contract_man <=", value, "contractMan");
            return (Criteria) this;
        }

        public Criteria andContractManLike(String value) {
            addCriterion("contract_man like", value, "contractMan");
            return (Criteria) this;
        }

        public Criteria andContractManNotLike(String value) {
            addCriterion("contract_man not like", value, "contractMan");
            return (Criteria) this;
        }

        public Criteria andContractManIn(List<String> values) {
            addCriterion("contract_man in", values, "contractMan");
            return (Criteria) this;
        }

        public Criteria andContractManNotIn(List<String> values) {
            addCriterion("contract_man not in", values, "contractMan");
            return (Criteria) this;
        }

        public Criteria andContractManBetween(String value1, String value2) {
            addCriterion("contract_man between", value1, value2, "contractMan");
            return (Criteria) this;
        }

        public Criteria andContractManNotBetween(String value1, String value2) {
            addCriterion("contract_man not between", value1, value2, "contractMan");
            return (Criteria) this;
        }

        public Criteria andContractPhoneIsNull() {
            addCriterion("contract_phone is null");
            return (Criteria) this;
        }

        public Criteria andContractPhoneIsNotNull() {
            addCriterion("contract_phone is not null");
            return (Criteria) this;
        }

        public Criteria andContractPhoneEqualTo(String value) {
            addCriterion("contract_phone =", value, "contractPhone");
            return (Criteria) this;
        }

        public Criteria andContractPhoneNotEqualTo(String value) {
            addCriterion("contract_phone <>", value, "contractPhone");
            return (Criteria) this;
        }

        public Criteria andContractPhoneGreaterThan(String value) {
            addCriterion("contract_phone >", value, "contractPhone");
            return (Criteria) this;
        }

        public Criteria andContractPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("contract_phone >=", value, "contractPhone");
            return (Criteria) this;
        }

        public Criteria andContractPhoneLessThan(String value) {
            addCriterion("contract_phone <", value, "contractPhone");
            return (Criteria) this;
        }

        public Criteria andContractPhoneLessThanOrEqualTo(String value) {
            addCriterion("contract_phone <=", value, "contractPhone");
            return (Criteria) this;
        }

        public Criteria andContractPhoneLike(String value) {
            addCriterion("contract_phone like", value, "contractPhone");
            return (Criteria) this;
        }

        public Criteria andContractPhoneNotLike(String value) {
            addCriterion("contract_phone not like", value, "contractPhone");
            return (Criteria) this;
        }

        public Criteria andContractPhoneIn(List<String> values) {
            addCriterion("contract_phone in", values, "contractPhone");
            return (Criteria) this;
        }

        public Criteria andContractPhoneNotIn(List<String> values) {
            addCriterion("contract_phone not in", values, "contractPhone");
            return (Criteria) this;
        }

        public Criteria andContractPhoneBetween(String value1, String value2) {
            addCriterion("contract_phone between", value1, value2, "contractPhone");
            return (Criteria) this;
        }

        public Criteria andContractPhoneNotBetween(String value1, String value2) {
            addCriterion("contract_phone not between", value1, value2, "contractPhone");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}