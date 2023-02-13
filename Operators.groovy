package com.groovy

//Operators are symbols that tell the compiler to perform some specific operation



//Arithmetic
//https://groovy-lang.org/operators.html#_arithmetic_operators

assert  1  + 2 == 3
assert  4  - 3 == 1
assert  3  * 5 == 15
assert  3  / 2 == 1.5
assert 10  % 3 == 1
assert  2 ** 3 == 8



//The + and - operators are also available as unary operators:

assert +3 == 3
assert -4 == 0 - 4

assert -(-1) == 1

//In terms of unary arithmetics operators, the ++ (increment) and -- (decrement) operators are available, both in prefix and postfix notation:


def a = 2
def b = a++ * 3

assert a == 3 && b == 6

def c = 3
def d = c-- * 2

assert c == 2 && d == 6

def e = 1
def f = ++e + 3

assert e == 2 && f == 5

def g = 4
def h = --g + 1

assert g == 3 && h == 4
println 'kumar'
/*
 	The postfix increment will increment a after the expression has been evaluated and assigned into b
	The postfix decrement will decrement c after the expression has been evaluated and assigned into d
	The prefix increment will increment e before the expression is evaluated and assigned into f
	The prefix decrement will decrement g before the expression is evaluated and assigned into h
 */
