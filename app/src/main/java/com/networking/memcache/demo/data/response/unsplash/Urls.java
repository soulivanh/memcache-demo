package com.networking.memcache.demo.data.response.unsplash;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Urls {

    @JsonProperty("small")
    private String small;

    @JsonProperty("thumb")
    private String thumb;

    @JsonProperty("raw")
    private String raw;

    @JsonProperty("regular")
    private String regular;

    @JsonProperty("full")
    private String full;

    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String getRaw() {
        return raw;
    }

    public void setRaw(String raw) {
        this.raw = raw;
    }

    public String getRegular() {
        return regular;
    }

    public void setRegular(String regular) {
        this.regular = regular;
    }

    public String getFull() {
        return full;
    }

    public void setFull(String full) {
        this.full = full;
    }
}