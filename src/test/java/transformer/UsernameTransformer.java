package transformer;


import cucumber.api.Transformer;

/**
 * This class will transform a username into a gmail email address
 */
public class UsernameTransformer extends Transformer<String> {

    @Override
    public String transform(String username) {
        return username.replaceAll("\\s+","").trim().toLowerCase().concat("@gmail.com");
    }
}
