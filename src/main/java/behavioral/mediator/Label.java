package behavioral.mediator;

public class Label extends Component {
    private String text;

    public Label(Mediator dialog) {
        super(dialog);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
