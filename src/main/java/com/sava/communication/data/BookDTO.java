package com.sava.communication.data;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@RequiredArgsConstructor
public final class BookDTO {

    @NonNull
    private final String id;

    @NonNull
    private final String name;

    private final int quantity;
}
