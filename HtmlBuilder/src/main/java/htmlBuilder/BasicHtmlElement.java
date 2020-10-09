package htmlBuilder;

import java.util.HashMap;
import java.util.Map;

public class
BasicHtmlElement implements HTMLElement{

    protected String name;
    private final Map<String,String> properties; { properties = new HashMap<>(); }
    public BasicHtmlElement() {    }
    protected String getContent() { return name;}
    protected void setProperty(String value)
 {
     properties.put(" onclick", value);
 }

    @Override
    public String toHtml() {
        StringBuilder htmlValue;
        htmlValue = new StringBuilder("\n " + "<" + name); // nyitó tag
        for (Map.Entry<String,String> entry : properties.entrySet())
        {
                  htmlValue.append(entry.getKey()).append("=\"").append(entry.getValue()).append("\"");
         }
                if (getContent() == null) { htmlValue.append("/>"); } // sima záró ha nincs tag name
        else
        {
            htmlValue.append(">").append(getContent()).append("</").append(name).append(">" + "\n "); // záró tag
        }
        return htmlValue.toString();
    }
}
