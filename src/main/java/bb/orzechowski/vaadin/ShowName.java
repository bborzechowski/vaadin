package bb.orzechowski.vaadin;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("name")
public class ShowName extends VerticalLayout {

    public ShowName() {
//
        TextField name = new TextField("Name");
        Button greetButton = new Button("Greet");
//        layout.addComponents(name, greetButton);

        
        greetButton.addClickListener(e -> Notification.show("hi " + name.getValue()));
        add(    name,
                greetButton);
    }
}