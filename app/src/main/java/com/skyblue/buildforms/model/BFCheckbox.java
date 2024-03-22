package com.skyblue.buildforms.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.skyblue.buildforms.utils.Constants;

public class BFCheckbox extends BFView {
    @JsonProperty(Constants.JSON_KEY_DESCRIPTION)
    private String description;

    @JsonIgnore
    private boolean checked;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }
}
