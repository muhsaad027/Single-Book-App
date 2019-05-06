package com.example.saadiqbal.ghalibbookindividual;

/**
 * Created by Saad Iqbal on 2/22/2018.
 */

public class Item {
    String index;
    String fileName;
    Boolean type;
    public Item(String index, String fileName, Boolean type) {
        this.index = index;
        this.fileName = fileName;
        this.type = type;
    }

    public String getIndex() {
        return index;
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
