/*Copyright 2018 Principal Software Engineers

        Permission is hereby granted, free of charge, to any person obtaining a copy of this software
        and associated documentation files (the "Software"), to deal in the Software without restriction,
        including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense,
         and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so,
         subject to the following conditions:

        The above copyright notice and this permission notice shall be included in all copies or substantial
         portions of the Software.


        THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT
        LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
        IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
        WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE
         OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.*/


package com.PrincipalSE.SpinTheWheel;


import java.util.ArrayList;
/** First version of a game. Game accepts user input for number of coins,
 *  number of spins, and number of coins to be revealed. Also this version
 *  of the game checks for invalid inputs, and initializes so the game is
 *  ready to play.
 @version
 Fall 2018 v0.7
 @author
 Egor Muscat, Travis Rebhan, Justin Wu, Emenu Dobamo.
 */
@SuppressWarnings("serial")
public class CircularList<E> extends ArrayList<E> {
    public CircularList(int initialCapacity) {
        super(initialCapacity);
    }

    @Override
    public E set(int index, E element) {
        return super.set(index % size() , element);
    }

    @Override
    public E get(int index) {
        return super.get(index % size());
    }
}
