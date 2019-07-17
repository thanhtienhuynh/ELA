package com.example.demo.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "NewsDetail", schema = "dbo", catalog = "ELA")
public class NewsDetailEntity {
    private int id;
    private int newsId;
    private int creatorId;
    private Integer editorId;
    private String editedTime;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "newsId")
    public int getNewsId() {
        return newsId;
    }

    public void setNewsId(int newsId) {
        this.newsId = newsId;
    }

    @Basic
    @Column(name = "creatorId")
    public int getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(int creatorId) {
        this.creatorId = creatorId;
    }

    @Basic
    @Column(name = "editorId")
    public Integer getEditorId() {
        return editorId;
    }

    public void setEditorId(Integer editorId) {
        this.editorId = editorId;
    }

    @Basic
    @Column(name = "editedTime")
    public String getEditedTime() {
        return editedTime;
    }

    public void setEditedTime(String editedTime) {
        this.editedTime = editedTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewsDetailEntity that = (NewsDetailEntity) o;
        return id == that.id &&
                newsId == that.newsId &&
                creatorId == that.creatorId &&
                Objects.equals(editorId, that.editorId) &&
                Objects.equals(editedTime, that.editedTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, newsId, creatorId, editorId, editedTime);
    }
}
