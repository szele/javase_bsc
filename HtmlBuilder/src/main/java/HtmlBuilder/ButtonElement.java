package HtmlBuilder;

public class ButtonElement extends ContainerElement {

    public ButtonElement() {

        name = "button";

    }
    public void setId(String id) { super.setProperty(id); }

    public void setType(String type) { super.setType(type); }

    public void onClick(String whatToDo) {}
}
