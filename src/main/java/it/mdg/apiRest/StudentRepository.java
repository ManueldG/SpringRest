package it.mdg.apiRest;

import org.springframework.data.repository.CrudRepository;

import it.mdg.apiRest.entity.Student;



// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
