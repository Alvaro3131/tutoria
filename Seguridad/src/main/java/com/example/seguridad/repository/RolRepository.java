package com.example.seguridad.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.seguridad.entity.Rol;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer>{
	@Query(value = "select tr.ID_ROL , tr.NO_ROL from tbl_usuario tu join tbl_rol_usuario tru on tu.ID_PERSONA =tru.FK_USUARIO join tbl_rol tr  on tru.FK_ROL =tr.ID_ROL where tu.ID_PERSONA =?;", nativeQuery = true)
	List<Rol> listarRoles(int id);

}
