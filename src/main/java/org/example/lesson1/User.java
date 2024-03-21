package org.example.lesson1;

import lombok.*;

//@Getter
//@Setter
//@RequiredArgsConstructor
@AllArgsConstructor
//@ToString
//@EqualsAndHashCode

@Data
public class User {
    private final String name;
    private final int age;
    private  int salary;

}
