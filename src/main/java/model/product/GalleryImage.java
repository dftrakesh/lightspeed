package model.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class GalleryImage {
    private Integer id;
    private String url;
    private String thumbnail;
    private String originalImageUrl;
    private String imageUrl;
    private String hdThumbnailUrl;
    private String thumbnailUrl;
    private String smallThumbnailUrl;
    private Integer width;
    private Integer height;
    private Integer orderBy;
    private BorderInfo borderInfo;
}