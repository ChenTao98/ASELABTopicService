package com.chentao.aselab.topic.repository;

import com.chentao.aselab.topic.entity.TopicAndPaper;
import org.springframework.data.repository.CrudRepository;

public interface TopicAndPaperRepository extends CrudRepository<TopicAndPaper,Long> {
    TopicAndPaper findTopicAndPaperById(Long Id);
}
