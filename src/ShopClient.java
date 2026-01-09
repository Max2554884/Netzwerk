public class ShopClient {

    ShopClient(String pServerIP, int pServerPort)
    {
        super(pServerIP , pServerPort);
    }
    public void ProcessMessage(String pClientIP,int pClientPort,String pMessage)
    {
        String[] nachrichtTeil = pMessage.split(":");
        if (nachrichtTeil [0].equals("TSHIRT"))
        {
         this.send(pClientIP,pClientPort, "Die Groesse ist" + nachrichtTeil[1] + ",die Farbe ist" +
                 nachrichtTeil [2] +"und es kostet 19,99 Euro!");
        }

    }
}
