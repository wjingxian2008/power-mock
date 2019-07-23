package com.github.wjingxian2008.controller;

import com.github.wjingxian2008.domain.Person;
import com.github.wjingxian2008.service.PersonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.BDDMockito.given;

@RunWith(MockitoJUnitRunner.class)
public class PersonControllerTest {
    @InjectMocks
    private PersonController personController;

    @Mock
    private PersonService personService;

    @Test
    public void should_get_name_successfully() {
        // given
        String name = "test";
        Person person = new Person("wang", "jingxian", new BigDecimal(1));
        given(personService.find(argThat(arg -> name.equals(arg.getName())))).willReturn(person);

        // when
        String result = personController.getName(name);

        // then
        assertThat(name).isEqualTo(name);
    }
}