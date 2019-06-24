package example.micronaut;

import io.micronaut.context.annotation.ConfigurationProperties;
import io.micronaut.context.annotation.Requires;

@Requires(property = "app.hosted-domain")
@ConfigurationProperties("app")
public class ApplicationConfigurationProperties implements ApplicationConfiguration {

    private String hostedDomain;

    public void setHostedDomain(String hostedDomain) {
        this.hostedDomain = hostedDomain;
    }

    @Override
    public String getHostedDomain() {
        return hostedDomain;
    }
}
