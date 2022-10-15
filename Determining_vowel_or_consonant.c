#include <stdio.h>
int main(void)
{
 char ch;
 printf("Please enter a letter:");
 scanf("%c", &ch);
 int ascii = ch;
 if(ascii == 65 || ascii == 69 || ascii == 73 || ascii == 79 || ascii == 85)
 printf("Vowel");
 else if(ascii == 97 || ascii == 101 || ascii == 105 || ascii == 111 || ascii
== 117)
 printf("Vowel");
 else if((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122))
 printf("Consonant");
 else
 printf("Invalid input");
 return 0;
}
