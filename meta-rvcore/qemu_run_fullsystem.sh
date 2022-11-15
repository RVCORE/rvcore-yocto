#!/bin/sh

MACHINE=qemuriscv64 runqemu nographic qemuparams="-smp 12 -m 16000"
