import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ic")
public class class208 implements class29 {
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 47789021
   )
   static int field2302;
   @ObfuscatedName("dv")
   @ObfuscatedSignature(
      descriptor = "Lsp;"
   )
   @Export("worldSelectRightSprite")
   static IndexedSprite worldSelectRightSprite;
   @ObfuscatedName("aj")
   char[] field2294 = new char[128];
   @ObfuscatedName("al")
   int[] field2289 = new int[128];
   @ObfuscatedName("ac")
   public int[] field2290 = new int[128];
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -1803814189
   )
   public int field2291 = 0;
   @ObfuscatedName("an")
   int[] field2292 = new int[128];
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 1954390381
   )
   int field2293 = 0;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 1978062081
   )
   int field2301 = 0;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 2008006209
   )
   int field2295 = 0;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 1869743345
   )
   int field2296 = 0;
   @ObfuscatedName("ar")
   boolean[] field2297 = new boolean[112];
   @ObfuscatedName("ak")
   boolean[] field2298 = new boolean[112];
   @ObfuscatedName("ax")
   boolean[] field2288 = new boolean[112];
   @ObfuscatedName("as")
   public char field2300;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = -1814811621
   )
   public int field2299;

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "1308084386"
   )
   public boolean vmethod4075(int var1) {
      this.method4078(var1);
      this.field2297[var1] = true;
      this.field2298[var1] = true;
      this.field2288[var1] = false;
      this.field2290[++this.field2291 - 1] = var1;
      return true;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "1404887619"
   )
   public boolean vmethod4086(int var1) {
      this.field2297[var1] = false;
      this.field2298[var1] = false;
      this.field2288[var1] = true;
      this.field2292[++this.field2293 - 1] = var1;
      return true;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(CI)Z",
      garbageValue = "-870523457"
   )
   public boolean vmethod4077(char var1) {
      int var2 = this.field2295 + 1 & 127;
      if (var2 != this.field2301) {
         this.field2289[this.field2295] = -1;
         this.field2294[this.field2295] = var1;
         this.field2295 = var2;
      }

      return false;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(ZB)Z",
      garbageValue = "104"
   )
   public boolean vmethod4100(boolean var1) {
      return false;
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "939129373"
   )
   void method4078(int var1) {
      int var2 = this.field2295 + 1 & 127;
      if (var2 != this.field2301) {
         this.field2289[this.field2295] = var1;
         this.field2294[this.field2295] = 0;
         this.field2295 = var2;
      }

   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1250890967"
   )
   public void method4085() {
      this.field2301 = this.field2296;
      this.field2296 = this.field2295;
      this.field2291 = 0;
      this.field2293 = 0;
      Arrays.fill(this.field2298, false);
      Arrays.fill(this.field2288, false);
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "516855165"
   )
   public final boolean method4081() {
      if (this.field2301 == this.field2296) {
         return false;
      } else {
         this.field2299 = this.field2289[this.field2301];
         this.field2300 = this.field2294[this.field2301];
         this.field2301 = this.field2301 + 1 & 127;
         return true;
      }
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "126"
   )
   public boolean method4082(int var1) {
      return var1 >= 0 && var1 < 112 ? this.field2298[var1] : false;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "1148875783"
   )
   public boolean method4074(int var1) {
      return var1 >= 0 && var1 < 112 ? this.field2297[var1] : false;
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-1144678086"
   )
   public boolean method4079(int var1) {
      return var1 >= 0 && var1 < 112 ? this.field2288[var1] : false;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)[I",
      garbageValue = "1721523722"
   )
   public int[] method4109() {
      int[] var1 = new int[this.field2291];

      for(int var2 = 0; var2 < this.field2291; ++var2) {
         var1[var2] = this.field2290[var2];
      }

      return var1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(B)[I",
      garbageValue = "107"
   )
   public int[] method4088() {
      int[] var1 = new int[this.field2293];

      for(int var2 = 0; var2 < this.field2293; ++var2) {
         var1[var2] = this.field2292[var2];
      }

      return var1;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)[Lkz;",
      garbageValue = "845145141"
   )
   public static class283[] method4111() {
      return new class283[]{class283.field3158, class283.field3157, class283.field3156, class283.field3159, class283.field3155, class283.field3154, class283.field3160, class283.field3161, class283.field3162, class283.field3163, class283.field3164};
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(B)[Led;",
      garbageValue = "-73"
   )
   static class129[] method4080() {
      return new class129[]{class129.field1557, class129.field1536, class129.field1539, class129.field1538, class129.field1550, class129.field1540, class129.field1541, class129.field1542, class129.field1543, class129.field1544, class129.field1545, class129.field1546, class129.field1547, class129.field1548, class129.field1549, class129.field1535, class129.field1551};
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(IB)Lct;",
      garbageValue = "-2"
   )
   @Export("Messages_getMessage")
   static Message Messages_getMessage(int var0) {
      return (Message)Messages.Messages_hashTable.get((long)var0);
   }
}
