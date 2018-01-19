package com.majp.face.response.faceset;

import com.majp.face.response.BaseResponse;

/**
 * @author pc
 * @since 2018/1/19.
 */
public class TotalFaceSetCreateResponse extends BaseResponse {
    private String faceSetToken;
    private String outerId;

    public String getFaceSetToken() {
        return faceSetToken;
    }

    public void setFaceSetToken(String faceSetToken) {
        this.faceSetToken = faceSetToken;
    }

    public String getOuterId() {
        return outerId;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }
}
