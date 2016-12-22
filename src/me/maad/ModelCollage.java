package me.maad;

import java.io.Serializable;

/**
 * Created by Manan Sharma on 22-12-2016 for GoKrazee Innovations Private Limited.
 */
public class ModelCollage implements Serializable {
    private String collageName,collageId,collageCity;

    public String getCollageName() {
        return collageName;
    }

    public void setCollageName(String collageName) {
        this.collageName = collageName;
    }

    public String getCollageId() {
        return collageId;
    }

    public void setCollageId(String collageId) {
        this.collageId = collageId;
    }

    public String getCollageCity() {
        return collageCity;
    }

    public void setCollageCity(String collageCity) {
        this.collageCity = collageCity;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
