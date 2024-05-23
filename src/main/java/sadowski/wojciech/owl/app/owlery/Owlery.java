package sadowski.wojciech.owl.app.owlery;

import sadowski.wojciech.owl.app.letter.Letter;
import sadowski.wojciech.owl.app.wizard.Wizard;

import java.util.UUID;
import java.util.Set;
import java.util.List;

public class Owlery {
    private UUID id;
    private Set<Wizard> members;
    private List<Letter> letters;

    public Owlery() {
    }

    public Owlery(UUID id, Set<Wizard> members, List<Letter> letters) {
        this.id = id;
        this.members = members;
        this.letters = letters;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Set<Wizard> getMembers() {
        return members;
    }

    public void setMembers(Set<Wizard> members) {
        this.members = members;
    }

    public List<Letter> getLetters() {
        return letters;
    }

    public void setLetters(List<Letter> letters) {
        this.letters = letters;
    }

}
