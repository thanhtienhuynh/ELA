package com.example.demo.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ClassDetail", schema = "dbo", catalog = "ELA")
public class ClassDetailEntity {
    private int id;
    private int accountId;
    private int classId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "accountId")
    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    @Basic
    @Column(name = "classId")
    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassDetailEntity that = (ClassDetailEntity) o;
        return id == that.id &&
                accountId == that.accountId &&
                classId == that.classId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, accountId, classId);
    }
}
