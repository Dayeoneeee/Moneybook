package com.example.moneybook.entity;

import com.example.moneybook.entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "notice")
public class Notice extends BaseEntity {

    //공지번호
    @Id
    @Column(name = "notice_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //제목
    private String nTitle;

    //내용
    private String nContent;
}
