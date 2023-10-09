package design.demo.filter.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {

    /**
     * 姓名
     */
    private String name;
    /**
     * 性别
     */
    private Gender gender;
    /**
     * 婚姻状况
     */
    private MaritalStatus maritalStatus;

}
