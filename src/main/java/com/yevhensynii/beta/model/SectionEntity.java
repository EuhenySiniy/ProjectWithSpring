package com.yevhensynii.beta.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
@Entity
@Table(name = "section")
public class SectionEntity extends CreatableEntity {
    @Column(name = "name")
    private String name;

    @ManyToOne
    private CourseEntity courseEntity;
}
