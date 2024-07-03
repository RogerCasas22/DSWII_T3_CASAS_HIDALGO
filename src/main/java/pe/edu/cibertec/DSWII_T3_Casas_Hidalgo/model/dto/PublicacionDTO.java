package pe.edu.cibertec.DSWII_T3_Casas_Hidalgo.model.dto;

import lombok.Data;

@Data
public class PublicacionDTO implements DtoEntity{


    private String titulo;
    private String resumen;
    private String fechPublicacion;
    private AutorDTO autor;
}