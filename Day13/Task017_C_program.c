// #include <stdio.h>

int main() {
    int a=10;
    int *p=&a; // Pointer to integer a

    printf("Value of a: %d\n", a); // Print value of a
    printf("Address of a: %p\n", (void*)&a); // Print address
    printf("Value of p: %p\n", (void*)p); // Print value of pointer p
    printf("Value pointed to by p: %d\n", *p); // Print value
    
}