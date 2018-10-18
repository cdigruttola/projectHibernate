package it.cdigruttola.practices.core.repository;

import it.cdigruttola.practices.model.CustomerModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<CustomerModel, String> {

    List<CustomerModel> findByMail(String mail);
}
