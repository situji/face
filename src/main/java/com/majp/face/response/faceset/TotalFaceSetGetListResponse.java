package com.majp.face.response.faceset;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.majp.face.model.FaceSet;
import com.majp.face.response.BaseResponse;

import java.util.List;

/**
 * @author pc
 * @since 2018/1/19.
 */
public class TotalFaceSetGetListResponse extends BaseResponse {
    private List<FaceSet> faceSets;
    private String next;

    @JsonProperty("facesets")
    public List<FaceSet> getFaceSets() {
        return faceSets;
    }

    public void setFaceSets(List<FaceSet> faceSets) {
        this.faceSets = faceSets;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }
}
