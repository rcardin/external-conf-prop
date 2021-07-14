package in.rcard.externalconfprop;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {MyExternalConfProp.class})
class MyExternalConfPropTest {

  @Autowired
  private MyExternalConfProp confProp;

  @Test
  void externalConfigurationPropertyShouldBeLoadedIntoSpringContext() {
    assertThat(confProp).hasFieldOrPropertyWithValue("property", "yeyeye");
  }
}