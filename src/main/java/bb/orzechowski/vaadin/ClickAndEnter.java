package bb.orzechowski.vaadin;

import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("click")
public class ClickAndEnter extends VerticalLayout {


    public ClickAndEnter() {
        // Component definitions omitted
        VerticalLayout todosList = new VerticalLayout(); //
        TextField taskField = new TextField(); //
        Button addButton = new Button("Add"); //

        // sciśnięcie entera lub przycisku powoduje dodanie wartosci
        addButton.addClickShortcut(Key.ENTER);
        addButton.addClickListener(click -> {
                    //
                    Checkbox checkbox = new Checkbox(taskField.getValue());
                    todosList.add(checkbox);
                }
        );


        add(
                new H1("Vaadin Todo"),
                todosList,
                new HorizontalLayout(
                        taskField,
                        addButton
                )

        );
    }
}
