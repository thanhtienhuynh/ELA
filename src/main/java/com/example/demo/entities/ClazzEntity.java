package com.example.demo.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Class", schema = "dbo", catalog = "ELA")
public class ClazzEntity {
    private int id;
    private String name;
    private String startedTime;
    private String finishedTime;
    private Integer minStudent;
    private Integer maxStudent;
    private int totalStudent;
    private int courseId;
    private int slotId;
    private int totalSlot;
    private int creatorId;
    private String status;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "startedTime")
    public String getStartedTime() {
        return startedTime;
    }

    public void setStartedTime(String startedTime) {
        this.startedTime = startedTime;
    }

    @Basic
    @Column(name = "finishedTime")
    public String getFinishedTime() {
        return finishedTime;
    }

    public void setFinishedTime(String finishedTime) {
        this.finishedTime = finishedTime;
    }

    @Basic
    @Column(name = "minStudent")
    public Integer getMinStudent() {
        return minStudent;
    }

    public void setMinStudent(Integer minStudent) {
        this.minStudent = minStudent;
    }

    @Basic
    @Column(name = "maxStudent")
    public Integer getMaxStudent() {
        return maxStudent;
    }

    public void setMaxStudent(Integer maxStudent) {
        this.maxStudent = maxStudent;
    }

    @Basic
    @Column(name = "totalStudent")
    public int getTotalStudent() {
        return totalStudent;
    }

    public void setTotalStudent(int totalStudent) {
        this.totalStudent = totalStudent;
    }

    @Basic
    @Column(name = "courseId")
    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    @Basic
    @Column(name = "slotId")
    public int getSlotId() {
        return slotId;
    }

    public void setSlotId(int slotId) {
        this.slotId = slotId;
    }

    @Basic
    @Column(name = "totalSlot")
    public int getTotalSlot() {
        return totalSlot;
    }

    public void setTotalSlot(int totalSlot) {
        this.totalSlot = totalSlot;
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
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClazzEntity that = (ClazzEntity) o;
        return id == that.id &&
                totalStudent == that.totalStudent &&
                courseId == that.courseId &&
                slotId == that.slotId &&
                totalSlot == that.totalSlot &&
                creatorId == that.creatorId &&
                Objects.equals(name, that.name) &&
                Objects.equals(startedTime, that.startedTime) &&
                Objects.equals(finishedTime, that.finishedTime) &&
                Objects.equals(minStudent, that.minStudent) &&
                Objects.equals(maxStudent, that.maxStudent) &&
                Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, startedTime, finishedTime, minStudent, maxStudent, totalStudent, courseId, slotId, totalSlot, creatorId, status);
    }
}
