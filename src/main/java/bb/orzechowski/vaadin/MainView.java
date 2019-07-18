package bb.orzechowski.vaadin;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("test")
public class MainView extends VerticalLayout {

    public MainView() {
        VerticalLayout todosList = new VerticalLayout(); //lista wartosci z todofield (w pionie jeden po drugim)
        TextField todoField = new TextField("", "fill text"); //okno formularza
        Button addButton = new Button("Add"); //przycisk
        Button delButton = new Button("delete");
        Button newButton = new Button("ClickAndEnter me", event -> Notification.show("cliced!")); //wyświetla na chwile wiadomość cliced!

        addButton.addClickListener(click-> {  //nasłuchiwanie klikniecia na przycist add..
            Checkbox checkbox = new Checkbox(todoField.getValue());  //pobieramy wartosc wpisana w formularzu
            todosList.add(checkbox); //dodajemy wartosc do checkboxa
        });

        delButton.addClickListener(click->{
            todosList.removeAll(); //usuwamy cala liste todolist
        });

        //wyświetlamy wartości
        add(
                new H1("Vaadin Todo"), //to co H1 w HTML
                todosList,

                new HorizontalLayout( //w pozomie jeden po drugim
                        todoField,
                        addButton,
                        delButton,
                        newButton
                )

        );
    }

}
