package HtmlBuilder;

public class Main {

    public static void main(String[] args) {
        BodyElement body = new BodyElement();
        body.addElement(
                "Ez A HTML kód a két html tag közötti rész kivágandó " +
                "és beillesztendő egy jegyzettömbbe és elmentendő html kiterjesztéssel, " +
                "majd böngészőablakban megnyitható! Köszönöm! ");

        HeaderElement Header = new HeaderElement();
        body.addElement(Header);

        DIVElement div1 = new DIVElement();
        div1.setId("1");
        div1.addElement(
                "Magyarázat:" +
                "Tudom, hogy nagyon ronda és funkcionálisan is nagyon béna," +
                "de arra, hogy java osztályokkal összerakjon egy minimális html kódot" +
                " ami semmire sem jó, nos pont arra készült!"
                        );
        body.addElement(div1);

        ButtonElement button1 = new ButtonElement();
        button1.setProperty(" onclick","alert('Ön megnyomta a gombot!')" );
        body.addElement(button1);

        ButtonElement button2 = new ButtonElement();
        button2.setProperty(" onclick","window.location.href='http://www.training360.hu'");
        body.addElement(button2);

        FooterElement Footer = new FooterElement();
        body.addElement(Footer);

        HTMLDocument  document= new HTMLDocument();
        document.setBody(body);

        System.out.println(document.toHtml());
    }
}
