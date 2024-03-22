package com.skyblue.buildforms.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class BFDatePicker extends BFView {
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @JsonIgnore
    private String date;
}
