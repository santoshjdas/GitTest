package mainPgm;

import java.util.Base64;

public class Encoder {

	public static void dd() {
		// TODO Auto-generated method stub
String Password="qwerty123";
String encodedPassword =new String (Base64.getEncoder().encode(Password.getBytes()));
System.out.println(encodedPassword);
//cXdlcnR5MTIz

String decodedPassword=new String (Base64.getDecoder().decode(encodedPassword.getBytes()));
System.out.println(decodedPassword);

	}

}
