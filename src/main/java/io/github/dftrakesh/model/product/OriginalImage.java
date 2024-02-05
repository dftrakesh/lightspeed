package io.github.dftrakesh.model.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class OriginalImage {
    private String url;
    private Integer width;
    private Integer height;
}