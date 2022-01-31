package format.format;

import format.format.service.ForChangeService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FormatApplicationTests {

    ForChangeService forChangeService;

    @Autowired
    public FormatApplicationTests(ForChangeService forChangeService) {
        this.forChangeService = forChangeService;
    }

    @Test
    void contextLoads() {
    }

    @Test
    void changeTest() {
		Assertions.assertEquals(forChangeService.change("НГУЕН ВАН ЗАП"), "Нгуен Ван Зап");
        ;
    }

}
