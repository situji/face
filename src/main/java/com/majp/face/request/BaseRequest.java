package com.majp.face.request;

/**
 * @author pc
 * @since 2018/1/19.
 */
public abstract class BaseRequest {
    private Integer type;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
