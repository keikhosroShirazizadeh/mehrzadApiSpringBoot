package org.reservation.mehrzadapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "project")
public class Project {

    @Id
    @SequenceGenerator(name="projectCounter",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "projectCounter")
    @Column(name = "ID")
    private int id;

    @Column(name="title",columnDefinition = "varchar(200)")
    private String  title;

    @Column (name="description",columnDefinition = "varchar(400)")
    private String description;

    @Column(name="content",columnDefinition = "varchar(2000)")
    private String content;

    @Column(name="createTime",columnDefinition = "time")
    private String createTime;

    @Column(name="updateTime",columnDefinition = "time")
    private String updateTime;


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Project id(int id) {
        setId(id);
        return this;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Project title(String title) {
        setTitle(title);
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Project description(String description) {
        setDescription(description);
        return this;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Project content(String content) {
        setContent(content);
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Project createTime(String createTime) {
        setCreateTime(createTime);
        return this;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Project updateTime(String updateTime) {
        setUpdateTime(updateTime);
        return this;
    }
    
}
