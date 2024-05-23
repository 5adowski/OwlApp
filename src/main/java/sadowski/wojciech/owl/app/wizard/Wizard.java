package sadowski.wojciech.owl.app.wizard;

import sadowski.wojciech.owl.app.owlery.Owlery;

import java.util.List;
import java.util.UUID;

public class Wizard {
    private UUID id;
    private String email;
    private String password;
    private List<Owlery> owleries;

    public Wizard() {
    }

    public Wizard(UUID id, String email, String password, List<Owlery> owleries) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.owleries = owleries;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Owlery> getOwleries() {
        return owleries;
    }

    public void setOwleries(List<Owlery> owleries) {
        this.owleries = owleries;
    }

}
