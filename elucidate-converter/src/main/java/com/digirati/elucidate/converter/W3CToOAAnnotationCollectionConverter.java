package com.digirati.elucidate.converter;

import java.util.HashMap;
import java.util.Map;

import com.digirati.elucidate.converter.node.JSONNodeConverter;

public class W3CToOAAnnotationCollectionConverter extends AbstractConverter {

    private static final Map<String, String> FIELD_MAPPINGS = new HashMap<>();
    private static final Map<String, String> TYPE_MAPPINGS = new HashMap<>();
    private static final Map<String, JSONNodeConverter> NODE_CONVERTER_MAPPINGS = new HashMap<>();

    public W3CToOAAnnotationCollectionConverter() {
        super(FIELD_MAPPINGS, TYPE_MAPPINGS, NODE_CONVERTER_MAPPINGS);
    }
}
