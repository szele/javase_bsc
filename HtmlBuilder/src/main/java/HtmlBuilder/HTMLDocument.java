

package HtmlBuilder;

public class HTMLDocument extends ContainerElement {

    public HTMLDocument() {

        name = "html";
    }

    public HTMLDocument(void setEncoding) {
        super();
    }

    public static void setEncoding(String encoding)
    {
        setProperty("encoding", encoding);
    }

    public void setBody(BodyElement body) { super.addElement(body);};


}
