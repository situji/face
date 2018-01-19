package com.majp.face.request.faceset;

import com.majp.face.request.BaseRequest;

/**
 * @author pc
 * @since 2018/1/19.
 */
public class TotalFaceSetRemoveFaceRequest extends BaseRequest {
    private String faceSetToken;
    private String outerId;
    private String faceToken;

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

    public String getFace_token() {
        return faceToken;
    }

    public void setFace_token(String faceToken) {
        this.faceToken = faceToken;
    }
}
