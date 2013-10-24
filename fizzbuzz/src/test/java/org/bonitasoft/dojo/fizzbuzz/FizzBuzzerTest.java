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

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzerTest {

    private FizzBuzzer fizzBuzzer;

    @Before
    public void initializeFizzBuzzer() {
        fizzBuzzer = new FizzBuzzer();
    }
    
    @Test
    public void given_a_number_return_the_number_in_string() throws Exception {
        
        String parseResult = fizzBuzzer.parse(1);
        
        assertThat(parseResult, is("1"));
    }
    
    @Test
    public void if_number_contains_3_return_fizz() throws Exception {
        
        String parseResult = fizzBuzzer.parse(13);
        
        assertThat(parseResult, is("Fizz"));
    }
    
    @Test
    public void if_number_is_multiple_3_return_fizz() throws Exception {
        
        String parseResult = fizzBuzzer.parse(9);
        
        assertThat(parseResult, is("Fizz"));
    }
    
    @Test
    public void if_number_contains_7_return_buzz() throws Exception {
        String parseResult = fizzBuzzer.parse(17);
        
        assertThat(parseResult, is("Buzz"));
    }
    
    @Test
    public void if_number_is_multiple_7_return_Buzz() throws Exception {
        String parseResult = fizzBuzzer.parse(14);
        
        assertThat(parseResult, is("Buzz"));
    }
    
    @Test
    public void if_number_is_fizz_and_buzz_return_FizzBuzz() throws Exception {
       String parseResult =fizzBuzzer.parse(21) ;
       assertThat(parseResult, is("FizzBuzz")) ;
    }
    
}
