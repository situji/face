package com.majp.face.controller;

import com.majp.face.FaceClient;
import com.majp.face.request.faceset.*;
import com.majp.face.response.faceset.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pc
 * @since 2018/1/17.
 */
@RestController
@RequestMapping("faceSet")
public class FaceSetController {

    @Autowired
    private FaceClient faceClient;

    @RequestMapping("create")
    public TotalFaceSetCreateResponse create(TotalFaceSetCreateRequest request) {
        TotalFaceSetCreateResponse response = new TotalFaceSetCreateResponse();
        switch (request.getType()) {
            case 0:
                FaceSetCreateRequest facePlusRequest = new FaceSetCreateRequest();
                facePlusRequest.setTags(request.getTag());
                facePlusRequest.setDisplayName(request.getName());
                facePlusRequest.setUserData(request.getUser_data());
                facePlusRequest.setOuterId(request.getOuter_id());

                FaceSetCreateResponse facePlusResponse = faceClient.execute(facePlusRequest);

                response.setFaceSetToken(facePlusResponse.getFaceSetToken());
                response.setOuterId(facePlusResponse.getOuterId());
                response.setType(request.getType());
                response.setErrorMsg(facePlusResponse.getErrorMessage());
                break;
            default:
                response.setErrorMsg("not support this type");
        }
        return response;
    }

    @RequestMapping("addFace")
    public TotalFaceSetAddFaceResponse addFace(TotalFaceSetAddFaceRequest request) {
        TotalFaceSetAddFaceResponse response = new TotalFaceSetAddFaceResponse();
        switch (request.getType()) {
            case 0:
                FaceSetAddFaceRequest facePlusRequest = new FaceSetAddFaceRequest();
                facePlusRequest.setFaceSetToken(request.getFaceset_token());
                facePlusRequest.setOuterId(request.getOuter_id());
                facePlusRequest.setFaceTokens(request.getFace_token());

                FaceSetAddFaceResponse facePlusResponse = faceClient.execute(facePlusRequest);

                response.setFaceAdd(facePlusResponse.getFaceAdded());
                response.setFaceCount(facePlusResponse.getFaceCount());
                response.setFailureDetail(facePlusResponse.getFailureDetail());
                response.setOuterId(facePlusResponse.getOuterId());
                response.setErrorMsg(facePlusResponse.getErrorMessage());
                response.setType(request.getType());
                break;
            default:
                response.setErrorMsg("not support this type");
        }
        return response;
    }

    @RequestMapping("removeFace")
    private TotalFaceSetRemoveFaceResponse removeFace(TotalFaceSetRemoveFaceRequest request) {
        TotalFaceSetRemoveFaceResponse response = new TotalFaceSetRemoveFaceResponse();
        switch (request.getType()) {
            case 0:
                FaceSetRemoveFaceRequest facePlusRequest = new FaceSetRemoveFaceRequest();
                facePlusRequest.setFaceSetToken(request.getFaceset_token());
                facePlusRequest.setOuterId(request.getOuter_id());
                facePlusRequest.setFaceTokens(request.getFace_token());

                FaceSetRemoveFaceResponse facePlusResponse = faceClient.execute(facePlusRequest);

                response.setFaceCount(facePlusResponse.getFaceCount());
                response.setFaceSetToken(facePlusResponse.getFaceSetToken());
                response.setFailureDetail(facePlusResponse.getFailureDetail());
                response.setOuterId(facePlusResponse.getOuterId());
                response.setErrorMsg(facePlusResponse.getErrorMessage());
                response.setType(request.getType());
                break;
            default:
                response.setErrorMsg("not support this type");
        }
        return response;
    }

    @RequestMapping("delete")
    public TotalFaceSetDeleteResponse delete(TotalFaceSetDeleteRequest request){
        TotalFaceSetDeleteResponse response = new TotalFaceSetDeleteResponse();
        switch (request.getType()) {
            case 0:
                FaceSetDeleteRequest facePlusRequest = new FaceSetDeleteRequest();
                facePlusRequest.setCheckEmpty(request.getCheck_empty());
                facePlusRequest.setFaceSetToken(request.getFaceset_token());
                facePlusRequest.setOuterId(request.getOuter_id());

                FaceSetDeleteResponse facePlusResponse = faceClient.execute(facePlusRequest);

                response.setFaceSetToken(facePlusResponse.getFaceSetToken());
                response.setOuterId(facePlusResponse.getOuterId());
                response.setErrorMsg(facePlusResponse.getErrorMessage());
                response.setType(request.getType());
                break;
            default:
                response.setErrorMsg("not support this type");
        }
        return response;
    }

    @RequestMapping("list")
    public TotalFaceSetGetListResponse list(TotalFaceSetGetListRequest request){
        TotalFaceSetGetListResponse response = new TotalFaceSetGetListResponse();
        switch (request.getType()) {
            case 0:
                FaceSetGetFaceSetsRequest facePlusRequest = new FaceSetGetFaceSetsRequest();
                facePlusRequest.setStart(request.getStart());
                facePlusRequest.setTags(request.getTag());
    }
}
