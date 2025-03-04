package com.abbos.brainwave_matrix_intern.dto.auth;

import com.abbos.brainwave_matrix_intern.dto.marker.Request;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

/**
 * @author Aliabbos Ashurov
 * @since 16/January/2025  11:01
 **/
public record RefreshTokenRequestDTO(
        @JsonProperty("refresh_token")
        @NotBlank @NotNull String refreshToken
) implements Request {
}
