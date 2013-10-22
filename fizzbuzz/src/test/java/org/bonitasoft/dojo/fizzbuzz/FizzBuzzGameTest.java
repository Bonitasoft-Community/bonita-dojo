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

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

public class FizzBuzzGameTest {

    @Mock
    private FizzBuzzer fizzBuzzer;
    
    private FizzBuzzGame fizzBuzzGame;
    
    @Before
    public void initializeFizzBuzzGame() {
        initMocks(this);
        fizzBuzzGame = new FizzBuzzGame(fizzBuzzer);
    }
    
    @Test
    public void playUntil_call_fizzbuzzer_for_each_numbers_and_concatenate_results() throws Exception {
        when(fizzBuzzer.parse(1)).thenReturn("X");
        when(fizzBuzzer.parse(2)).thenReturn("XX");
        when(fizzBuzzer.parse(3)).thenReturn("XXX");
        
        String gameResult = fizzBuzzGame.playUntil(3);
        
        assertThat(gameResult, is("X XX XXX"));
    }
}
