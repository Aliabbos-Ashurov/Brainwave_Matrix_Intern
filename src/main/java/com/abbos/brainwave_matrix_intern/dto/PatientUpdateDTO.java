package com.abbos.brainwave_matrix_intern.dto;

import com.abbos.brainwave_matrix_intern.dto.marker.Request;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

/**
 * @author Aliabbos Ashurov
 * @since 14/January/2025  12:51
 **/
@JsonPropertyOrder({"phoneNumber"})
public record PatientUpdateDTO(
        @JsonProperty("phone_number")
        @NotNull @NotBlank String phoneNumber
) implements Request {
}
