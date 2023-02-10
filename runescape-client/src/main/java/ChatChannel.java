import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bx")
@Implements("ChatChannel")
public class ChatChannel {
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "Lrg;"
   )
   static IndexedSprite field1005;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "[Lbq;"
   )
   @Export("messages")
   Message[] messages = new Message[100];
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 1540858731
   )
   @Export("count")
   int count;

   ChatChannel() {
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbq;",
      garbageValue = "-1653728872"
   )
   @Export("addMessage")
   Message addMessage(int var1, String var2, String var3, String var4) {
      Message var5 = this.messages[99];

      for(int var6 = this.count; var6 > 0; --var6) {
         if (var6 != 100) {
            this.messages[var6] = this.messages[var6 - 1];
         }
      }

      if (var5 == null) {
         var5 = new Message(var1, var2, var4, var3);
      } else {
         var5.remove();
         var5.removeDual();
         var5.set(var1, var2, var4, var3);
      }

      this.messages[0] = var5;
      if (this.count < 100) {
         ++this.count;
      }

      return var5;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(II)Lbq;",
      garbageValue = "1684263002"
   )
   @Export("getMessage")
   Message getMessage(int var1) {
      return var1 >= 0 && var1 < this.count ? this.messages[var1] : null;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-61"
   )
   @Export("size")
   int size() {
      return this.count;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(IB)Lgb;",
      garbageValue = "45"
   )
   public static HitSplatDefinition method2224(int var0) {
      HitSplatDefinition var1 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = class498.HitSplatDefinition_archive.takeFile(32, var0);
         var1 = new HitSplatDefinition();
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         HitSplatDefinition.HitSplatDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "30"
   )
   static final void method2213() {
      Decimator.method1115("You can't add yourself to your own ignore list");
   }
}
