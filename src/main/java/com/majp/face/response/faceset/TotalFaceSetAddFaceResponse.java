package com.majp.face.response.faceset;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.majp.face.model.FailureDetail;
import com.majp.face.response.BaseResponse;

import java.util.List;

/**
 * @author pc
 * @since 2018/1/19.
 */
public class TotalFaceSetAddFaceResponse extends BaseResponse {
    private String outerId;
    private Integer faceAdd;
    private Integer faceCount;
    private List<FailureDetail> failureDetail;

    @JsonProperty("outer_id")
    public String getOuterId() {
        return outerId;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }

    @JsonProperty("face_add")
    public Integer getFaceAdd() {
        return faceAdd;
    }

    public void setFaceAdd(Integer faceAdd) {
        this.faceAdd = faceAdd;
    }

    @JsonProperty("face_count")
    public Integer getFaceCount() {
        return faceCount;
    }

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
