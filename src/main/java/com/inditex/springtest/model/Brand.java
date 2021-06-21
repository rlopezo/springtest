package com.inditex.springtest.model;

import com.inditex.springtest.constants.ModelConstants;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = ModelConstants.BRAND_TABLE_NAME)
public class Brand implements Serializable {

    private static final long serialVersionUID = 5378744293109810882L;

    //COLUMNS
    private static final String BRAND_ID_COLUMN_NAME = "BRAND_ID";
    private static final String NAME_COLUMN_NAME = "NAME";


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = BRAND_ID_COLUMN_NAME)
    private Long brandId;

    @Column(name = NAME_COLUMN_NAME)
    private String name;

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
