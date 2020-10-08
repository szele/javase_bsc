package HtmlBuilder;

public class ButtonElement extends BasicHtmlElement {
    public ButtonElement() {
        name = "button ";
    }
    public void setId(String id) { super.setProperty("id",id); }

    public void setType(String type) { super.setType(type); }

    public void setAlert(String type) { super.setType(type); }

    public void type(String alert, String whatToDo) {  super.setProperty("type", whatToDo);  }

    public void getAlert(String alertmessage) {  super.setText("alertmessage");}

}
