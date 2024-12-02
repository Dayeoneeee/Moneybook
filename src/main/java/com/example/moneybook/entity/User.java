package com.example.moneybook.entity;

import com.example.moneybook.constant.Role;
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
@Table(name = "user")
public class User {

    //회원번호
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //아이디
    @Column(nullable = false, unique = true)
    private String identify;

    //비밀번호
    @Column(nullable = false)
    private String	password;

    //이름
    @Column(nullable = false)
    private String name;

    //이메일
    @Column(nullable = false, unique = true)
    private String email;


    //권한부여

    // 회원유형
    @Enumerated(EnumType.STRING)
    private Role role;


}
