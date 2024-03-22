package com.skyblue.buildforms.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.skyblue.buildforms.utils.Constants;

import java.util.List;

public class BFCheckboxGroup extends BFView {
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public List<Boolean> getChecked() {
        return checked;
    }

    public void setChecked(List<Boolean> checked) {
        this.checked = checked;
    }

    @JsonProperty(Constants.JSON_KEY_DESCRIPTION)
    private String description;

    @JsonProperty(Constants.JSON_KEY_OPTIONS)
    private List<String> options;

    @JsonIgnore
    private List<Boolean> checked;
}
