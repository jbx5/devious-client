import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rt")
@Implements("PlatformInfo")
public class PlatformInfo extends Node {
   @ObfuscatedName("bl")
   @ObfuscatedGetter(
      intValue = 866420121
   )
   @Export("os")
   int os;
   @ObfuscatedName("bk")
   @Export("field4518")
   boolean field4518;
   @ObfuscatedName("br")
   @ObfuscatedGetter(
      intValue = -988253511
   )
   @Export("osVersion")
   int osVersion;
   @ObfuscatedName("ba")
   @ObfuscatedGetter(
      intValue = 1200698943
   )
   @Export("vendor")
   int vendor;
   @ObfuscatedName("bz")
   @ObfuscatedGetter(
      intValue = 2129153279
   )
   @Export("javaMajor")
   int javaMajor;
   @ObfuscatedName("bq")
   @ObfuscatedGetter(
      intValue = 2112872127
   )
   @Export("javaMinor")
   int javaMinor;
   @ObfuscatedName("bc")
   @ObfuscatedGetter(
      intValue = -1861897227
   )
   @Export("javaPatch")
   int javaPatch;
   @ObfuscatedName("bt")
   @Export("field4524")
   boolean field4524;
   @ObfuscatedName("be")
   @ObfuscatedGetter(
      intValue = -1076112561
   )
   @Export("maxMemory")
   int maxMemory;
   @ObfuscatedName("bu")
   @ObfuscatedGetter(
      intValue = 648519259
   )
   @Export("cpuCores")
   int cpuCores;
   @ObfuscatedName("by")
   @ObfuscatedGetter(
      intValue = -1963553311
   )
   @Export("field4527")
   int field4527;
   @ObfuscatedName("bp")
   @ObfuscatedGetter(
      intValue = 1789047105
   )
   @Export("clockSpeed")
   int clockSpeed;
   @ObfuscatedName("bb")
   @Export("field4536")
   String field4536;
   @ObfuscatedName("bx")
   @Export("field4514")
   String field4514;
   @ObfuscatedName("bn")
   @Export("field4528")
   String field4528;
   @ObfuscatedName("bj")
   @Export("field4532")
   String field4532;
   @ObfuscatedName("bf")
   @ObfuscatedGetter(
      intValue = -1550142989
   )
   @Export("field4512")
   int field4512;
   @ObfuscatedName("bw")
   @ObfuscatedGetter(
      intValue = 1918720287
   )
   @Export("field4534")
   int field4534;
   @ObfuscatedName("bi")
   @ObfuscatedGetter(
      intValue = 451790491
   )
   @Export("field4535")
   int field4535;
   @ObfuscatedName("cl")
   @ObfuscatedGetter(
      intValue = -511758947
   )
   @Export("field4530")
   int field4530;
   @ObfuscatedName("ca")
   @Export("field4537")
   String field4537;
   @ObfuscatedName("cb")
   @Export("field4538")
   String field4538;
   @ObfuscatedName("co")
   @Export("field4539")
   int[] field4539 = new int[3];
   @ObfuscatedName("cj")
   @ObfuscatedGetter(
      intValue = -777505601
   )
   @Export("field4540")
   int field4540;
   @ObfuscatedName("cn")
   @Export("field4541")
   String field4541;
   @ObfuscatedName("ce")
   @Export("field4542")
   String field4542;

   PlatformInfo(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25, String var26) {
      this.os = var1;
      this.field4518 = var2;
      this.osVersion = var3;
      this.vendor = var4;
      this.javaMajor = var5;
      this.javaMinor = var6;
      this.javaPatch = var7;
      this.field4524 = var8;
      this.maxMemory = var9;
      this.cpuCores = var10;
      this.field4527 = var11;
      this.clockSpeed = var12;
      this.field4536 = var13;
      this.field4514 = var14;
      this.field4528 = var15;
      this.field4532 = var16;
      this.field4512 = var17;
      this.field4534 = var18;
      this.field4535 = var19;
      this.field4530 = var20;
      this.field4537 = var21;
      this.field4538 = var22;
      this.field4539 = var23;
      this.field4540 = var24;
      this.field4541 = var25;
      this.field4542 = var26;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Lsy;I)V",
      garbageValue = "202560901"
   )
   @Export("write")
   public void write(Buffer var1) {
      var1.writeByte(9);
      var1.writeByte(this.os);
      var1.writeByte(this.field4518 ? 1 : 0);
      var1.writeShort(this.osVersion);
      var1.writeByte(this.vendor);
      var1.writeByte(this.javaMajor);
      var1.writeByte(this.javaMinor);
      var1.writeByte(this.javaPatch);
      var1.writeByte(this.field4524 ? 1 : 0);
      var1.writeShort(this.maxMemory);
      var1.writeByte(this.cpuCores);
      var1.writeMedium(this.field4527);
      var1.writeShort(this.clockSpeed);
      var1.writeStringCp1252NullCircumfixed(this.field4536);
      var1.writeStringCp1252NullCircumfixed(this.field4514);
      var1.writeStringCp1252NullCircumfixed(this.field4528);
      var1.writeStringCp1252NullCircumfixed(this.field4532);
      var1.writeByte(this.field4534);
      var1.writeShort(this.field4512);
      var1.writeStringCp1252NullCircumfixed(this.field4537);
      var1.writeStringCp1252NullCircumfixed(this.field4538);
      var1.writeByte(this.field4535);
      var1.writeByte(this.field4530);

      for(int var2 = 0; var2 < this.field4539.length; ++var2) {
         var1.writeInt(this.field4539[var2]);
      }

      var1.writeInt(this.field4540);
      var1.writeStringCp1252NullCircumfixed(this.field4541);
      var1.writeStringCp1252NullCircumfixed(this.field4542);
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "228584167"
   )
   @Export("size")
   public int size() {
      int var1 = 39;
      var1 += class19.method282(this.field4536);
      var1 += class19.method282(this.field4514);
      var1 += class19.method282(this.field4528);
      var1 += class19.method282(this.field4532);
      var1 += class19.method282(this.field4537);
      var1 += class19.method282(this.field4538);
      var1 += class19.method282(this.field4541);
      var1 += class19.method282(this.field4542);
      return var1;
   }
}
