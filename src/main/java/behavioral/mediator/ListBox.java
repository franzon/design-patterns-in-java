package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListBox extends Component {

    private final List<String> allItems;
    private List<String> filteredItems;

    public ListBox(Mediator dialog, List<String> items) {
        super(dialog);
        this.allItems = items;
        this.filteredItems = new ArrayList<>(allItems);
    }

    public void select(int index) {
        dialog.notify(this, "select", filteredItems.get(index));
    }

    public List<String> getAllItems() {
        return allItems;
    }

    public void filterItems(String searchTerm) {
        filteredItems = allItems
                .stream()
                .filter(text -> text.contains(searchTerm))
                .collect(Collectors.toList());
    }
}
