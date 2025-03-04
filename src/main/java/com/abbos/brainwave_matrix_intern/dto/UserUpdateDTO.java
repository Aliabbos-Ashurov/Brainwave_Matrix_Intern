package com.abbos.brainwave_matrix_intern.dto;

import com.abbos.brainwave_matrix_intern.dto.marker.Request;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

/**
 * @author Aliabbos Ashurov
 * @since 14/January/2025  11:15
 **/
public record UserUpdateDTO(
        @NotBlank @NotNull String oldPassword,
        @NotBlank @NotNull String newPassword
) implements Request {
}
