package com.example.moneybook.entity;

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
@Table(name = "assets")
public class Assets extends BaseEntity {

    //자산 번호
    @Id
    @Column(name = "assets_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //통장이름
    private String bankbookNm;

    //통장유형
    private String bankType;

    //은행명
    private String bankName;

    //시작금액
    @Column(nullable = false)
    private int balance;

    //카드사
    private String cardType;

    //카드이름
    private String cardName;

    //체크카드여부
    private String checkCard;

    //연동계좌
    private String linkBank;

    //결제일
    private int acDay;

    //회원정보 연결
    @ManyToOne
    @JoinColumn(name = "user_id") //매핑할 외래키 지정
    private User user_id;

}
