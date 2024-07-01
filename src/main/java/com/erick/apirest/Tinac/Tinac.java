package com.erick.apirest.Tinac;

import java.sql.Date;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Tinac {
    
    @Id
    @GeneratedValue
    private Integer id;
    @Basic
    private String porcentaje;
    private float volumen;
    private Date fecha;
    private float presion;
    private float flujo;

}
