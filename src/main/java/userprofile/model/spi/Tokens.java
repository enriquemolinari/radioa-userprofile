package userprofile.model.spi;

import java.util.Optional;

public interface Tokens {

 Optional<Token> token(String token);

 String newToken(User u);

}
