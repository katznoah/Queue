#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <sys/types.h>
#include <unistd.h>

int main(void){
    while(1){
        system("sh run.sh");
        sleep(1);
    }
    return 0;
}
