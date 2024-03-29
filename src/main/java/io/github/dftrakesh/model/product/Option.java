package io.github.dftrakesh.model.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Option {
    private String type;
    private String name;
    private List<Choice> choices;
    private Boolean required;
}