package com.skyblue.buildforms.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.skyblue.buildforms.utils.Constants;

import java.util.List;

public class JSONFeed {

    @JsonProperty(Constants.JSON_KEY_VIEWS)
    private List<BFView> views;

    public JSONFeed() {
    }

    public JSONFeed(List<BFView> views) {
        this.views = views;
    }

    public List<BFView> getViews() {
        return views;
    }

    public void setViews(List<BFView> views) {
        this.views = views;
    }
}
