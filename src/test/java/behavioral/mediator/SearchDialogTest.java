package behavioral.mediator;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchDialogTest {

    @Test
    void shouldSetLabelText() {
        SearchDialog dialog = new SearchDialog();

        SearchField searchField = new SearchField(dialog);
        ListBox listBox = new ListBox(dialog, Arrays.asList("orange", "apple", "grapefruit"));
        Label label = new Label(dialog);

        dialog.setSearch(searchField);
        dialog.setResults(listBox);
        dialog.setLabel(label);

        searchField.keypress("o");
        searchField.keypress("r");
        listBox.select(0);

        assertEquals("orange", label.getText());
    }
}
