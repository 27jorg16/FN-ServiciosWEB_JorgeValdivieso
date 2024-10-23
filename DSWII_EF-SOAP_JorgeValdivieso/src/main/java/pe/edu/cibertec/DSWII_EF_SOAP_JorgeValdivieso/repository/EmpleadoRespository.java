package pe.edu.cibertec.DSWII_EF_SOAP_JorgeValdivieso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DSWII_EF_SOAP_JorgeValdivieso.model.Empleado;

@Repository
public interface EmpleadoRespository extends JpaRepository<Empleado, Integer> {
}