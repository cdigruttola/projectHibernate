package it.cdigruttola.practices.core.repository;

import it.cdigruttola.practices.model.CustomerModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<CustomerModel, String> {

    Optional<CustomerModel> findByMail(String mail);

    Optional<CustomerModel> findByCode(long code);

    List<CustomerModel> findBySurnameOrName(String surname, String name);

}
