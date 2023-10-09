package design.demo.filter.criteria;

import design.demo.filter.model.Gender;
import design.demo.filter.model.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤出男性
 */
public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<>();
        for (Person person : persons) {
            if (Gender.Male.equals(person.getGender())) {
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
