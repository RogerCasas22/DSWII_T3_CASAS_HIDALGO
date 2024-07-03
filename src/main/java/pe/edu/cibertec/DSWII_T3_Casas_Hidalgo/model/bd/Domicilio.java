package pe.edu.cibertec.DSWII_T3_Casas_Hidalgo.model.bd;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Domicilio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDomicilio;

    @Column(nullable = false)
    private String descDomicilio;

    @Column(nullable = false)
    private int nroDomicilio;

    @Column(nullable = false)
    private String refDomicilio;
}
