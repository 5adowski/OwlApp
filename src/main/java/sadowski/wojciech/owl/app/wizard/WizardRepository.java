package sadowski.wojciech.owl.app.wizard;

import org.springframework.data.repository.ListCrudRepository;

import java.util.UUID;

public interface WizardRepository extends ListCrudRepository<Wizard, UUID> {

}
