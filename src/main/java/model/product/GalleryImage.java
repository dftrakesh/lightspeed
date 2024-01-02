package model.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class GalleryImage {
    private int id;
    private String url;
    private String thumbnail;
    private String originalImageUrl;
    private String imageUrl;
    private String hdThumbnailUrl;
    private String thumbnailUrl;
    private String smallThumbnailUrl;
    private int width;
    private int height;
    private int orderBy;
    private BorderInfo borderInfo;
}