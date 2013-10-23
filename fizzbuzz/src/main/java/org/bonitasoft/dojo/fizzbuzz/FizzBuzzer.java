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

    private static final int BUZZ = 7 ;
    private static final int FIZZ = 3;

    public String parse(int number) {
        if (should(FIZZ, number)) {
            return "Fizz";
        } else if (should(BUZZ, number)) {
            return "Buzz";
        }
        return String.valueOf(number);
    }

    private boolean should(int specialNumber, int parsedNumber) {
        return contains(parsedNumber, specialNumber) || isDivisibleBy(parsedNumber, specialNumber);
    }

    private boolean contains(int number, Integer content) {
        return String.valueOf(number).contains(content.toString());
    }

    private boolean isDivisibleBy(int number, int diviser) {
        return number % diviser == 0;
    }

}
