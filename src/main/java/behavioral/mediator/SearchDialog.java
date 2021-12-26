package behavioral.mediator;

public class SearchDialog implements Mediator {

    private SearchField search;
    private ListBox results;
    private Label label;

    public void setSearch(SearchField search) {
        this.search = search;
    }

    public void setResults(ListBox results) {
        this.results = results;
    }

    public void setLabel(Label label) {
        this.label = label;
    }

    @Override
    public void notify(Component sender, String event, Object data) {
        if (sender.equals(search) && event.equals("keypress"))
            results.filterItems((String) data);

        else if (sender.equals(results) && event.equals("select"))
            label.setText((String) data);

    }
}
