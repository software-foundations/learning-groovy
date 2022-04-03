// Arithmetic Operartors | Arithmetic Operators
assert  1  + 2 == 3
assert  4  - 3 == 1
assert  3  * 5 == 15
assert  3  / 2 == 1.5
assert 10  % 3 == 1
assert  2 ** 3 == 8

// Arithmetic Operartors | Unary Operators
assert +3 == 3
assert -4 == 4 - 8 
assert -(-1) == 1

// Arithmetic Operartors | Unary Operators | ++ and -- | prefix vs postfix

// The postfix increment will increment a
// after the expression has been evaluated and assigned into b
def a = 2
def b = a++ * 3

assert a == 3 && b == 6

def c = 3
def d = c-- * 2

assert c == 2 && d == 6

// The prefix increment will increment e
// before the expression is evaluated and assigned into f
def e = 1
def f = ++e + 3

assert e == 2 && f == 5

def g = 4
def h = --g + 1

assert g == 3 && h == 4