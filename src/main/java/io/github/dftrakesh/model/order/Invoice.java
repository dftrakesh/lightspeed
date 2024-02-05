package io.github.dftrakesh.model.order;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Invoice {
    private Integer internalId;
    private String id;
    private String created;
    private String link;
    private String type;
}
