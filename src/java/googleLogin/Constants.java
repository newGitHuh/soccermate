package googleLogin;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author heaty566
 */
public class Constants {

	public static String GOOGLE_CLIENT_ID = "658676113995-ddeu9hvgps5dsqdkfk7bpmh2c3qpn388.apps.googleusercontent.com";

	public static String GOOGLE_CLIENT_SECRET = "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";

	public static String GOOGLE_REDIRECT_URI = "http://localhost:8080/SoccerMate/LoginGoogleHandler";

	public static String GOOGLE_LINK_GET_TOKEN = "https://accounts.google.com/o/oauth2/token";

	public static String GOOGLE_LINK_GET_USER_INFO = "https://www.googleapis.com/oauth2/v1/userinfo?access_token=";

	public static String GOOGLE_GRANT_TYPE = "authorization_code";

}