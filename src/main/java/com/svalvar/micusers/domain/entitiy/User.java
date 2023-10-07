package com.svalvar.micusers.domain.entitiy;

import lombok.Builder;

@Builder
public record User(
        Long id,
        String name,
        Job job
) {
}
