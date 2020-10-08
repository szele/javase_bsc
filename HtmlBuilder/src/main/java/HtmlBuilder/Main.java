

package HtmlBuilder;


import java.awt.*;

public class Main {

    public static void main(String[] args) {

        BodyElement body = new BodyElement();
        body.addElement("Ez itt a tartalom első sora!");

        DIVElement div1 = new DIVElement();
        div1.setId("1");
        div1.addElement("Ez itt a tartalom második sora!");
        body.addElement(div1);

        DIVElement div2 = new DIVElement();
        div2.setId("2");
        div2.addElement("Ez itt a tartalom harmadik sora!");
        body.addElement(div2);

        ButtonElement button1 = new ButtonElement();
        //button1.setId("button");
        button1.name = "button";
        //button1.type("onclick", "alert");
       // button1.getAlert("Megnyomtad a gombot!");
        button1.setProperty("onclick","alert('Ön megnyomta a gombot!')" );
        body.addElement(button1);


        HTMLDocument  document= new HTMLDocument();
        document.setBody(body);

        System.out.println(document.toHtml());


    }

}
