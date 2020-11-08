package com.chentao.aselab.topic.controller;

import com.chentao.aselab.topic.controller.request.TopicRequest;
import com.chentao.aselab.topic.entity.Topic;
import com.chentao.aselab.topic.response.ResponseObject;
import com.chentao.aselab.topic.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
public class TopicController {
    private TopicService topicService;
    private static final String API="api";
    @Autowired
    public TopicController(TopicService topicService){
        this.topicService=topicService;
    }
    @GetMapping(API+"/topic/getTopicByConferenceId")
    public ResponseEntity<ResponseObject> getTopicOfConference(@RequestParam Long conferenceId){
        Set<Topic> topicSet=topicService.getTopicByConferenceId(conferenceId);
        ResponseObject responseObject=new ResponseObject(0,"success",topicSet);
        return ResponseEntity.ok(responseObject);
    }
    @GetMapping(API+"/topic/getTopicByPaperId")
    public ResponseEntity<ResponseObject> getTopicOfPaper(@RequestParam Long paperId){
        Set<Topic> topicSet=topicService.getTopicByPaperId(paperId);
        ResponseObject responseObject=new ResponseObject(0,"success",topicSet);
        return ResponseEntity.ok(responseObject);
    }
    @GetMapping(API+"/topic/getTopicByUserAndConferenceId")
    public ResponseEntity<ResponseObject> getTopicOfUserAndConference(@RequestParam Long userAndConferenceId){
        Set<Topic> topicSet=topicService.getTopicByUserAndConferenceId(userAndConferenceId);
        ResponseObject responseObject=new ResponseObject(0,"success",topicSet);
        return ResponseEntity.ok(responseObject);
    }
    @PostMapping(API+"/topic/addTopicConference")
    public ResponseEntity<ResponseObject> addTopicConference(@RequestBody TopicRequest topicRequest){
        int errorCode=topicService.addTopicByConference(topicRequest);
        ResponseObject responseObject=new ResponseObject(errorCode,"success",null);
        return ResponseEntity.ok(responseObject);
    }
    @PostMapping(API+"/topic/addTopicPaper")
    public ResponseEntity<ResponseObject> addTopicPaper(@RequestBody TopicRequest topicRequest){
        int errorCode=topicService.addTopicByPaper(topicRequest);
        ResponseObject responseObject=new ResponseObject(errorCode,"success",null);
        return ResponseEntity.ok(responseObject);
    }
    @PostMapping(API+"/topic/addTopicUserAndConference")
    public ResponseEntity<ResponseObject> addTopicUserAndConference(@RequestBody TopicRequest topicRequest){
        int errorCode=topicService.addTopicByUserAndConference(topicRequest);
        ResponseObject responseObject=new ResponseObject(errorCode,"success",null);
        return ResponseEntity.ok(responseObject);
    }

}
