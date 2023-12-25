# Advanced Programming
## Assignment 3
* Made by Tushar Chandra - 2021211



## Part A
>Terminal Commands to run the code via **maven**

```bash
    //navigate to the root directory of the project
    mvc clean install
    java -cp target/Assignment3-1.0-SNAPSHOT.jar org.example.PartA.partA
```

- I tried multithreading both the ways, one by using multiple threads of the same arrays and another by using multiple threads of same array but different sizes.
- for example: 
```java
    multiProcess1 mp1 = new multiProcess1(arr1, 0, arr1.length);
    multiProcess2 mp2 = new multiProcess2(arr1, 0, arr1.length);
    multiProcess3 mp3 = new multiProcess3(arr1, 0, arr1.length);

    // or

    multiProcess1 mp1 = new multiProcess1(arr1, 0, arr1.length/2);
    multiProcess2 mp2 = new multiProcess2(arr1, arr1.length/2, arr1.length);
```

- I tried both the ways, but in the final code I am implementing the one with multiple threads of same array with same sizes.
- I have shown both the absolute and average values of the 3 threads that I have created.

Thank you, It was a great learning experience.