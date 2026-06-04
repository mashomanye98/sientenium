package com.sientenium.demo.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Asset {

    private Long assetId;
    private String title;
    private String category;
    private String serialNumber;
    private LocalDate acquisitionDate;
    private BigDecimal cost;
    private String location;
    private String condition;
    private String photoPath;

    public Asset() {
    }

    public Asset(Long assetId, String title, String category, String serialNumber, LocalDate acquisitionDate, BigDecimal cost, String location, String condition, String photoPath) {
        this.assetId = assetId;
        this.title = title;
        this.category = category;
        this.serialNumber = serialNumber;
        this.acquisitionDate = acquisitionDate;
        this.cost = cost;
        this.location = location;
        this.condition = condition;
        this.photoPath = photoPath;
    }

    public Long getAssetId() {
        return assetId;
    }

    public void setAssetId(Long assetId) {
        this.assetId = assetId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public LocalDate getAcquisitionDate() {
        return acquisitionDate;
    }

    public void setAcquisitionDate(LocalDate acquisitionDate) {
        this.acquisitionDate = acquisitionDate;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }
}
