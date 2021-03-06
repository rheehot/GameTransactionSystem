package com.mushbird.sinsege.base.module.reward.model.entity.criteria;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PointPolicyChangeHistoryEntityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public PointPolicyChangeHistoryEntityCriteria() {
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

        public Criteria andPtPcyChistIdIsNull() {
            addCriterion("TPCH.PT_PCY_CHIST_ID is null");
            return (Criteria) this;
        }

        public Criteria andPtPcyChistIdIsNotNull() {
            addCriterion("TPCH.PT_PCY_CHIST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPtPcyChistIdEqualTo(Integer value) {
            addCriterion("TPCH.PT_PCY_CHIST_ID =", value, "ptPcyChistId");
            return (Criteria) this;
        }

        public Criteria andPtPcyChistIdNotEqualTo(Integer value) {
            addCriterion("TPCH.PT_PCY_CHIST_ID <>", value, "ptPcyChistId");
            return (Criteria) this;
        }

        public Criteria andPtPcyChistIdGreaterThan(Integer value) {
            addCriterion("TPCH.PT_PCY_CHIST_ID >", value, "ptPcyChistId");
            return (Criteria) this;
        }

        public Criteria andPtPcyChistIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TPCH.PT_PCY_CHIST_ID >=", value, "ptPcyChistId");
            return (Criteria) this;
        }

        public Criteria andPtPcyChistIdLessThan(Integer value) {
            addCriterion("TPCH.PT_PCY_CHIST_ID <", value, "ptPcyChistId");
            return (Criteria) this;
        }

        public Criteria andPtPcyChistIdLessThanOrEqualTo(Integer value) {
            addCriterion("TPCH.PT_PCY_CHIST_ID <=", value, "ptPcyChistId");
            return (Criteria) this;
        }

        public Criteria andPtPcyChistIdIn(List<Integer> values) {
            addCriterion("TPCH.PT_PCY_CHIST_ID in", values, "ptPcyChistId");
            return (Criteria) this;
        }

        public Criteria andPtPcyChistIdNotIn(List<Integer> values) {
            addCriterion("TPCH.PT_PCY_CHIST_ID not in", values, "ptPcyChistId");
            return (Criteria) this;
        }

        public Criteria andPtPcyChistIdBetween(Integer value1, Integer value2) {
            addCriterion("TPCH.PT_PCY_CHIST_ID between", value1, value2, "ptPcyChistId");
            return (Criteria) this;
        }

        public Criteria andPtPcyChistIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TPCH.PT_PCY_CHIST_ID not between", value1, value2, "ptPcyChistId");
            return (Criteria) this;
        }

        public Criteria andPtTpCdIsNull() {
            addCriterion("TPCH.PT_TP_CD is null");
            return (Criteria) this;
        }

        public Criteria andPtTpCdIsNotNull() {
            addCriterion("TPCH.PT_TP_CD is not null");
            return (Criteria) this;
        }

        public Criteria andPtTpCdEqualTo(String value) {
            addCriterion("TPCH.PT_TP_CD =", value, "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andPtTpCdNotEqualTo(String value) {
            addCriterion("TPCH.PT_TP_CD <>", value, "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andPtTpCdGreaterThan(String value) {
            addCriterion("TPCH.PT_TP_CD >", value, "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andPtTpCdGreaterThanOrEqualTo(String value) {
            addCriterion("TPCH.PT_TP_CD >=", value, "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andPtTpCdLessThan(String value) {
            addCriterion("TPCH.PT_TP_CD <", value, "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andPtTpCdLessThanOrEqualTo(String value) {
            addCriterion("TPCH.PT_TP_CD <=", value, "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andPtTpCdLike(String value) {
            addCriterion("TPCH.PT_TP_CD like", value, "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andPtTpCdNotLike(String value) {
            addCriterion("TPCH.PT_TP_CD not like", value, "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andPtTpCdIn(List<String> values) {
            addCriterion("TPCH.PT_TP_CD in", values, "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andPtTpCdNotIn(List<String> values) {
            addCriterion("TPCH.PT_TP_CD not in", values, "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andPtTpCdBetween(String value1, String value2) {
            addCriterion("TPCH.PT_TP_CD between", value1, value2, "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andPtTpCdNotBetween(String value1, String value2) {
            addCriterion("TPCH.PT_TP_CD not between", value1, value2, "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andSaveUnitCdIsNull() {
            addCriterion("TPCH.SAVE_UNIT_CD is null");
            return (Criteria) this;
        }

        public Criteria andSaveUnitCdIsNotNull() {
            addCriterion("TPCH.SAVE_UNIT_CD is not null");
            return (Criteria) this;
        }

        public Criteria andSaveUnitCdEqualTo(String value) {
            addCriterion("TPCH.SAVE_UNIT_CD =", value, "saveUnitCd");
            return (Criteria) this;
        }

        public Criteria andSaveUnitCdNotEqualTo(String value) {
            addCriterion("TPCH.SAVE_UNIT_CD <>", value, "saveUnitCd");
            return (Criteria) this;
        }

        public Criteria andSaveUnitCdGreaterThan(String value) {
            addCriterion("TPCH.SAVE_UNIT_CD >", value, "saveUnitCd");
            return (Criteria) this;
        }

        public Criteria andSaveUnitCdGreaterThanOrEqualTo(String value) {
            addCriterion("TPCH.SAVE_UNIT_CD >=", value, "saveUnitCd");
            return (Criteria) this;
        }

        public Criteria andSaveUnitCdLessThan(String value) {
            addCriterion("TPCH.SAVE_UNIT_CD <", value, "saveUnitCd");
            return (Criteria) this;
        }

        public Criteria andSaveUnitCdLessThanOrEqualTo(String value) {
            addCriterion("TPCH.SAVE_UNIT_CD <=", value, "saveUnitCd");
            return (Criteria) this;
        }

        public Criteria andSaveUnitCdLike(String value) {
            addCriterion("TPCH.SAVE_UNIT_CD like", value, "saveUnitCd");
            return (Criteria) this;
        }

        public Criteria andSaveUnitCdNotLike(String value) {
            addCriterion("TPCH.SAVE_UNIT_CD not like", value, "saveUnitCd");
            return (Criteria) this;
        }

        public Criteria andSaveUnitCdIn(List<String> values) {
            addCriterion("TPCH.SAVE_UNIT_CD in", values, "saveUnitCd");
            return (Criteria) this;
        }

        public Criteria andSaveUnitCdNotIn(List<String> values) {
            addCriterion("TPCH.SAVE_UNIT_CD not in", values, "saveUnitCd");
            return (Criteria) this;
        }

        public Criteria andSaveUnitCdBetween(String value1, String value2) {
            addCriterion("TPCH.SAVE_UNIT_CD between", value1, value2, "saveUnitCd");
            return (Criteria) this;
        }

        public Criteria andSaveUnitCdNotBetween(String value1, String value2) {
            addCriterion("TPCH.SAVE_UNIT_CD not between", value1, value2, "saveUnitCd");
            return (Criteria) this;
        }

        public Criteria andSaveRateIsNull() {
            addCriterion("TPCH.SAVE_RATE is null");
            return (Criteria) this;
        }

        public Criteria andSaveRateIsNotNull() {
            addCriterion("TPCH.SAVE_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andSaveRateEqualTo(BigDecimal value) {
            addCriterion("TPCH.SAVE_RATE =", value, "saveRate");
            return (Criteria) this;
        }

        public Criteria andSaveRateNotEqualTo(BigDecimal value) {
            addCriterion("TPCH.SAVE_RATE <>", value, "saveRate");
            return (Criteria) this;
        }

        public Criteria andSaveRateGreaterThan(BigDecimal value) {
            addCriterion("TPCH.SAVE_RATE >", value, "saveRate");
            return (Criteria) this;
        }

        public Criteria andSaveRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TPCH.SAVE_RATE >=", value, "saveRate");
            return (Criteria) this;
        }

        public Criteria andSaveRateLessThan(BigDecimal value) {
            addCriterion("TPCH.SAVE_RATE <", value, "saveRate");
            return (Criteria) this;
        }

        public Criteria andSaveRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TPCH.SAVE_RATE <=", value, "saveRate");
            return (Criteria) this;
        }

        public Criteria andSaveRateIn(List<BigDecimal> values) {
            addCriterion("TPCH.SAVE_RATE in", values, "saveRate");
            return (Criteria) this;
        }

        public Criteria andSaveRateNotIn(List<BigDecimal> values) {
            addCriterion("TPCH.SAVE_RATE not in", values, "saveRate");
            return (Criteria) this;
        }

        public Criteria andSaveRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TPCH.SAVE_RATE between", value1, value2, "saveRate");
            return (Criteria) this;
        }

        public Criteria andSaveRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TPCH.SAVE_RATE not between", value1, value2, "saveRate");
            return (Criteria) this;
        }

        public Criteria andSaveAmtIsNull() {
            addCriterion("TPCH.SAVE_AMT is null");
            return (Criteria) this;
        }

        public Criteria andSaveAmtIsNotNull() {
            addCriterion("TPCH.SAVE_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andSaveAmtEqualTo(Integer value) {
            addCriterion("TPCH.SAVE_AMT =", value, "saveAmt");
            return (Criteria) this;
        }

        public Criteria andSaveAmtNotEqualTo(Integer value) {
            addCriterion("TPCH.SAVE_AMT <>", value, "saveAmt");
            return (Criteria) this;
        }

        public Criteria andSaveAmtGreaterThan(Integer value) {
            addCriterion("TPCH.SAVE_AMT >", value, "saveAmt");
            return (Criteria) this;
        }

        public Criteria andSaveAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TPCH.SAVE_AMT >=", value, "saveAmt");
            return (Criteria) this;
        }

        public Criteria andSaveAmtLessThan(Integer value) {
            addCriterion("TPCH.SAVE_AMT <", value, "saveAmt");
            return (Criteria) this;
        }

        public Criteria andSaveAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TPCH.SAVE_AMT <=", value, "saveAmt");
            return (Criteria) this;
        }

        public Criteria andSaveAmtIn(List<Integer> values) {
            addCriterion("TPCH.SAVE_AMT in", values, "saveAmt");
            return (Criteria) this;
        }

        public Criteria andSaveAmtNotIn(List<Integer> values) {
            addCriterion("TPCH.SAVE_AMT not in", values, "saveAmt");
            return (Criteria) this;
        }

        public Criteria andSaveAmtBetween(Integer value1, Integer value2) {
            addCriterion("TPCH.SAVE_AMT between", value1, value2, "saveAmt");
            return (Criteria) this;
        }

        public Criteria andSaveAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TPCH.SAVE_AMT not between", value1, value2, "saveAmt");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNull() {
            addCriterion("TPCH.REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andRegDtIsNotNull() {
            addCriterion("TPCH.REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtEqualTo(Date value) {
            addCriterion("TPCH.REG_DT =", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotEqualTo(Date value) {
            addCriterion("TPCH.REG_DT <>", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThan(Date value) {
            addCriterion("TPCH.REG_DT >", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TPCH.REG_DT >=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThan(Date value) {
            addCriterion("TPCH.REG_DT <", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtLessThanOrEqualTo(Date value) {
            addCriterion("TPCH.REG_DT <=", value, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtIn(List<Date> values) {
            addCriterion("TPCH.REG_DT in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotIn(List<Date> values) {
            addCriterion("TPCH.REG_DT not in", values, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtBetween(Date value1, Date value2) {
            addCriterion("TPCH.REG_DT between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegDtNotBetween(Date value1, Date value2) {
            addCriterion("TPCH.REG_DT not between", value1, value2, "regDt");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("TPCH.REG_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("TPCH.REG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("TPCH.REG_ID =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("TPCH.REG_ID <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("TPCH.REG_ID >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("TPCH.REG_ID >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("TPCH.REG_ID <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("TPCH.REG_ID <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("TPCH.REG_ID like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("TPCH.REG_ID not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("TPCH.REG_ID in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("TPCH.REG_ID not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("TPCH.REG_ID between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("TPCH.REG_ID not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andModDtIsNull() {
            addCriterion("TPCH.MOD_DT is null");
            return (Criteria) this;
        }

        public Criteria andModDtIsNotNull() {
            addCriterion("TPCH.MOD_DT is not null");
            return (Criteria) this;
        }

        public Criteria andModDtEqualTo(Date value) {
            addCriterion("TPCH.MOD_DT =", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotEqualTo(Date value) {
            addCriterion("TPCH.MOD_DT <>", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThan(Date value) {
            addCriterion("TPCH.MOD_DT >", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtGreaterThanOrEqualTo(Date value) {
            addCriterion("TPCH.MOD_DT >=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThan(Date value) {
            addCriterion("TPCH.MOD_DT <", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtLessThanOrEqualTo(Date value) {
            addCriterion("TPCH.MOD_DT <=", value, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtIn(List<Date> values) {
            addCriterion("TPCH.MOD_DT in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotIn(List<Date> values) {
            addCriterion("TPCH.MOD_DT not in", values, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtBetween(Date value1, Date value2) {
            addCriterion("TPCH.MOD_DT between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModDtNotBetween(Date value1, Date value2) {
            addCriterion("TPCH.MOD_DT not between", value1, value2, "modDt");
            return (Criteria) this;
        }

        public Criteria andModIdIsNull() {
            addCriterion("TPCH.MOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andModIdIsNotNull() {
            addCriterion("TPCH.MOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModIdEqualTo(String value) {
            addCriterion("TPCH.MOD_ID =", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotEqualTo(String value) {
            addCriterion("TPCH.MOD_ID <>", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThan(String value) {
            addCriterion("TPCH.MOD_ID >", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThanOrEqualTo(String value) {
            addCriterion("TPCH.MOD_ID >=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThan(String value) {
            addCriterion("TPCH.MOD_ID <", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThanOrEqualTo(String value) {
            addCriterion("TPCH.MOD_ID <=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLike(String value) {
            addCriterion("TPCH.MOD_ID like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotLike(String value) {
            addCriterion("TPCH.MOD_ID not like", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdIn(List<String> values) {
            addCriterion("TPCH.MOD_ID in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotIn(List<String> values) {
            addCriterion("TPCH.MOD_ID not in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdBetween(String value1, String value2) {
            addCriterion("TPCH.MOD_ID between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotBetween(String value1, String value2) {
            addCriterion("TPCH.MOD_ID not between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNull() {
            addCriterion("TPCH.USE_YN is null");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNotNull() {
            addCriterion("TPCH.USE_YN is not null");
            return (Criteria) this;
        }

        public Criteria andUseYnEqualTo(String value) {
            addCriterion("TPCH.USE_YN =", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotEqualTo(String value) {
            addCriterion("TPCH.USE_YN <>", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThan(String value) {
            addCriterion("TPCH.USE_YN >", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThanOrEqualTo(String value) {
            addCriterion("TPCH.USE_YN >=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThan(String value) {
            addCriterion("TPCH.USE_YN <", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThanOrEqualTo(String value) {
            addCriterion("TPCH.USE_YN <=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLike(String value) {
            addCriterion("TPCH.USE_YN like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotLike(String value) {
            addCriterion("TPCH.USE_YN not like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnIn(List<String> values) {
            addCriterion("TPCH.USE_YN in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotIn(List<String> values) {
            addCriterion("TPCH.USE_YN not in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnBetween(String value1, String value2) {
            addCriterion("TPCH.USE_YN between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotBetween(String value1, String value2) {
            addCriterion("TPCH.USE_YN not between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andPtTpCdLikeInsensitive(String value) {
            addCriterion("upper(TPCH.PT_TP_CD) like", value.toUpperCase(), "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andSaveUnitCdLikeInsensitive(String value) {
            addCriterion("upper(TPCH.SAVE_UNIT_CD) like", value.toUpperCase(), "saveUnitCd");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeInsensitive(String value) {
            addCriterion("upper(TPCH.REG_ID) like", value.toUpperCase(), "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeInsensitive(String value) {
            addCriterion("upper(TPCH.MOD_ID) like", value.toUpperCase(), "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeInsensitive(String value) {
            addCriterion("upper(TPCH.USE_YN) like", value.toUpperCase(), "useYn");
            return (Criteria) this;
        }

        public Criteria andPtTpCdLikeLeft(String value) {
            addCriterion("TPCH.PT_TP_CD like ", "%" + value, "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andPtTpCdLikeRight(String value) {
            addCriterion("TPCH.PT_TP_CD like ", value + "%", "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andPtTpCdLikeBoth(String value) {
            addCriterion("TPCH.PT_TP_CD like ", "%" + value + "%", "ptTpCd");
            return (Criteria) this;
        }

        public Criteria andSaveUnitCdLikeLeft(String value) {
            addCriterion("TPCH.SAVE_UNIT_CD like ", "%" + value, "saveUnitCd");
            return (Criteria) this;
        }

        public Criteria andSaveUnitCdLikeRight(String value) {
            addCriterion("TPCH.SAVE_UNIT_CD like ", value + "%", "saveUnitCd");
            return (Criteria) this;
        }

        public Criteria andSaveUnitCdLikeBoth(String value) {
            addCriterion("TPCH.SAVE_UNIT_CD like ", "%" + value + "%", "saveUnitCd");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeLeft(String value) {
            addCriterion("TPCH.REG_ID like ", "%" + value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeRight(String value) {
            addCriterion("TPCH.REG_ID like ", value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLikeBoth(String value) {
            addCriterion("TPCH.REG_ID like ", "%" + value + "%", "regId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeLeft(String value) {
            addCriterion("TPCH.MOD_ID like ", "%" + value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeRight(String value) {
            addCriterion("TPCH.MOD_ID like ", value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLikeBoth(String value) {
            addCriterion("TPCH.MOD_ID like ", "%" + value + "%", "modId");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeLeft(String value) {
            addCriterion("TPCH.USE_YN like ", "%" + value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeRight(String value) {
            addCriterion("TPCH.USE_YN like ", value + "%", "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLikeBoth(String value) {
            addCriterion("TPCH.USE_YN like ", "%" + value + "%", "useYn");
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