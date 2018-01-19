package com.majp.face.request.faceset;

import com.majp.face.request.BaseRequest;

/**
 * @author pc
 * @since 2018/1/19.
 */
public class TotalFaceSetCreateRequest extends BaseRequest{
    private String name;
    private String outerId;
    private String tag;
    private String userData;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOuter_id() {
        return outerId;
    }

    public void setOuter_id(String outerId) {
        this.outerId = outerId;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getUser_data() {
        return userData;
    }

    public void setUser_data(String userData) {
        this.userData = userData;
    }
}
