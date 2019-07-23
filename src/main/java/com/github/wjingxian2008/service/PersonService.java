/*
 * Copyright © 2019, Wen Hao <wenhao@126.com>.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.github.wjingxian2008.service;

import com.github.wjingxian2008.domain.Person;
import com.github.wjingxian2008.domain.PersonRequest;
import com.github.wjingxian2008.utils.SalaryCalculator;
import com.github.wjingxian2008.utils.TimeUnit;

import java.math.BigDecimal;

public class PersonService {

    public Person find(final PersonRequest request) {
        if (request.getName().equals("James")) {
            Person person = new Person("Merson", "James", BigDecimal.TEN);
            person.setSalary(SalaryCalculator.calculate(person.getSalary()));
            TimeUnit.sleep(5000);
            return person;
        }
        return new Person("None", "None", BigDecimal.ZERO);
    }
}
