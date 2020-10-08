package HtmlBuilder;

public class ButtonElement extends BasicHtmlElement { // ugye Buttonnak nincs tartalma, nem container
    public ButtonElement() {
        name = "button";
    }
    public void setId(String id) { super.setProperty("id",id); }

    public void setType(String type) { super.setType(type); }

    public void onClick(String whatToDo) {  super.setProperty("onClick", whatToDo);  }

    public void addElement(String test) {
    }
}
