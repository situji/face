package com.majp.face.response.faceset;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.majp.face.response.BaseResponse;

/**
 * @author pc
 * @since 2018/1/19.
 */
public class TotalFaceSetDeleteResponse extends BaseResponse {
    private String faceSetToken;
    private String outerId;

    @JsonProperty("faceset_token")
    public String getFaceSetToken() {
        return faceSetToken;
    }

    public void setFaceSetToken(String faceSetToken) {
        this.faceSetToken = faceSetToken;
    }

    @JsonProperty("outer_id")
    public String getOuterId() {
        return outerId;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }
}
