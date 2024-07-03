package pe.edu.cibertec.DSWII_T3_Casas_Hidalgo.model.bd;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Publicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPublicacion;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private String resumen;

    @Column(nullable = false)
    private String fechPublicacion;

    @ManyToOne
    @JoinColumn(name = "idAutor", nullable = false)
    private Autor autor;

}
