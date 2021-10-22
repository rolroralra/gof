package behavioral.chainOfResponsibility.example2;

import org.junit.jupiter.api.Test;

public class AuthenticationTest {

    @Test
    void test() {
        AuthenticationProcessor oAuthenticationProcessor = new OAuthAuthenticationProcessor(null);
        AuthenticationProcessor uAuthenticationProcessor = new UsernamePasswordAuthenticationProcessor(oAuthenticationProcessor);

        AuthenticationProvider oAuthenticationProvider = new OAuthTokenProvider();
        AuthenticationProvider uAuthenticationProvider = new UsernamePasswordProvider();
        AuthenticationProvider sAuthenticationProvider = new SamlAuthenticationProvider();

        if (oAuthenticationProcessor.isAuthorized(uAuthenticationProvider)) {
            System.out.println("Success");
        }

    }

}
