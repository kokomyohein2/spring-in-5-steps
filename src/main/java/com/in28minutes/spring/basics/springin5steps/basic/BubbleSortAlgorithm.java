/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.in28minutes.spring.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 *
 * @author komyo
 */
@Component
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm{

    public int[] sort(int[] numbers) {

        return numbers;
    }
}
