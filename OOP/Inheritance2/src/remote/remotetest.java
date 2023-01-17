package remote;

public class remotetest {
    public static void main(String[] args){
        /*remote remote1 = new remote();
        remote1.on();
        remote1.off();*/

        samsung samsung1 = new samsung();
        samsung1.music();
        samsung1.on();
        samsung1.off();

        lgremote lgremote1 = new lgremote();
       lgremote1.call();
       lgremote1.on();
       lgremote1.off();
    }
}
