package com.demo.factory.abstractFactory;

/**
 * Created by lshuang on 2020/12/8.
 *
 * 这里其实也可以用 interface
 * 用 abstract 主要是一个语义的问题，“食品” 是一个现实世界中存在的，
 * 但又不是具体的某一个事物，他是抽象的
 * [形容词用接口，名词用抽象类]
 */
public abstract class AbstractFood {

    abstract void foodName();
}
