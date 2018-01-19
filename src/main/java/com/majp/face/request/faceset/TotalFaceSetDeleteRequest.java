package com.majp.face.request.faceset;

import com.majp.face.request.BaseRequest;

/**
 * @author pc
 * @since 2018/1/19.
 */
public class TotalFaceSetDeleteRequest extends BaseRequest {
    private String faceSetToken;
    private String outerId;
    private Integer checkEmpty;


    public String getFaceset_token() {
        return faceSetToken;
    }

    public void setFaceset_token(String faceSetToken) {
        this.faceSetToken = faceSetToken;
    }

    public String getOuter_id() {
        return outerId;
    }

    public void setOuter_id(String outerId) {
        this.outerId = outerId;
    }

    public Integer getCheck_empty() {
        return checkEmpty;
    }

    public void setCheck_empty(Integer checkEmpty) {
        this.checkEmpty = checkEmpty;
    }
}
