package com.inditex.springtest.model;

import com.inditex.springtest.constants.ModelConstants;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = ModelConstants.PRICE_TABLE_NAME)
public class Price implements Serializable {
    private static final long serialVersionUID = 8259332192083379244L;

    //COLUMNS
    private static final String PRICE_ID_COLUMN_NAME = "PRICE_ID";
    private static final String BRAND_ID_COLUMN_NAME = "BRAND_ID";
    private static final String START_DATE_COLUMN_NAME = "START_DATE";
    private static final String END_DATE_COLUMN_NAME = "END_DATE";
    private static final String PRICE_LIST_COLUMN_NAME = "PRICE_LIST";
    private static final String PRODUCT_ID_COLUMN_NAME = "PRODUCT_ID";
    private static final String PRIORITY_COLUMN_NAME = "PRIORITY";
    private static final String PRICE_COLUMN_NAME = "PRICE";
    private static final String CURR_COLUMN_NAME = "CURR";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = PRICE_ID_COLUMN_NAME)
    private Long priceId;

    @ManyToOne
    @JoinColumn(name = BRAND_ID_COLUMN_NAME)
    private Brand brand;

    @Column(name = START_DATE_COLUMN_NAME)
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;

    @Column(name = END_DATE_COLUMN_NAME)
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;

    @Column(name = PRICE_LIST_COLUMN_NAME)
    private Integer priceList;

    @Column(name = PRODUCT_ID_COLUMN_NAME)
    private Integer productId;

    @Column(name = PRIORITY_COLUMN_NAME)
    private Integer priority;

    @Column(name = PRICE_COLUMN_NAME)
    private BigDecimal price;

    @Column(name= CURR_COLUMN_NAME)
    private String curr;

    public Long getPriceId() {
        return priceId;
    }

    public void setPriceId(Long priceId) {
        this.priceId = priceId;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getPriceList() {
        return priceList;
    }

    public void setPriceList(Integer priceList) {
        this.priceList = priceList;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCurr() {
        return curr;
    }

    public void setCurr(String curr) {
        this.curr = curr;
    }
}
