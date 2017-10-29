package com.gaussic.model;

import java.util.Date;

public class AdminGoods {
    private Integer id;

    private String brith;

    private Date createTime;

    private String inoculation;

    private String insect;

    private Date modifyTime;

    private String name;

    private Integer number;

    private String rabies;

    private String source;

    private String type;

    private Integer speciId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrith() {
        return brith;
    }

    public void setBrith(String brith) {
        this.brith = brith == null ? null : brith.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getInoculation() {
        return inoculation;
    }

    public void setInoculation(String inoculation) {
        this.inoculation = inoculation == null ? null : inoculation.trim();
    }

    public String getInsect() {
        return insect;
    }

    public void setInsect(String insect) {
        this.insect = insect == null ? null : insect.trim();
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getRabies() {
        return rabies;
    }

    public void setRabies(String rabies) {
        this.rabies = rabies == null ? null : rabies.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getSpeciId() {
        return speciId;
    }

    public void setSpeciId(Integer speciId) {
        this.speciId = speciId;
    }
}