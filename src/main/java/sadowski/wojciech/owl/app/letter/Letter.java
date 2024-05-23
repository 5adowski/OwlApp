package sadowski.wojciech.owl.app.letter;

import sadowski.wojciech.owl.app.wizard.Wizard;

import java.util.UUID;

public class Letter {
    private UUID id;
    private Wizard sender;
    private String text;

    public Letter() {
    }

    public Letter(UUID id, Wizard sender, String text) {
        this.id = id;
        this.sender = sender;
        this.text = text;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Wizard getSender() {
        return sender;
    }

    public void setSender(Wizard sender) {
        this.sender = sender;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
