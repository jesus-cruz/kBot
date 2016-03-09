import twitter4j.conf.*;
import twitter4j.*;
import twitter4j.auth.*;
import twitter4j.api.*;

import java.io.IOException;
import java.util.*;


public class ActualizadorEstado {
	
	
	Twitter twitter;

	void setup()
	{
	    ConfigurationBuilder cb = new ConfigurationBuilder();
	    cb.setOAuthConsumerKey(AuthInfo.OAuthConsumerKey);
	    cb.setOAuthConsumerSecret(AuthInfo.OAuthConsumerKey);
	    cb.setOAuthAccessToken(AuthInfo.OAuthAccessToken);
	    cb.setOAuthAccessTokenSecret(AuthInfo.OAuthAccessTokenSecret);
	    TwitterFactory tf = new TwitterFactory(cb.build());
	    twitter = tf.getInstance();
	}
	
	void twitear(){
		try {
			twitter.updateStatus("test");
		} catch (TwitterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	

	public static void main (String[] args){
		ActualizadorEstado actualizador = new ActualizadorEstado();
		actualizador.setup();
		actualizador.twitear();
	}

}








//try {
/*Scanner sc = new Scanner(System.in);
String mensaje=sc.next();*/

//String mensaje = randomYTUrl();
/*Status status = twitter.updateStatus(mensaje);
System.out.println("actualizado");
} catch (TwitterException e) {
// TODO Auto-generated catch block
e.printStackTrace();
System.out.println("No actualizado");
}*/



//void retwitear(){
	/*try {
		IDs friends = twitter.getFriendsIDs("KBot92",-1);
		
		for (long i : friends.getIDs())
		   {
				//System.out.println(twitter.showUser(i).getName());
				//Status status = twitter.updateStatus(twitter.showUser(i).getName());
				/*List<Status> listaStatus = null;
				listaStatus = twitter.getUserTimeline(twitter.showUser(i).getName());
					for (Status status : listaStatus) {
							System.out.println(listaStatus);
					}
			//twitter.retweetStatus();
			
			twitter.getRetweeterIds()
		   }
	
		System.out.println("actualizado");
	} catch (TwitterException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("No actualizado");
	}*/
//}

/*
private String randomYTUrl() {
for (int i = 0; i < 11; i++ ){
	Random r1 = new Random();
	int mayusOminus = r1.nextInt((1-0) +1) +0;
	
	if ( mayusOminus == 0){
		Random r = new Random();
		char aux = (char)(r.nextInt(26) + 'a');
		System.out.print(aux);
	} 
	if ( mayusOminus == 1){
		Random r = new Random();
		char aux = (char)(r.nextInt(26) + 'A');
		System.out.print(aux);
	}
	
	
}
return null;
}*/