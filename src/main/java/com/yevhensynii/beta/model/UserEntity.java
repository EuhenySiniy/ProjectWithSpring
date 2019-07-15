package com.yevhensynii.beta.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
@Entity
@Table(name = "user")
public class UserEntity extends BaseEntity {
    @Column(name = "login")
    private String login;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    private UserRole userRole;
}
