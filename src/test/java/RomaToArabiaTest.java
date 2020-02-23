import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;


public class RomaToArabiaTest {

    @Test
    public void romaToArabiaNumberTest() {
        RomaConverter romaConverter = new RomaConverter();

        int arabiaResult = romaConverter.converter("I");

        assertThat(arabiaResult).isEqualTo(1);

    }

    @Test
    public void romaToArabiaNumberTestTwo() {
        RomaConverter romaConverter = new RomaConverter();

        int arabiaResult = romaConverter.converter("III");

        assertThat(arabiaResult).isEqualTo(3);

    }

    @Test
    public void romaToArabiaNumberTest_returnFive() {
        RomaConverter romaConverter = new RomaConverter();

        int arabiaResult = romaConverter.converter("V");

        assertThat(arabiaResult).isEqualTo(5);

    }

    @Test
    public void romaToArabiaNumberTest_return10() {
        RomaConverter romaConverter = new RomaConverter();
        int arabiaResult = romaConverter.converter("X");
        assertThat(arabiaResult).isEqualTo(10);

    }

    @Test
    public void romaToArabiaNumberTest_return11() {
        RomaConverter romaConverter = new RomaConverter();

        int arabiaResult = romaConverter.converter("MXLIX");

        assertThat(arabiaResult).isEqualTo(1049);

    }

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                arguments("II", 2),
                arguments("IX", 9),
                arguments("IV", 4),
                arguments("XVII", 17)
        );
    }
@ParameterizedTest
@MethodSource("argumentsProvider")
    public void romaToArabiaNumberTest_(String roma, int arabia) {
        RomaConverter romaConverter = new RomaConverter();

        int arabiaResult = romaConverter.converter(roma);

        assertThat(arabiaResult).isEqualTo(arabia);

    }

}
