package com.chentao.aselab.topic.controller.request;

public class TopicRequest {
    private Long id;
    private Long idRelate;
    private String topic;
    private String tag;

    public Long getIdRelate() {
        return idRelate;
    }

    public void setIdRelate(Long idRelate) {
        this.idRelate = idRelate;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
