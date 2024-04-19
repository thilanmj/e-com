package com.codexmo.common.dtos.filter;

import lombok.Data;

import java.util.List;

@Data
public class BaseFilterCriteriaDto {
    private String criteria;
    private String value;
}
