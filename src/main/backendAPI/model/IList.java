package com.spiderman.backendAPI.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class IList implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private Long imgId;
    private Date time;
    private String title;
    private String content;
    private String comment;
    private Long userID;

    public IList(Long imgId, Date time, String title, String content, String comment, Long userID) {

        this.imgId = imgId;
        this.time = time;
        this.title = title;
        this.content = content;
        this.comment = comment;
        this.userID = userID;
    }



    @Override
    public String toString() {
        return "IList{" +
                "id=" + id +
                ", imgId=" + imgId +
                ", time=" + time +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", comment='" + comment + '\'' +
                ", userID=" + userID +
                '}';
    }
}
