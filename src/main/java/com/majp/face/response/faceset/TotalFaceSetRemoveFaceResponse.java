package com.majp.face.response.faceset;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.majp.face.model.FailureDetail;
import com.majp.face.response.BaseResponse;

import java.util.List;

/**
 * @author pc
 * @since 2018/1/19.
 */
public class TotalFaceSetRemoveFaceResponse extends BaseResponse {
    private String faceSetToken;
    private String outerId;
    private Integer faceCount;
    private List<FailureDetail> failureDetail;

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

    public Integer getFaceCount() {
        return faceCount;
    }

    @JsonProperty("face_count")
    public void setFaceCount(Integer faceCount) {
        this.faceCount = faceCount;
    }

    @JsonProperty("failure_detail")
    public List<FailureDetail> getFailureDetail() {
        return failureDetail;
    }

    public void setFailureDetail(List<FailureDetail> failureDetail) {
        this.failureDetail = failureDetail;
    }
}
