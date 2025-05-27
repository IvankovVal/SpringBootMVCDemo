package com.example.NewDemo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Exercise {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;//Индивидуальный номер
    private Integer exType;//Тип задания
    private String exText;//Текст задания
    private Double rightAnswer;//Верный ответ
    private Date createdAt;//Дата создания
    private Date editedAt;//Дата последнего редактирования

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getExType() {
        return exType;
    }

    public void setExType(Integer exType) {
        this.exType = exType;
    }

    public String getExText() {
        return exText;
    }

    public void setExText(String exText) {
        this.exText = exText;
    }

    public Double getRightAnswer() {
        return rightAnswer;
    }

    public void setRightAnswer(Double rightAnswer) {
        this.rightAnswer = rightAnswer;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getEditedAt() {
        return editedAt;
    }

    public void setEditedAt(Date editedAt) {
        this.editedAt = editedAt;
    }
}
