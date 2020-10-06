
package HtmlBuilder;

import java.util.HashMap;
import java.util.Map;

public class BasicHtmlElement implements HTMLElement{

    protected String name;

    private final Map<String,String> properties;

    {
        properties = new HashMap<>();
    }
    private final Map<String,String> types;

    {
        types = new HashMap<>();
    }

    public BasicHtmlElement() {    }

    protected String getContent() { return null;}


    protected void setProperty(String value)
    {
        properties.put(" id", value);
    }

    protected void getProperty(String name, String value)
    {
        properties.put(name, value);
    }

    protected void setType(String value)
    {
        types.put(" type", value);
    }

    protected void getType(String name, String value)
    {
        types.put(name, value);
    }

    @Override
    public String toHtml() {
        StringBuilder htmlValue;

        htmlValue = new StringBuilder("\n" + "<" + name);
        for (Map.Entry<String,String> entry : properties.entrySet())
        {
            htmlValue.append(entry.getKey()).append("=\"").append(entry.getValue()).append("\"");
        }
        if (getContent() == null) { htmlValue.append("/>"); }
        else
        {
            htmlValue.append(">").append(getContent()).append("</").append(name).append(">" + "\n");
        }
        return htmlValue.toString();
    }

}
