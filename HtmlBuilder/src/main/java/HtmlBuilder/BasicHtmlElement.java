
package HtmlBuilder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BasicHtmlElement implements HTMLElement{

    protected String name;

    private Map<String,String> properties = new HashMap<String, String>();

    protected String getContent() { return null;};

    protected void setProperty(String name, String value)
    {
        properties.put(name, value);
    }

    protected void getProperty(String name, String value)
    {
        properties.put(name, value);
    }


    @Override
    public String toHtml() {
        String htmlValue = "";

        htmlValue = "<"+name+" ";
        for (Map.Entry<String,String> entry : properties.entrySet())
        {

            htmlValue+=entry.getKey()+"=\""+entry.getValue()+"\" ";
        }


        if (getContent() == null) { htmlValue += "/>"; }
        else
        {
            htmlValue += ">"+getContent()+"</"+name+">\n";
        }
        return htmlValue;
    }



}
