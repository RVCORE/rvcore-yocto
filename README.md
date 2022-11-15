

### 1.download source code
```
   #At first make sure repo is working, then execute download_code.sh to pull down all opensource layer into current workdir.

   $ ./download_code.sh
```
### 2.build full image
```
   #prepare build environment

   $ source meta-rvcore/setup.sh

   #build full image

   $ MACHINE=qemuriscv64 bitbake rvcore-image-full-cmdline
```
### 3.run full image in qemu
```
   $ ../meta-rvcore/qemu_run_fullsystem.sh
```
### 4.compile and run spec06-lite in full image
```
   $ export PERL5LIB="/usr/lib/perl5/5.36.0/IO:/usr/lib/perl5/5.36.0/riscv64-linux"

   $ cpan HTTP/Request.pm

   #modify tools/util.pl

   $ git diff tools/util.pl
   diff --git a/tools/util.pl b/tools/util.pl
   index 215f65d..599c053 100644
   --- a/tools/util.pl
   +++ b/tools/util.pl
   @@ -221,6 +221,9 @@ sub copy_tree {
        return 1;
    }
 
   +use constant BZ_STREAM_END             => 4;
   +use constant BZ_OK                     => 0;
   +
    sub copy_bz2_file {
        my ($source, $destfile, $dirs, $verify, $sumhash) = @_;
        # Source file is compressed; dest file must be decompressed

   $ make -j 12 build-int
   $ make -j 12 run-int-ref

   $ make -j 12 build-fp
   $ make -j 12 run-fp-ref
```
### 5.build yinxing fpga image
```
   $ MACHINE=yinxing-fpga bitbake virtual/kernel

   the following ELF file will be put into bbl.
   build/tmp-glibc/deploy/images/yinxing-fpga/vmlinux-initramfs-yinxing-fpga.bin

   $ cd bbl-yinxing-fpga/riscv-pk
   $ make clean
   $ make -f Makefile.yocto.fpga
   $ cd ..
   $ ./yocto-fpga-build.sh
   $ deliver bbl-yinxing-fpga/build/linux.bin to fpga
```
### 6.run yinxing fpga image using yocto qemu
```
   $ cd meta-rvcore/
   $ ./qemu_run_fpga.sh
```
