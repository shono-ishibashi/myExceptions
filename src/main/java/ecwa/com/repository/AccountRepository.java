package ecwa.com.repository;

import ecwa.com.entity.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {
    public Account findByUsername(String username);
}