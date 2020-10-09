package htmlBuilder;
public class HTMLDocument extends ContainerElement {
    public HTMLDocument() { name = "html"; }
    public void setBody(BodyElement body) { super.addElement(body);}
}