package in.rcard.externalconfprop;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "my.conf")
@PropertySource(value = "classpath:ext.yml", factory = YamlPropertySourceFactory.class)
public class MyExternalConfProp {
  private String property;

  public void setProperty(String property) {
    this.property = property;
  }

  public String getProperty() {
    return property;
  }
}
