package com.chentao.aselab.topic.service;

import com.chentao.aselab.topic.controller.request.TopicRequest;
import com.chentao.aselab.topic.entity.Topic;
import com.chentao.aselab.topic.entity.TopicAndConference;
import com.chentao.aselab.topic.entity.TopicAndPaper;
import com.chentao.aselab.topic.entity.TopicUserAndConference;
import com.chentao.aselab.topic.repository.TopicAndConferenceRepository;
import com.chentao.aselab.topic.repository.TopicAndPaperRepository;
import com.chentao.aselab.topic.repository.TopicRepository;
import com.chentao.aselab.topic.repository.TopicUserAndConferenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class TopicService {
    private TopicRepository topicRepository;
    private TopicAndConferenceRepository topicAndConferenceRepository;
    private TopicAndPaperRepository topicAndPaperRepository;
    private TopicUserAndConferenceRepository topicUserAndConferenceRepository;
    @Autowired
    public TopicService(TopicRepository repository,TopicAndConferenceRepository topicAndConferenceRepository,
                        TopicAndPaperRepository topicAndPaperRepository,TopicUserAndConferenceRepository topicUserAndConferenceRepository){
        this.topicRepository=repository;
        this.topicAndConferenceRepository=topicAndConferenceRepository;
        this.topicAndPaperRepository=topicAndPaperRepository;
        this.topicUserAndConferenceRepository=topicUserAndConferenceRepository;
    }
    public int addTopicByConference(TopicRequest topicRequest){
        TopicAndConference topicAndConference=topicAndConferenceRepository.findTopicAndConferenceById(topicRequest.getIdRelate());
        if(topicAndConference==null){
            topicAndConference=new TopicAndConference();
            topicAndConference.setId(topicRequest.getIdRelate());
            topicAndConferenceRepository.save(topicAndConference);
        }
        topicAndConference.getnTopics().add(new Topic(topicRequest));
        topicAndConferenceRepository.save(topicAndConference);
        return 0;
    }
    public int addTopicByPaper(TopicRequest topicRequest){
        TopicAndPaper topicAndPaper=topicAndPaperRepository.findTopicAndPaperById(topicRequest.getIdRelate());
        if(topicAndPaper==null){
            topicAndPaper=new TopicAndPaper();
            topicAndPaper.setId(topicRequest.getIdRelate());
            topicAndPaperRepository.save(topicAndPaper);
        }
        topicAndPaper.getnTopics().add(new Topic(topicRequest));
        topicAndPaperRepository.save(topicAndPaper);
        return 0;
    }
    public int addTopicByUserAndConference(TopicRequest topicRequest){
        TopicUserAndConference topicUserAndConference=topicUserAndConferenceRepository.findTopicUserAndConferenceById(topicRequest.getIdRelate());
        if(topicUserAndConference==null){
            topicUserAndConference=new TopicUserAndConference();
            topicUserAndConference.setId(topicRequest.getIdRelate());
            topicUserAndConferenceRepository.save(topicUserAndConference);
        }
        topicUserAndConference.getnTopics().add(new Topic(topicRequest));
        topicUserAndConferenceRepository.save(topicUserAndConference);
        return 0;
    }
    public Set<Topic> getTopicByConferenceId(Long id){
        TopicAndConference topicAndConference=topicAndConferenceRepository.findTopicAndConferenceById(id);
        if(topicAndConference==null){
            return null;
        }
        return topicAndConference.getnTopics();
    }
    public Set<Topic> getTopicByPaperId(Long id){
        TopicAndPaper topicAndPaper=topicAndPaperRepository.findTopicAndPaperById(id);
        if(topicAndPaper==null){
            return null;
        }
        return topicAndPaper.getnTopics();
    }
    public Set<Topic> getTopicByUserAndConferenceId(Long id){
        TopicUserAndConference topicUserAndConference=topicUserAndConferenceRepository.findTopicUserAndConferenceById(id);
        if(topicUserAndConference==null){
            return null;
        }
        return topicUserAndConference.getnTopics();
    }
}
