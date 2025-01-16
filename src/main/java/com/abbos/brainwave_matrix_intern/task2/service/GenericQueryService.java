package com.abbos.brainwave_matrix_intern.task2.service;

import com.abbos.brainwave_matrix_intern.task2.dto.Response;
import com.abbos.brainwave_matrix_intern.task2.entity.BaseDomain;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.List;

/**
 * @author Aliabbos Ashurov
 * @since 14/January/2025  13:07
 **/
public interface GenericQueryService<
        ID extends Serializable,
        E extends BaseDomain,
        R extends com.abbos.brainwave_matrix_intern.task2.dto.marker.Response>
        extends GenericService {

    Response<R> find(@NotNull ID id);

    Response<List<R>> findAll();
}
