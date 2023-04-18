import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("av")
public class class16 implements ThreadFactory {
   @ObfuscatedName("uq")
   @ObfuscatedGetter(
      intValue = -887836823
   )
   static int field90;
   @ObfuscatedName("dl")
   @ObfuscatedSignature(
      descriptor = "[Ltc;"
   )
   @Export("worldSelectFlagSprites")
   static IndexedSprite[] worldSelectFlagSprites;
   @ObfuscatedName("af")
   final ThreadGroup field84;
   @ObfuscatedName("an")
   final AtomicInteger field85;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lag;"
   )
   final class14 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lag;)V"
   )
   class16(class14 var1) {
      this.this$0 = var1;
      this.field85 = new AtomicInteger(1);
      SecurityManager var2 = System.getSecurityManager();
      this.field84 = var2 != null ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup();
   }

   public Thread newThread(Runnable var1) {
      Thread var2 = new Thread(this.field84, var1, this.this$0.field76 + "-rest-request-" + this.field85.getAndIncrement(), 0L);
      var2.setDaemon(true);
      var2.setPriority(5);
      return var2;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lnx;I)I",
      garbageValue = "1629498841"
   )
   @Export("compareStrings")
   public static int compareStrings(CharSequence var0, CharSequence var1, Language var2) {
      int var3 = var0.length();
      int var4 = var1.length();
      int var5 = 0;
      int var6 = 0;
      byte var7 = 0;
      byte var8 = 0;

      int var9;
      int var10;
      int var11;
      char var12;
      while(var5 - var7 < var3 || var6 - var8 < var4) {
         if (var5 - var7 >= var3) {
            return -1;
         }

         if (var6 - var8 >= var4) {
            return 1;
         }

         if (var7 != 0) {
            var9 = var7;
            boolean var14 = false;
         } else {
            var9 = var0.charAt(var5++);
         }

         if (var8 != 0) {
            var10 = var8;
            boolean var15 = false;
         } else {
            var10 = var1.charAt(var6++);
         }

         if (var9 == 198) {
            var11 = 69;
         } else if (var9 == 230) {
            var11 = 101;
         } else if (var9 == 223) {
            var11 = 115;
         } else if (var9 == 338) {
            var11 = 69;
         } else if (var9 == 339) {
            var11 = 101;
         } else {
            var11 = 0;
         }

         var7 = (byte)var11;
         if (var10 == 198) {
            var12 = 'E';
         } else if (var10 == 230) {
            var12 = 'e';
         } else if (var10 == 223) {
            var12 = 's';
         } else if (var10 == 338) {
            var12 = 'E';
         } else if (var10 == 339) {
            var12 = 'e';
         } else {
            var12 = 0;
         }

         var8 = (byte)var12;
         var9 = AbstractArchive.standardizeChar((char)var9, var2);
         var10 = AbstractArchive.standardizeChar((char)var10, var2);
         if (var9 != var10 && Character.toUpperCase((char)var9) != Character.toUpperCase((char)var10)) {
            var9 = Character.toLowerCase((char)var9);
            var10 = Character.toLowerCase((char)var10);
            if (var9 != var10) {
               return Archive.lowercaseChar((char)var9, var2) - Archive.lowercaseChar((char)var10, var2);
            }
         }
      }

      var9 = Math.min(var3, var4);

      for(var10 = 0; var10 < var9; ++var10) {
         if (var2 == Language.Language_FR) {
            var5 = var3 - 1 - var10;
            var6 = var4 - 1 - var10;
         } else {
            var6 = var10;
            var5 = var10;
         }

         var11 = var0.charAt(var5);
         var12 = var1.charAt(var6);
         if (var11 != var12 && Character.toUpperCase((char)var11) != Character.toUpperCase(var12)) {
            var11 = Character.toLowerCase((char)var11);
            var12 = Character.toLowerCase(var12);
            if (var12 != var11) {
               return Archive.lowercaseChar((char)var11, var2) - Archive.lowercaseChar(var12, var2);
            }
         }
      }

      var10 = var3 - var4;
      if (var10 != 0) {
         return var10;
      } else {
         for(var11 = 0; var11 < var9; ++var11) {
            var12 = var0.charAt(var11);
            char var13 = var1.charAt(var11);
            if (var13 != var12) {
               return Archive.lowercaseChar(var12, var2) - Archive.lowercaseChar(var13, var2);
            }
         }

         return 0;
      }
   }

   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      descriptor = "(ILch;ZI)I",
      garbageValue = "-2103319484"
   )
   static int method215(int var0, Script var1, boolean var2) {
      return 2;
   }
}
