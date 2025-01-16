package com.abbos.brainwave_matrix_intern.task2.service;

import com.abbos.brainwave_matrix_intern.task2.dto.Response;
import com.abbos.brainwave_matrix_intern.task2.dto.marker.Request;
import com.abbos.brainwave_matrix_intern.task2.entity.BaseDomain;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;

/**
 * @author Aliabbos Ashurov
 * @since 14/January/2025  13:07
 **/
public interface GenericCrudService<
        ID extends Serializable,
        E extends BaseDomain,
        R extends com.abbos.brainwave_matrix_intern.task2.dto.marker.Response,
        CR extends Request,
        UP extends Request>
        extends GenericQueryService<ID, E, R> {

    Response<R> create(@NotNull CR dto);

    Response<R> update(@NotNull UP dto);

    Response<Boolean> delete(@NotNull ID id);
}
