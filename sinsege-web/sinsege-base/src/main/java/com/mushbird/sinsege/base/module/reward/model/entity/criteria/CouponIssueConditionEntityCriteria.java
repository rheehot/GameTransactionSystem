package com.mushbird.sinsege.base.module.reward.model.entity.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CouponIssueConditionEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public CouponIssueConditionEntityCriteria() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
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

        public Criteria andCpnIdIsNull() {
            addCriterion("TCIC.CPN_ID is null");
            return (Criteria) this;
        }

        public Criteria andCpnIdIsNotNull() {
            addCriterion("TCIC.CPN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCpnIdEqualTo(Integer value) {
            addCriterion("TCIC.CPN_ID =", value, "cpnId");
            return (Criteria) this;
        }

        public Criteria andCpnIdNotEqualTo(Integer value) {
            addCriterion("TCIC.CPN_ID <>", value, "cpnId");
            return (Criteria) this;
        }

        public Criteria andCpnIdGreaterThan(Integer value) {
            addCriterion("TCIC.CPN_ID >", value, "cpnId");
            return (Criteria) this;
        }

        public Criteria andCpnIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TCIC.CPN_ID >=", value, "cpnId");
            return (Criteria) this;
        }

        public Criteria andCpnIdLessThan(Integer value) {
            addCriterion("TCIC.CPN_ID <", value, "cpnId");
            return (Criteria) this;
        }

        public Criteria andCpnIdLessThanOrEqualTo(Integer value) {
            addCriterion("TCIC.CPN_ID <=", value, "cpnId");
            return (Criteria) this;
        }

        public Criteria andCpnIdIn(List<Integer> values) {
            addCriterion("TCIC.CPN_ID in", values, "cpnId");
            return (Criteria) this;
        }

        public Criteria andCpnIdNotIn(List<Integer> values) {
            addCriterion("TCIC.CPN_ID not in", values, "cpnId");
            return (Criteria) this;
        }

        public Criteria andCpnIdBetween(Integer value1, Integer value2) {
            addCriterion("TCIC.CPN_ID between", value1, value2, "cpnId");
            return (Criteria) this;
        }

        public Criteria andCpnIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TCIC.CPN_ID not between", value1, value2, "cpnId");
            return (Criteria) this;
        }

        public Criteria andCpnIsuCondCdIsNull() {
            addCriterion("TCIC.CPN_ISU_COND_CD is null");
            return (Criteria) this;
        }

        public Criteria andCpnIsuCondCdIsNotNull() {
            addCriterion("TCIC.CPN_ISU_COND_CD is not null");
            return (Criteria) this;
        }

        public Criteria andCpnIsuCondCdEqualTo(String value) {
            addCriterion("TCIC.CPN_ISU_COND_CD =", value, "cpnIsuCondCd");
            return (Criteria) this;
        }

        public Criteria andCpnIsuCondCdNotEqualTo(String value) {
            addCriterion("TCIC.CPN_ISU_COND_CD <>", value, "cpnIsuCondCd");
            return (Criteria) this;
        }

        public Criteria andCpnIsuCondCdGreaterThan(String value) {
            addCriterion("TCIC.CPN_ISU_COND_CD >", value, "cpnIsuCondCd");
            return (Criteria) this;
        }

        public Criteria andCpnIsuCondCdGreaterThanOrEqualTo(String value) {
            addCriterion("TCIC.CPN_ISU_COND_CD >=", value, "cpnIsuCondCd");
            return (Criteria) this;
        }

        public Criteria andCpnIsuCondCdLessThan(String value) {
            addCriterion("TCIC.CPN_ISU_COND_CD <", value, "cpnIsuCondCd");
            return (Criteria) this;
        }

        public Criteria andCpnIsuCondCdLessThanOrEqualTo(String value) {
            addCriterion("TCIC.CPN_ISU_COND_CD <=", value, "cpnIsuCondCd");
            return (Criteria) this;
        }

        public Criteria andCpnIsuCondCdLike(String value) {
            addCriterion("TCIC.CPN_ISU_COND_CD like", value, "cpnIsuCondCd");
            return (Criteria) this;
        }

        public Criteria andCpnIsuCondCdNotLike(String value) {
            addCriterion("TCIC.CPN_ISU_COND_CD not like", value, "cpnIsuCondCd");
            return (Criteria) this;
        }

        public Criteria andCpnIsuCondCdIn(List<String> values) {
            addCriterion("TCIC.CPN_ISU_COND_CD in", values, "cpnIsuCondCd");
            return (Criteria) this;
        }

        public Criteria andCpnIsuCondCdNotIn(List<String> values) {
            addCriterion("TCIC.CPN_ISU_COND_CD not in", values, "cpnIsuCondCd");
            return (Criteria) this;
        }

        public Criteria andCpnIsuCondCdBetween(String value1, String value2) {
            addCriterion("TCIC.CPN_ISU_COND_CD between", value1, value2, "cpnIsuCondCd");
            return (Criteria) this;
        }

        public Criteria andCpnIsuCondCdNotBetween(String value1, String value2) {
            addCriterion("TCIC.CPN_ISU_COND_CD not between", value1, value2, "cpnIsuCondCd");
            return (Criteria) this;
        }

        public Criteria andCpnIsuCondValIsNull() {
            addCriterion("TCIC.CPN_ISU_COND_VAL is null");
            return (Criteria) this;
        }

        public Criteria andCpnIsuCondValIsNotNull() {
            addCriterion("TCIC.CPN_ISU_COND_VAL is not null");
            return (Criteria) this;
        }

        public Criteria andCpnIsuCondValEqualTo(String value) {
            addCriterion("TCIC.CPN_ISU_COND_VAL =", value, "cpnIsuCondVal");
            return (Criteria) this;
        }

        public Criteria andCpnIsuCondValNotEqualTo(String value) {
            addCriterion("TCIC.CPN_ISU_COND_VAL <>", value, "cpnIsuCondVal");
            return (Criteria) this;
        }

        public Criteria andCpnIsuCondValGreaterThan(String value) {
            addCriterion("TCIC.CPN_ISU_COND_VAL >", value, "cpnIsuCondVal");
            return (Criteria) this;
        }

        public Criteria andCpnIsuCondValGreaterThanOrEqualTo(String value) {
            addCriterion("TCIC.CPN_ISU_COND_VAL >=", value, "cpnIsuCondVal");
            return (Criteria) this;
        }

        public Criteria andCpnIsuCondValLessThan(String value) {
            addCriterion("TCIC.CPN_ISU_COND_VAL <", value, "cpnIsuCondVal");
            return (Criteria) this;
        }

        public Criteria andCpnIsuCondValLessThanOrEqualTo(String value) {
            addCriterion("TCIC.CPN_ISU_COND_VAL <=", value, "cpnIsuCondVal");
            return (Criteria) this;
        }

        public Criteria andCpnIsuCondValLike(String value) {
            addCriterion("TCIC.CPN_ISU_COND_VAL like", value, "cpnIsuCondVal");
            return (Criteria) this;
        }

        public Criteria andCpnIsuCondValNotLike(String value) {
            addCriterion("TCIC.CPN_ISU_COND_VAL not like", value, "cpnIsuCondVal");
            return (Criteria) this;
        }

        public Criteria andCpnIsuCondValIn(List<String> values) {
            addCriterion("TCIC.CPN_ISU_COND_VAL in", values, "cpnIsuCondVal");
            return (Criteria) this;
        }

        public Criteria andCpnIsuCondValNotIn(List<String> values) {
            addCriterion("TCIC.CPN_ISU_COND_VAL not in", values, "cpnIsuCondVal");
            return (Criteria) this;
        }

        public Criteria andCpnIsuCondValBetween(String value1, String value2) {
            addCriterion("TCIC.CPN_ISU_COND_VAL between", value1, value2, "cpnIsuCondVal");
            return (Criteria) this;
        }

        public Criteria andCpnIsuCondValNotBetween(String value1, String value2) {
            addCriterion("TCIC.CPN_ISU_COND_VAL not between", value1, value2, "cpnIsuCondVal");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TCIC.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TCIC.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TCIC.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TCIC.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TCIC.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TCIC.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TCIC.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TCIC.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TCIC.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TCIC.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TCIC.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TCIC.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TCIC.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TCIC.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TCIC.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TCIC.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TCIC.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TCIC.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TCIC.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TCIC.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TCIC.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TCIC.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TCIC.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TCIC.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TCIC.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TCIC.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andCpnIsuCondCdLikeInsensitive(String value) {
            addCriterion("upper(TCIC.CPN_ISU_COND_CD) like", value.toUpperCase(), "cpnIsuCondCd");
            return (Criteria) this;
        }

        public Criteria andCpnIsuCondValLikeInsensitive(String value) {
            addCriterion("upper(TCIC.CPN_ISU_COND_VAL) like", value.toUpperCase(), "cpnIsuCondVal");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TCIC.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andCpnIsuCondCdLikeLeft(String value) {
            addCriterion("TCIC.CPN_ISU_COND_CD like ", "%" + value, "cpnIsuCondCd");
            return (Criteria) this;
        }

        public Criteria andCpnIsuCondCdLikeRight(String value) {
            addCriterion("TCIC.CPN_ISU_COND_CD like ", value + "%", "cpnIsuCondCd");
            return (Criteria) this;
        }

        public Criteria andCpnIsuCondCdLikeBoth(String value) {
            addCriterion("TCIC.CPN_ISU_COND_CD like ", "%" + value + "%", "cpnIsuCondCd");
            return (Criteria) this;
        }

        public Criteria andCpnIsuCondValLikeLeft(String value) {
            addCriterion("TCIC.CPN_ISU_COND_VAL like ", "%" + value, "cpnIsuCondVal");
            return (Criteria) this;
        }

        public Criteria andCpnIsuCondValLikeRight(String value) {
            addCriterion("TCIC.CPN_ISU_COND_VAL like ", value + "%", "cpnIsuCondVal");
            return (Criteria) this;
        }

        public Criteria andCpnIsuCondValLikeBoth(String value) {
            addCriterion("TCIC.CPN_ISU_COND_VAL like ", "%" + value + "%", "cpnIsuCondVal");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TCIC.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TCIC.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TCIC.REG_ID like ", "%" + value + "%", "regId");
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