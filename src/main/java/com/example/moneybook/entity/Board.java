package com.example.moneybook.entity;

import com.example.moneybook.entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "board")
public class Board extends BaseEntity {

    //목표번호
    @Id
    @Column(name = "board_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //기준(연/월) 선택
    private String gBasis;

    //목표내용
    private String gTitle;

    //목표금액
    private int	gMoney;

    //목표달성 여부
    private String gole;


}
