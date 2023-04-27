import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cp")
@Implements("ChatChannel")
public class ChatChannel {
   @ObfuscatedName("cz")
   @ObfuscatedGetter(
      intValue = 1381277089
   )
   static int field992;
   @ObfuscatedName("jb")
   @ObfuscatedSignature(
      descriptor = "Ltq;"
   )
   @Export("compass")
   static SpritePixels compass;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "[Lcq;"
   )
   @Export("messages")
   Message[] messages = new Message[100];
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -1742939983
   )
   @Export("count")
   int count;

   ChatChannel() {
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;S)Lcq;",
      garbageValue = "-22035"
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

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(II)Lcq;",
      garbageValue = "-2100835042"
   )
   @Export("getMessage")
   Message getMessage(int var1) {
      return var1 >= 0 && var1 < this.count ? this.messages[var1] : null;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1727774568"
   )
   @Export("size")
   int size() {
      return this.count;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lsg;Lro;B)Lro;",
      garbageValue = "-78"
   )
   @Export("readStringIntParameters")
   static final IterableNodeHashTable readStringIntParameters(Buffer var0, IterableNodeHashTable var1) {
      int var2 = var0.readUnsignedByte();
      int var3;
      if (var1 == null) {
         var3 = class70.method2044(var2);
         var1 = new IterableNodeHashTable(var3);
      }

      for(var3 = 0; var3 < var2; ++var3) {
         boolean var4 = var0.readUnsignedByte() == 1;
         int var5 = var0.readMedium();
         Object var6;
         if (var4) {
            var6 = new ObjectNode(var0.readStringCp1252NullTerminated());
         } else {
            var6 = new IntegerNode(var0.readInt());
         }

         var1.put((Node)var6, (long)var5);
      }

      return var1;
   }

   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      descriptor = "(Lmq;III)V",
      garbageValue = "-2141558177"
   )
   public static void method2156(Widget var0, int var1, int var2) {
      var0.field3584.bodyColors[var1] = var2;
      var0.field3584.method6068();
   }
}
