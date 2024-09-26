package com.tth.ex10.freeboard;

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

//    private FreeBoard(Long idx,String title){
//        this.idx = idx;
//        this.title = title;
//    }


    private String content;

    @ManyToOne(cascade = CascadeType.ALL)
    private User user;

    @CreatedBy
    private String creAuthor;

    @LastModifiedBy
    private String modAuthor;

    @CreatedDate
    private LocalDateTime regDate;

    @LastModifiedDate
    private LocalDateTime modDate;

    @Column(columnDefinition = "int default 0")
    private int viewCount;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "freeBoard")
    private List<FileEntity> list = new ArrayList<>();
}
