package behavioral.mediator;

public class SearchField extends Component {
    private String fullText = "";

    public SearchField(Mediator dialog) {
        super(dialog);
    }

    public void keypress(String text) {
        fullText += text;
        dialog.notify(this, "keypress", fullText);
    }
}
