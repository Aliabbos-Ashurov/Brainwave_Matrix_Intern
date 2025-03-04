package com.abbos.brainwave_matrix_intern.dto.auth;

import com.abbos.brainwave_matrix_intern.dto.marker.Request;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

/**
 * @author Aliabbos Ashurov
 * @since 16/January/2025  11:01
 **/
public record TokenRequestDTO(
        @NotBlank @NotNull String username,
        @NotBlank @NotNull String password
) implements Request {
}
