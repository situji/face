package com.majp.face.request.faceset;

import com.majp.face.request.BaseRequest;

/**
 * @author pc
 * @since 2018/1/19.
 */
public class TotalFaceSetGetListRequest extends BaseRequest {
    private String tag;
    private Integer start;

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }
}
