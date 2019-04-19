/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Jessy
 */
public interface Stack {

    /**
     * Tests if this stack is empty.
     */
    public abstract boolean isEmpty();

    /**
     * Pushes an item onto the top of this stack.
     *
     * if Stack is full return an error message
     *
     * @param item
     */
    public abstract void push(String item);

    /**
     * Removes the object at the top of this stack and returns that object as
     * the value of this function.
     *
     * if Stack is empty return an error message
     *
     * @throws Exception
     */
    public abstract String pop() throws Exception;
}
