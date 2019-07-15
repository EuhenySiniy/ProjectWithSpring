package com.yevhensynii.beta.listener;

import com.yevhensynii.beta.model.CreatableEntity;

import javax.persistence.PrePersist;
import java.util.Date;

public class CreatableEntityListener {
    @PrePersist
    public void prePersist(CreatableEntity entity) {
        entity.setCreatedDate(new Date().getTime());
    }
}
