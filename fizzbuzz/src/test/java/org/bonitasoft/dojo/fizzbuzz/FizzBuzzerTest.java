/**
 * Copyright (C) 2012 BonitaSoft S.A.
 * 
 * BonitaSoft, 32 rue Gustave Eiffel - 38000 Grenoble
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2.0 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.bonitasoft.dojo.fizzbuzz;

import org.junit.Before;

/**
 * Given a number
 *  
 *  return the number in string
 *  
 *  when number contains a 3 then return Fizz

 *  when number is a multiple of 3 then return Fizz
 *  
 *  when number contains a 7 then return Buzz
 *  
 *  when number is a multiple of 7 then return Buzz
 *  
 *  when number is Fizz and Buzz then return FizzBuzz
 *  
 */
public class FizzBuzzerTest {

    private FizzBuzzer fizzBuzzer;

    @Before
    public void initializeFizzBuzzer() {
        fizzBuzzer = new FizzBuzzer();
    }
}
