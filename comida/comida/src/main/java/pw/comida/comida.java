package pw.comida;

import jakarta.annotation.Generated;

@Entity
public class comida {
    @jakarta.persistence.Id
    @jakarta.persistence.GeneratedValue(strategy = Generated.IDENTITY)
    private Long id;

    public comida(Long id, Boolean deleted, String imageUri) {
        this.id = id;
        this.deleted = deleted;
        this.imageUri = imageUri;
    }

    @NotNull(messagem = "O campo 'deleted' é obrigatório", message = "")
    private Boolean deleted;

    @jakarta.validation.constraints.NotBlank(message = "The 'imageUri' field is required")
    @jakarta.validation.constraints.Pattern(regexp = "^https?://.*", message = "Invalid 'imageUri' format. It must start with 'http://' or 'https://'")
    private String imageUri;

    // Other attributes (add more as needed)

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public String getImageUri() {
        return imageUri;
    }

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }

    // Other getters and setters

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", deleted=" + deleted +
                ", imageUri='" + imageUri + '\'' +
                // Other attributes
                '}';
    }
}
