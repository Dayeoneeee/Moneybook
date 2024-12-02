package com.example.moneybook.entity;

import com.example.moneybook.constant.EpCategory;
import com.example.moneybook.constant.EpType;
import com.example.moneybook.constant.IcCategory;
import com.example.moneybook.entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "account")
public class Account extends BaseEntity {

    //장부번호
    @Id
    @Column(name = "account_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //내용
    private String acContent;

    //지출금액
    @Column(nullable = false)
    private int expense;

    //수입금액
    @Column(nullable = false)
    private int income;

    //권한부여

    //지출 유형
    @Enumerated(EnumType.STRING)
    private EpType epType;

    //지출 카테고리
    @Enumerated(EnumType.STRING)
    private EpCategory epCategory;

    //수입 카테고리
    @Enumerated(EnumType.STRING)
    private IcCategory icCategory;



}