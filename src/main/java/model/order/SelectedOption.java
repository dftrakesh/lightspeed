package model.order;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class SelectedOption {
    private String name;
    private NameTranslated nameTranslated;
    private String value;
    private ValueTranslated valueTranslated;
    private List<String> valuesArray;
    private List<Selection> selections;
    private String type;
}
