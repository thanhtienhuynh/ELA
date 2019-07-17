package com.example.demo.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "TestDetail", schema = "dbo", catalog = "ELA")
public class TestDetailEntity {
    private int id;
    private int questionId;
    private int testId;
    private String editedTime;
    private Integer editorId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "questionId")
    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    @Basic
    @Column(name = "testId")
    public int getTestId() {
        return testId;
    }

    public void setTestId(int testId) {
        this.testId = testId;
    }

    @Basic
    @Column(name = "editedTime")
    public String getEditedTime() {
        return editedTime;
    }

    public void setEditedTime(String editedTime) {
        this.editedTime = editedTime;
    }

    @Basic
    @Column(name = "editorId")
    public Integer getEditorId() {
        return editorId;
    }

    public void setEditorId(Integer editorId) {
        this.editorId = editorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestDetailEntity that = (TestDetailEntity) o;
        return id == that.id &&
                questionId == that.questionId &&
                testId == that.testId &&
                Objects.equals(editedTime, that.editedTime) &&
                Objects.equals(editorId, that.editorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, questionId, testId, editedTime, editorId);
    }
}
