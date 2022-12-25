#include <iostream>

#include "varint.h"
#include "ringfile_internal.h"
#include "command.h"

int main(int argc, char* argv[])
{
    Command command;
    return command.Main(argc, argv);
}

