package com.github.wjingxian2008.service;

import com.github.wjingxian2008.domain.Person;
import com.github.wjingxian2008.domain.PersonRequest;
import com.github.wjingxian2008.utils.TimeUnit;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.core.classloader.annotations.SuppressStaticInitializationFor;
import org.powermock.modules.junit4.PowerMockRunner;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(PowerMockRunner.class)
@PrepareForTest({TimeUnit.class})
@SuppressStaticInitializationFor("com.github.wjingxian2008.utils.SalaryCalculator")
public class PersonServiceTest {

    @InjectMocks
    private PersonService personService;


    @Test
    public void should_return_non_person_successfully() {
        // given
        PersonRequest personRequest = new PersonRequest("wjx");

        // when
        Person result = personService.find(personRequest);

        // then
        assertThat(result).isEqualToComparingFieldByField(new Person("None", "None", BigDecimal.ZERO));
    }

    @Test
    public void should_return_person_successfully() {
        // given
        Person person = new Person("Merson", "James", new BigDecimal(20));
        PersonRequest personRequest = new PersonRequest("James");
        PowerMockito.mockStatic(TimeUnit.class);
        PowerMockito.doNothing().when(TimeUnit.class);

        // when
        Person result = personService.find(personRequest);

        // then
        assertThat(result).isEqualToComparingFieldByField(person);
    }
}