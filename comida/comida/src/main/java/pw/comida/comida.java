package pw.comida;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;

@Entity

public class comida {
    private long id;
    private boolean deleted;

    @NotEmpty(message = "A URI da imagem é obrigatória")
    private String imageUri;

    @NotEmpty(message = "O nome da comida é obrigatório")
    private String nome;

    @NotEmpty(message = "A descrição da comida é obrigatória")
    private String descricao;

    @DecimalMin(value = "0.0", inclusive = false, message = "O preço deve ser maior que zero")
    private double preco;

    @Min(value = 0, message = "A quantidade deve ser maior ou igual a zero")
    private int quantidade;

    public void Comida() {
    }

    public void Comida(long id, boolean deleted, String imageUri, String nome, String descricao, double preco,
            int quantidade) {
        this.id = id;
        this.deleted = deleted;
        this.imageUri = imageUri;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Getters and Setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public String getImageUri() {
        return imageUri;
    }

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
