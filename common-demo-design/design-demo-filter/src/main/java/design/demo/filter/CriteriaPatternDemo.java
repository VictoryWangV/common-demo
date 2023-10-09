package design.demo.filter;

import design.demo.filter.criteria.*;
import design.demo.filter.model.Person;

import java.util.ArrayList;
import java.util.List;

import static design.demo.filter.model.Gender.*;
import static design.demo.filter.model.MaritalStatus.*;

public class CriteriaPatternDemo {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Robert", Male, Single));
        persons.add(new Person("John", Male, Married));
        persons.add(new Person("Laura", Female, Married));
        persons.add(new Person("Diana", Female, Single));
        persons.add(new Person("Mike", Male, Single));
        persons.add(new Person("Bobby", Male, Single));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);

        // 过滤出男性
        System.out.println("Males: ");
        printPersons(male.meetCriteria(persons));

        // 过滤出女性
        System.out.println("\nFemales: ");
        printPersons(female.meetCriteria(persons));

        // 过滤出单身男性
        System.out.println("\nSingle Males: ");
        printPersons(singleMale.meetCriteria(persons));

        // 过滤出单身狗或女性
        System.out.println("\nSingle Or Females: ");
        printPersons(singleOrFemale.meetCriteria(persons));

        // 过滤出女性或单身男性
        System.out.println("\nFemales or Single Male: ");
        printPersons(new OrCriteria(female, singleMale).meetCriteria(persons));
    }

    public static void printPersons(List<Person> persons) {
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName()
                    + ", Gender : " + person.getGender()
                    + ", Marital Status : " + person.getMaritalStatus()
                    + " ]");
        }
    }
}
