package sadowski.wojciech.owl.app.wizard;

import org.springframework.data.repository.ListCrudRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface WizardRepository extends ListCrudRepository<Wizard, UUID> {
    <S extends Wizard> List<S> saveAll(Iterable<S> entities);

    List<Wizard> findAll();

    List<Wizard> findAllById(Iterable<UUID> uuids);

    <S extends Wizard> S save(S entity);

    Optional<Wizard> findById(UUID uuid);

    boolean existsById(UUID uuid);

    long count();

    void deleteById(UUID uuid);

    void delete(Wizard entity);

    void deleteAllById(Iterable<? extends UUID> uuids);

    void deleteAll(Iterable<? extends Wizard> entities);

    void deleteAll();

}
