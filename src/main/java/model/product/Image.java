package model.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Image {
    private String id;
    private boolean isMain;
    private int orderBy;
    private String image160pxUrl;
    private String image400pxUrl;
    private String image800pxUrl;
    private String image1500pxUrl;
    private String imageOriginalUrl;
}