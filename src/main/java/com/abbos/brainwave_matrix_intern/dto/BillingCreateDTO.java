package com.abbos.brainwave_matrix_intern.dto;

import com.abbos.brainwave_matrix_intern.dto.marker.Request;
import com.abbos.brainwave_matrix_intern.enums.BillingType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

/**
 * @author Aliabbos Ashurov
 * @since 14/January/2025  11:31
 **/
@JsonPropertyOrder({"patientID", "amount", "billingDate", "billingType"})
public record BillingCreateDTO(
        @JsonProperty("patientID")
        @NotNull Long patientID,

        @NotNull BigDecimal amount,

        @JsonProperty("billing_type")
        @NotNull BillingType billingType
) implements Request {
}
