package behavioral.mediator;

public class Component {
    protected final Mediator dialog;

    public Component(Mediator dialog) {
        this.dialog = dialog;
    }

    public Mediator getDialog() {
        return dialog;
    }
}
