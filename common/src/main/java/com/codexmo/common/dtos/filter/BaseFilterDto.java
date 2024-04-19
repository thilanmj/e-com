package com.codexmo.common.dtos.filter;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class BaseFilterDto {
    private BasePageableDto pageable;
    private List<BaseFilterCriteriaDto> baseFilterCriteriaList;
    private List<BaseFilterCriteriaDto> baseSearchCriteriaList;
    private Map<String, Sort> sortData;
}
