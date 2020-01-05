package cn.kgc.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class WoodExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WoodExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterionForJDBCDate("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterionForJDBCDate("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterionForJDBCDate("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andProductidIsNull() {
            addCriterion("productid is null");
            return (Criteria) this;
        }

        public Criteria andProductidIsNotNull() {
            addCriterion("productid is not null");
            return (Criteria) this;
        }

        public Criteria andProductidEqualTo(Integer value) {
            addCriterion("productid =", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotEqualTo(Integer value) {
            addCriterion("productid <>", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThan(Integer value) {
            addCriterion("productid >", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThanOrEqualTo(Integer value) {
            addCriterion("productid >=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThan(Integer value) {
            addCriterion("productid <", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThanOrEqualTo(Integer value) {
            addCriterion("productid <=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidIn(List<Integer> values) {
            addCriterion("productid in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotIn(List<Integer> values) {
            addCriterion("productid not in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidBetween(Integer value1, Integer value2) {
            addCriterion("productid between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotBetween(Integer value1, Integer value2) {
            addCriterion("productid not between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Integer value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Integer value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Integer value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Integer value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Integer> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Integer> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Integer value1, Integer value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andUnitpriceIsNull() {
            addCriterion("unitprice is null");
            return (Criteria) this;
        }

        public Criteria andUnitpriceIsNotNull() {
            addCriterion("unitprice is not null");
            return (Criteria) this;
        }

        public Criteria andUnitpriceEqualTo(Double value) {
            addCriterion("unitprice =", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceNotEqualTo(Double value) {
            addCriterion("unitprice <>", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceGreaterThan(Double value) {
            addCriterion("unitprice >", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("unitprice >=", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceLessThan(Double value) {
            addCriterion("unitprice <", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceLessThanOrEqualTo(Double value) {
            addCriterion("unitprice <=", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceIn(List<Double> values) {
            addCriterion("unitprice in", values, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceNotIn(List<Double> values) {
            addCriterion("unitprice not in", values, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceBetween(Double value1, Double value2) {
            addCriterion("unitprice between", value1, value2, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceNotBetween(Double value1, Double value2) {
            addCriterion("unitprice not between", value1, value2, "unitprice");
            return (Criteria) this;
        }

        public Criteria andTotalpricesIsNull() {
            addCriterion("totalprices is null");
            return (Criteria) this;
        }

        public Criteria andTotalpricesIsNotNull() {
            addCriterion("totalprices is not null");
            return (Criteria) this;
        }

        public Criteria andTotalpricesEqualTo(Double value) {
            addCriterion("totalprices =", value, "totalprices");
            return (Criteria) this;
        }

        public Criteria andTotalpricesNotEqualTo(Double value) {
            addCriterion("totalprices <>", value, "totalprices");
            return (Criteria) this;
        }

        public Criteria andTotalpricesGreaterThan(Double value) {
            addCriterion("totalprices >", value, "totalprices");
            return (Criteria) this;
        }

        public Criteria andTotalpricesGreaterThanOrEqualTo(Double value) {
            addCriterion("totalprices >=", value, "totalprices");
            return (Criteria) this;
        }

        public Criteria andTotalpricesLessThan(Double value) {
            addCriterion("totalprices <", value, "totalprices");
            return (Criteria) this;
        }

        public Criteria andTotalpricesLessThanOrEqualTo(Double value) {
            addCriterion("totalprices <=", value, "totalprices");
            return (Criteria) this;
        }

        public Criteria andTotalpricesIn(List<Double> values) {
            addCriterion("totalprices in", values, "totalprices");
            return (Criteria) this;
        }

        public Criteria andTotalpricesNotIn(List<Double> values) {
            addCriterion("totalprices not in", values, "totalprices");
            return (Criteria) this;
        }

        public Criteria andTotalpricesBetween(Double value1, Double value2) {
            addCriterion("totalprices between", value1, value2, "totalprices");
            return (Criteria) this;
        }

        public Criteria andTotalpricesNotBetween(Double value1, Double value2) {
            addCriterion("totalprices not between", value1, value2, "totalprices");
            return (Criteria) this;
        }

        public Criteria andPurchaserIsNull() {
            addCriterion("purchaser is null");
            return (Criteria) this;
        }

        public Criteria andPurchaserIsNotNull() {
            addCriterion("purchaser is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaserEqualTo(String value) {
            addCriterion("purchaser =", value, "purchaser");
            return (Criteria) this;
        }

        public Criteria andPurchaserNotEqualTo(String value) {
            addCriterion("purchaser <>", value, "purchaser");
            return (Criteria) this;
        }

        public Criteria andPurchaserGreaterThan(String value) {
            addCriterion("purchaser >", value, "purchaser");
            return (Criteria) this;
        }

        public Criteria andPurchaserGreaterThanOrEqualTo(String value) {
            addCriterion("purchaser >=", value, "purchaser");
            return (Criteria) this;
        }

        public Criteria andPurchaserLessThan(String value) {
            addCriterion("purchaser <", value, "purchaser");
            return (Criteria) this;
        }

        public Criteria andPurchaserLessThanOrEqualTo(String value) {
            addCriterion("purchaser <=", value, "purchaser");
            return (Criteria) this;
        }

        public Criteria andPurchaserLike(String value) {
            addCriterion("purchaser like", value, "purchaser");
            return (Criteria) this;
        }

        public Criteria andPurchaserNotLike(String value) {
            addCriterion("purchaser not like", value, "purchaser");
            return (Criteria) this;
        }

        public Criteria andPurchaserIn(List<String> values) {
            addCriterion("purchaser in", values, "purchaser");
            return (Criteria) this;
        }

        public Criteria andPurchaserNotIn(List<String> values) {
            addCriterion("purchaser not in", values, "purchaser");
            return (Criteria) this;
        }

        public Criteria andPurchaserBetween(String value1, String value2) {
            addCriterion("purchaser between", value1, value2, "purchaser");
            return (Criteria) this;
        }

        public Criteria andPurchaserNotBetween(String value1, String value2) {
            addCriterion("purchaser not between", value1, value2, "purchaser");
            return (Criteria) this;
        }

        public Criteria andCellphoneIsNull() {
            addCriterion("cellphone is null");
            return (Criteria) this;
        }

        public Criteria andCellphoneIsNotNull() {
            addCriterion("cellphone is not null");
            return (Criteria) this;
        }

        public Criteria andCellphoneEqualTo(String value) {
            addCriterion("cellphone =", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneNotEqualTo(String value) {
            addCriterion("cellphone <>", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneGreaterThan(String value) {
            addCriterion("cellphone >", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneGreaterThanOrEqualTo(String value) {
            addCriterion("cellphone >=", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneLessThan(String value) {
            addCriterion("cellphone <", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneLessThanOrEqualTo(String value) {
            addCriterion("cellphone <=", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneLike(String value) {
            addCriterion("cellphone like", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneNotLike(String value) {
            addCriterion("cellphone not like", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneIn(List<String> values) {
            addCriterion("cellphone in", values, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneNotIn(List<String> values) {
            addCriterion("cellphone not in", values, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneBetween(String value1, String value2) {
            addCriterion("cellphone between", value1, value2, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneNotBetween(String value1, String value2) {
            addCriterion("cellphone not between", value1, value2, "cellphone");
            return (Criteria) this;
        }

        public Criteria andEngineeringunitIsNull() {
            addCriterion("engineeringunit is null");
            return (Criteria) this;
        }

        public Criteria andEngineeringunitIsNotNull() {
            addCriterion("engineeringunit is not null");
            return (Criteria) this;
        }

        public Criteria andEngineeringunitEqualTo(String value) {
            addCriterion("engineeringunit =", value, "engineeringunit");
            return (Criteria) this;
        }

        public Criteria andEngineeringunitNotEqualTo(String value) {
            addCriterion("engineeringunit <>", value, "engineeringunit");
            return (Criteria) this;
        }

        public Criteria andEngineeringunitGreaterThan(String value) {
            addCriterion("engineeringunit >", value, "engineeringunit");
            return (Criteria) this;
        }

        public Criteria andEngineeringunitGreaterThanOrEqualTo(String value) {
            addCriterion("engineeringunit >=", value, "engineeringunit");
            return (Criteria) this;
        }

        public Criteria andEngineeringunitLessThan(String value) {
            addCriterion("engineeringunit <", value, "engineeringunit");
            return (Criteria) this;
        }

        public Criteria andEngineeringunitLessThanOrEqualTo(String value) {
            addCriterion("engineeringunit <=", value, "engineeringunit");
            return (Criteria) this;
        }

        public Criteria andEngineeringunitLike(String value) {
            addCriterion("engineeringunit like", value, "engineeringunit");
            return (Criteria) this;
        }

        public Criteria andEngineeringunitNotLike(String value) {
            addCriterion("engineeringunit not like", value, "engineeringunit");
            return (Criteria) this;
        }

        public Criteria andEngineeringunitIn(List<String> values) {
            addCriterion("engineeringunit in", values, "engineeringunit");
            return (Criteria) this;
        }

        public Criteria andEngineeringunitNotIn(List<String> values) {
            addCriterion("engineeringunit not in", values, "engineeringunit");
            return (Criteria) this;
        }

        public Criteria andEngineeringunitBetween(String value1, String value2) {
            addCriterion("engineeringunit between", value1, value2, "engineeringunit");
            return (Criteria) this;
        }

        public Criteria andEngineeringunitNotBetween(String value1, String value2) {
            addCriterion("engineeringunit not between", value1, value2, "engineeringunit");
            return (Criteria) this;
        }

        public Criteria andDeliveryaddressIsNull() {
            addCriterion("deliveryaddress is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryaddressIsNotNull() {
            addCriterion("deliveryaddress is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryaddressEqualTo(String value) {
            addCriterion("deliveryaddress =", value, "deliveryaddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryaddressNotEqualTo(String value) {
            addCriterion("deliveryaddress <>", value, "deliveryaddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryaddressGreaterThan(String value) {
            addCriterion("deliveryaddress >", value, "deliveryaddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryaddressGreaterThanOrEqualTo(String value) {
            addCriterion("deliveryaddress >=", value, "deliveryaddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryaddressLessThan(String value) {
            addCriterion("deliveryaddress <", value, "deliveryaddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryaddressLessThanOrEqualTo(String value) {
            addCriterion("deliveryaddress <=", value, "deliveryaddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryaddressLike(String value) {
            addCriterion("deliveryaddress like", value, "deliveryaddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryaddressNotLike(String value) {
            addCriterion("deliveryaddress not like", value, "deliveryaddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryaddressIn(List<String> values) {
            addCriterion("deliveryaddress in", values, "deliveryaddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryaddressNotIn(List<String> values) {
            addCriterion("deliveryaddress not in", values, "deliveryaddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryaddressBetween(String value1, String value2) {
            addCriterion("deliveryaddress between", value1, value2, "deliveryaddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryaddressNotBetween(String value1, String value2) {
            addCriterion("deliveryaddress not between", value1, value2, "deliveryaddress");
            return (Criteria) this;
        }

        public Criteria andSellerIsNull() {
            addCriterion("seller is null");
            return (Criteria) this;
        }

        public Criteria andSellerIsNotNull() {
            addCriterion("seller is not null");
            return (Criteria) this;
        }

        public Criteria andSellerEqualTo(Integer value) {
            addCriterion("seller =", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerNotEqualTo(Integer value) {
            addCriterion("seller <>", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerGreaterThan(Integer value) {
            addCriterion("seller >", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerGreaterThanOrEqualTo(Integer value) {
            addCriterion("seller >=", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerLessThan(Integer value) {
            addCriterion("seller <", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerLessThanOrEqualTo(Integer value) {
            addCriterion("seller <=", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerIn(List<Integer> values) {
            addCriterion("seller in", values, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerNotIn(List<Integer> values) {
            addCriterion("seller not in", values, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerBetween(Integer value1, Integer value2) {
            addCriterion("seller between", value1, value2, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerNotBetween(Integer value1, Integer value2) {
            addCriterion("seller not between", value1, value2, "seller");
            return (Criteria) this;
        }

        public Criteria andTradingstatusIsNull() {
            addCriterion("tradingstatus is null");
            return (Criteria) this;
        }

        public Criteria andTradingstatusIsNotNull() {
            addCriterion("tradingstatus is not null");
            return (Criteria) this;
        }

        public Criteria andTradingstatusEqualTo(Integer value) {
            addCriterion("tradingstatus =", value, "tradingstatus");
            return (Criteria) this;
        }

        public Criteria andTradingstatusNotEqualTo(Integer value) {
            addCriterion("tradingstatus <>", value, "tradingstatus");
            return (Criteria) this;
        }

        public Criteria andTradingstatusGreaterThan(Integer value) {
            addCriterion("tradingstatus >", value, "tradingstatus");
            return (Criteria) this;
        }

        public Criteria andTradingstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("tradingstatus >=", value, "tradingstatus");
            return (Criteria) this;
        }

        public Criteria andTradingstatusLessThan(Integer value) {
            addCriterion("tradingstatus <", value, "tradingstatus");
            return (Criteria) this;
        }

        public Criteria andTradingstatusLessThanOrEqualTo(Integer value) {
            addCriterion("tradingstatus <=", value, "tradingstatus");
            return (Criteria) this;
        }

        public Criteria andTradingstatusIn(List<Integer> values) {
            addCriterion("tradingstatus in", values, "tradingstatus");
            return (Criteria) this;
        }

        public Criteria andTradingstatusNotIn(List<Integer> values) {
            addCriterion("tradingstatus not in", values, "tradingstatus");
            return (Criteria) this;
        }

        public Criteria andTradingstatusBetween(Integer value1, Integer value2) {
            addCriterion("tradingstatus between", value1, value2, "tradingstatus");
            return (Criteria) this;
        }

        public Criteria andTradingstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("tradingstatus not between", value1, value2, "tradingstatus");
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