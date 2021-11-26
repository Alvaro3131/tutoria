package com.example.seguridad.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="tbl_persona")
public class Persona  implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_PERSONA")
	private int id;
	@Column(name="NO_PERSONA")
	private String nombre;
	@Column(name="AP_PATERNO")
	private String paterno;
	@Column(name="AP_MATERNO")
	private String materno;
	@Column(name="CO_DNI")
	private String dni;
	@Column(name="NO_CORREO")
	private String correo;
	@Column(name="NU_TELEFONO")
	private String telefono;
	
		
	@JsonIgnore
	@OneToOne(mappedBy = "persona", fetch = FetchType.LAZY)
	private Usuario usuario;

	private static final long serialVersionUID = 1L;
	
	
	
}
