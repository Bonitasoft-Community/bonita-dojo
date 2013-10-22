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

public class FizzBuzzGame {

    private FizzBuzzer fizzBuzzer;

    public FizzBuzzGame(FizzBuzzer fizzBuzzer) {
        this.fizzBuzzer = fizzBuzzer;
    }

    public String playUntil(int lastNumber) {
        StringBuilder gameResult = new StringBuilder();
        gameResult.append(fizzBuzzer.parse(1));
        for (int i = 2; i <= lastNumber; i++) {
            gameResult.append(" ");
            gameResult.append(fizzBuzzer.parse(i));
        }
        return gameResult.toString();
    }

}
