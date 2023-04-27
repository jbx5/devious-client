import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oa")
public class class383 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Loq;"
   )
   class379 field4457;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -816892485
   )
   int field4454 = 0;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 987221129
   )
   int field4455 = 0;

   @ObfuscatedSignature(
      descriptor = "(Loq;II)V"
   )
   class383(class379 var1, int var2, int var3) {
      this.field4457 = var1;
      this.field4454 = var2;
      this.field4455 = var3;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "-48485402"
   )
   public String method7522() {
      if (this.method7513()) {
         return "";
      } else {
         StringBuilder var1 = new StringBuilder(this.method7514());

         for(int var2 = this.field4454; var2 < this.field4455; ++var2) {
            class381 var3 = this.field4457.method7260(var2);
            var1.append(var3.field4428);
         }

         return var1.toString();
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "1783943189"
   )
   boolean method7516(int var1) {
      return this.field4457.method7291() == 2 || this.field4457.method7291() == 1 && (!this.field4457.field4415 || this.field4455 - 1 != var1);
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "791000990"
   )
   public boolean method7513() {
      return this.field4455 == this.field4454;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "87"
   )
   public int method7514() {
      return this.field4455 - this.field4454;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(Lom;I)Z",
      garbageValue = "-2138550127"
   )
   boolean method7521(class381 var1) {
      if (this.field4457.field4419 == 2) {
         return true;
      } else if (this.field4457.field4419 == 0) {
         return false;
      } else {
         return this.field4457.method7290() != var1;
      }
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-2139094912"
   )
   int method7524() {
      if (this.method7513()) {
         return 0;
      } else {
         class381 var1 = this.field4457.method7260(this.field4455 - 1);
         if (var1.field4428 == '\n') {
            return 0;
         } else if (this.method7521(var1)) {
            return this.field4457.field4409.advances[42];
         } else {
            int var2 = this.field4457.field4409.advances[var1.field4428];
            if (var2 == 0) {
               return var1.field4428 == '\t' ? this.field4457.field4409.advances[32] * 3 : this.field4457.field4409.advances[32];
            } else {
               return var2;
            }
         }
      }
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(B)Lrg;",
      garbageValue = "5"
   )
   public class461 method7512() {
      if (this.method7513()) {
         return new class461(0, 0);
      } else {
         class381 var1 = this.field4457.method7260(this.field4455 - 1);
         return new class461(var1.field4427 + this.method7524(), var1.field4430);
      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(II)Lom;",
      garbageValue = "-1037292745"
   )
   public class381 method7515(int var1) {
      return var1 >= 0 && var1 < this.method7514() ? this.field4457.method7260(this.field4454 + var1) : null;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(II)Ljava/lang/String;",
      garbageValue = "-1607388222"
   )
   @Export("colorStartTag")
   static String colorStartTag(int var0) {
      return "<col=" + Integer.toHexString(var0) + ">";
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1054245173"
   )
   public static void method7542() {
      DbTableType.DBTableType_cache.clear();
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(IIB)I",
      garbageValue = "119"
   )
   static final int method7540(int var0, int var1) {
      int var2 = Actor.method2398(var0 - 1, var1 - 1) + Actor.method2398(1 + var0, var1 - 1) + Actor.method2398(var0 - 1, var1 + 1) + Actor.method2398(1 + var0, 1 + var1);
      int var3 = Actor.method2398(var0 - 1, var1) + Actor.method2398(var0 + 1, var1) + Actor.method2398(var0, var1 - 1) + Actor.method2398(var0, var1 + 1);
      int var4 = Actor.method2398(var0, var1);
      return var2 / 16 + var3 / 8 + var4 / 4;
   }

   @ObfuscatedName("nj")
   @ObfuscatedSignature(
      descriptor = "(Lsg;B)V",
      garbageValue = "23"
   )
   static void method7541(Buffer var0) {
      if (Client.randomDatData != null) {
         var0.writeBytes(Client.randomDatData, 0, Client.randomDatData.length);
      } else {
         byte[] var2 = new byte[24];

         try {
            JagexCache.JagexCache_randomDat.seek(0L);
            JagexCache.JagexCache_randomDat.readFully(var2);

            int var3;
            for(var3 = 0; var3 < 24 && var2[var3] == 0; ++var3) {
            }

            if (var3 >= 24) {
               throw new IOException();
            }
         } catch (Exception var6) {
            for(int var4 = 0; var4 < 24; ++var4) {
               var2[var4] = -1;
            }
         }

         var0.writeBytes(var2, 0, var2.length);
      }
   }
}
