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

public class FizzBuzzer {

    private static final int FIZZ_NUMBER = 3;

    public String parse(int number) {
        if (isFizz(number)) {
            return "Fizz";
        } else if (contains(number, 7) || number % 7 == 0) {
            return "Buzz";
        }
        return String.valueOf(number);
    }

    private boolean contains(int number, Integer content) {
        return String.valueOf(number).contains(content.toString());
    }

    private boolean isFizz(int number) {
        return contains(number, FIZZ_NUMBER) || number % FIZZ_NUMBER == 0;
    }

}
