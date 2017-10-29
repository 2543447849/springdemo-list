package com.gaussic.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdminGoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminGoodsExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBrithIsNull() {
            addCriterion("brith is null");
            return (Criteria) this;
        }

        public Criteria andBrithIsNotNull() {
            addCriterion("brith is not null");
            return (Criteria) this;
        }

        public Criteria andBrithEqualTo(String value) {
            addCriterion("brith =", value, "brith");
            return (Criteria) this;
        }

        public Criteria andBrithNotEqualTo(String value) {
            addCriterion("brith <>", value, "brith");
            return (Criteria) this;
        }

        public Criteria andBrithGreaterThan(String value) {
            addCriterion("brith >", value, "brith");
            return (Criteria) this;
        }

        public Criteria andBrithGreaterThanOrEqualTo(String value) {
            addCriterion("brith >=", value, "brith");
            return (Criteria) this;
        }

        public Criteria andBrithLessThan(String value) {
            addCriterion("brith <", value, "brith");
            return (Criteria) this;
        }

        public Criteria andBrithLessThanOrEqualTo(String value) {
            addCriterion("brith <=", value, "brith");
            return (Criteria) this;
        }

        public Criteria andBrithLike(String value) {
            addCriterion("brith like", value, "brith");
            return (Criteria) this;
        }

        public Criteria andBrithNotLike(String value) {
            addCriterion("brith not like", value, "brith");
            return (Criteria) this;
        }

        public Criteria andBrithIn(List<String> values) {
            addCriterion("brith in", values, "brith");
            return (Criteria) this;
        }

        public Criteria andBrithNotIn(List<String> values) {
            addCriterion("brith not in", values, "brith");
            return (Criteria) this;
        }

        public Criteria andBrithBetween(String value1, String value2) {
            addCriterion("brith between", value1, value2, "brith");
            return (Criteria) this;
        }

        public Criteria andBrithNotBetween(String value1, String value2) {
            addCriterion("brith not between", value1, value2, "brith");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andInoculationIsNull() {
            addCriterion("inoculation is null");
            return (Criteria) this;
        }

        public Criteria andInoculationIsNotNull() {
            addCriterion("inoculation is not null");
            return (Criteria) this;
        }

        public Criteria andInoculationEqualTo(String value) {
            addCriterion("inoculation =", value, "inoculation");
            return (Criteria) this;
        }

        public Criteria andInoculationNotEqualTo(String value) {
            addCriterion("inoculation <>", value, "inoculation");
            return (Criteria) this;
        }

        public Criteria andInoculationGreaterThan(String value) {
            addCriterion("inoculation >", value, "inoculation");
            return (Criteria) this;
        }

        public Criteria andInoculationGreaterThanOrEqualTo(String value) {
            addCriterion("inoculation >=", value, "inoculation");
            return (Criteria) this;
        }

        public Criteria andInoculationLessThan(String value) {
            addCriterion("inoculation <", value, "inoculation");
            return (Criteria) this;
        }

        public Criteria andInoculationLessThanOrEqualTo(String value) {
            addCriterion("inoculation <=", value, "inoculation");
            return (Criteria) this;
        }

        public Criteria andInoculationLike(String value) {
            addCriterion("inoculation like", value, "inoculation");
            return (Criteria) this;
        }

        public Criteria andInoculationNotLike(String value) {
            addCriterion("inoculation not like", value, "inoculation");
            return (Criteria) this;
        }

        public Criteria andInoculationIn(List<String> values) {
            addCriterion("inoculation in", values, "inoculation");
            return (Criteria) this;
        }

        public Criteria andInoculationNotIn(List<String> values) {
            addCriterion("inoculation not in", values, "inoculation");
            return (Criteria) this;
        }

        public Criteria andInoculationBetween(String value1, String value2) {
            addCriterion("inoculation between", value1, value2, "inoculation");
            return (Criteria) this;
        }

        public Criteria andInoculationNotBetween(String value1, String value2) {
            addCriterion("inoculation not between", value1, value2, "inoculation");
            return (Criteria) this;
        }

        public Criteria andInsectIsNull() {
            addCriterion("insect is null");
            return (Criteria) this;
        }

        public Criteria andInsectIsNotNull() {
            addCriterion("insect is not null");
            return (Criteria) this;
        }

        public Criteria andInsectEqualTo(String value) {
            addCriterion("insect =", value, "insect");
            return (Criteria) this;
        }

        public Criteria andInsectNotEqualTo(String value) {
            addCriterion("insect <>", value, "insect");
            return (Criteria) this;
        }

        public Criteria andInsectGreaterThan(String value) {
            addCriterion("insect >", value, "insect");
            return (Criteria) this;
        }

        public Criteria andInsectGreaterThanOrEqualTo(String value) {
            addCriterion("insect >=", value, "insect");
            return (Criteria) this;
        }

        public Criteria andInsectLessThan(String value) {
            addCriterion("insect <", value, "insect");
            return (Criteria) this;
        }

        public Criteria andInsectLessThanOrEqualTo(String value) {
            addCriterion("insect <=", value, "insect");
            return (Criteria) this;
        }

        public Criteria andInsectLike(String value) {
            addCriterion("insect like", value, "insect");
            return (Criteria) this;
        }

        public Criteria andInsectNotLike(String value) {
            addCriterion("insect not like", value, "insect");
            return (Criteria) this;
        }

        public Criteria andInsectIn(List<String> values) {
            addCriterion("insect in", values, "insect");
            return (Criteria) this;
        }

        public Criteria andInsectNotIn(List<String> values) {
            addCriterion("insect not in", values, "insect");
            return (Criteria) this;
        }

        public Criteria andInsectBetween(String value1, String value2) {
            addCriterion("insect between", value1, value2, "insect");
            return (Criteria) this;
        }

        public Criteria andInsectNotBetween(String value1, String value2) {
            addCriterion("insect not between", value1, value2, "insect");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andRabiesIsNull() {
            addCriterion("rabies is null");
            return (Criteria) this;
        }

        public Criteria andRabiesIsNotNull() {
            addCriterion("rabies is not null");
            return (Criteria) this;
        }

        public Criteria andRabiesEqualTo(String value) {
            addCriterion("rabies =", value, "rabies");
            return (Criteria) this;
        }

        public Criteria andRabiesNotEqualTo(String value) {
            addCriterion("rabies <>", value, "rabies");
            return (Criteria) this;
        }

        public Criteria andRabiesGreaterThan(String value) {
            addCriterion("rabies >", value, "rabies");
            return (Criteria) this;
        }

        public Criteria andRabiesGreaterThanOrEqualTo(String value) {
            addCriterion("rabies >=", value, "rabies");
            return (Criteria) this;
        }

        public Criteria andRabiesLessThan(String value) {
            addCriterion("rabies <", value, "rabies");
            return (Criteria) this;
        }

        public Criteria andRabiesLessThanOrEqualTo(String value) {
            addCriterion("rabies <=", value, "rabies");
            return (Criteria) this;
        }

        public Criteria andRabiesLike(String value) {
            addCriterion("rabies like", value, "rabies");
            return (Criteria) this;
        }

        public Criteria andRabiesNotLike(String value) {
            addCriterion("rabies not like", value, "rabies");
            return (Criteria) this;
        }

        public Criteria andRabiesIn(List<String> values) {
            addCriterion("rabies in", values, "rabies");
            return (Criteria) this;
        }

        public Criteria andRabiesNotIn(List<String> values) {
            addCriterion("rabies not in", values, "rabies");
            return (Criteria) this;
        }

        public Criteria andRabiesBetween(String value1, String value2) {
            addCriterion("rabies between", value1, value2, "rabies");
            return (Criteria) this;
        }

        public Criteria andRabiesNotBetween(String value1, String value2) {
            addCriterion("rabies not between", value1, value2, "rabies");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andSpeciIdIsNull() {
            addCriterion("speci_id is null");
            return (Criteria) this;
        }

        public Criteria andSpeciIdIsNotNull() {
            addCriterion("speci_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpeciIdEqualTo(Integer value) {
            addCriterion("speci_id =", value, "speciId");
            return (Criteria) this;
        }

        public Criteria andSpeciIdNotEqualTo(Integer value) {
            addCriterion("speci_id <>", value, "speciId");
            return (Criteria) this;
        }

        public Criteria andSpeciIdGreaterThan(Integer value) {
            addCriterion("speci_id >", value, "speciId");
            return (Criteria) this;
        }

        public Criteria andSpeciIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("speci_id >=", value, "speciId");
            return (Criteria) this;
        }

        public Criteria andSpeciIdLessThan(Integer value) {
            addCriterion("speci_id <", value, "speciId");
            return (Criteria) this;
        }

        public Criteria andSpeciIdLessThanOrEqualTo(Integer value) {
            addCriterion("speci_id <=", value, "speciId");
            return (Criteria) this;
        }

        public Criteria andSpeciIdIn(List<Integer> values) {
            addCriterion("speci_id in", values, "speciId");
            return (Criteria) this;
        }

        public Criteria andSpeciIdNotIn(List<Integer> values) {
            addCriterion("speci_id not in", values, "speciId");
            return (Criteria) this;
        }

        public Criteria andSpeciIdBetween(Integer value1, Integer value2) {
            addCriterion("speci_id between", value1, value2, "speciId");
            return (Criteria) this;
        }

        public Criteria andSpeciIdNotBetween(Integer value1, Integer value2) {
            addCriterion("speci_id not between", value1, value2, "speciId");
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