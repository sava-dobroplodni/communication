package com.sava.communication.data;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
@RequiredArgsConstructor
public final class UserDTO {

    @NonNull
    private final String id;

    @NonNull
    private final String name;
}
