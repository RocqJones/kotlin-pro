package my.program

//TODO: Creates 3 types of array.

// 1. Array<Int> of size 3 containing [1, 2, 3].
val a =  arrayOf(1,2,3)

// 2. Create an array using a closure: Creates an Array<Int> of size 3 containing [0, 2, 4]
val b = Array(3) {i -> i * 2}

// 3. Create an uninitialized array: Creates an Array<Int?> of [null, null, null]
val c = arrayOfNulls<Int>(3)