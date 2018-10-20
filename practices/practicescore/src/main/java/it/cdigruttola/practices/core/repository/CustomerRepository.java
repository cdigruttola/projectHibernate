package it.cdigruttola.practices.core.repository;

import it.cdigruttola.practices.model.CustomerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<CustomerModel, String> {

    List<CustomerModel> findByMail(String mail);

}
