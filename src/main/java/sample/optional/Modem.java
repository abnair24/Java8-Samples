package sample.optional;

import lombok.Getter;
import lombok.Setter;

import java.util.Optional;

@Setter
@Getter
public class Modem {

    private Double price;

    public Modem(Double price) {
        this.price = price;
    }

    public static boolean isInRange(Modem modem) {
        return Optional.ofNullable(modem)
                .map(Modem::getPrice)
                .filter(s->s >=10 && s <15)
                .isPresent();
    }
}
