package com.tradition.repository.impl;

import com.tradition.repository.Strategy;

/**
 * <p>Description : design-pattern-module
 * <p>Date : 2017/10/17 15:21
 * <p>@author : Matrix [xhyrzldf@foxmail.com]
 */
public class Mul implements Strategy {

    @Override
    public int calclate(int x, int y) {
        return x * y;
    }
}
