package com.svalvar.micusers.domain.entitiy;

import lombok.Builder;

@Builder
public record Job(
        Long id,
        String title,
        String enterprise
) {
}
