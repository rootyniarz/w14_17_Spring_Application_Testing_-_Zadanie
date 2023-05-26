package pl.zajavka.example;

import lombok.Builder;
import lombok.Value;
import lombok.With;

@Builder
@With
@Value
public class User implements Comparable<User> {
    String name;
    String surname;
    String email;

    @Override
    public int compareTo(User o) {
        return o.email.compareTo(email);
    }
}
