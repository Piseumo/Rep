package com.tth.ex10.freeboard;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tth.ex10.file.FileEntity;
import com.tth.ex10.user.User;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
//@Table(name = "freeboard")
public class FreeBoard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    private String title;
    private String content;

    @CreatedBy
    private String creAuthor;

    @LastModifiedBy
    private String modAuthor;

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime regDate;

    @LastModifiedDate
    private LocalDateTime modDate;

    @Column(columnDefinition = "int default 0")
    private int viewCount;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "freeBoard")
    private List<FileEntity> list = new ArrayList<>();

    @ManyToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    private User user;

    public Long getIdx() {
        return idx;
    }

    public String getTitle() {
        return title;
    }

    public void setIdx(Long idx) {
        this.idx = idx;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
