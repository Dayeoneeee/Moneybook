package com.example.moneybook.dto;

import lombok.*;

@ToString
@Getter
@Setter
@NoArgsConstructor
public class AssetsDTO1 {

    //자산 번호
    private Long id;

    //통장이름
    private String bankbookNm;

    //통장유형
    private String bankType;

    //은행명
    private String bankName;

    //시작금액
    private int balance;

    //카드사
    private String cardType;

    //카드이름
    private String cardName;



}
