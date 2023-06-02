import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gl")
public class class177 extends class180 {
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = 556092711
   )
   static int field1853;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Ltj;"
   )
   @Export("options_buttons_2Sprite")
   static IndexedSprite options_buttons_2Sprite;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 753588277
   )
   int field1854;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lgi;"
   )
   final class169 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lgi;Ljava/lang/String;I)V"
   )
   class177(class169 var1, String var2, int var3) {
      super(var1, var2);
      this.this$0 = var1;
      this.field1854 = var3;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1756234342"
   )
   public int vmethod3531() {
      return 0;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "16858419"
   )
   public int vmethod3536() {
      return this.field1854;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(II)Lnt;",
      garbageValue = "1150408327"
   )
   public static GameBuild method3517(int var0) {
      GameBuild[] var1 = class280.method5602();

      for(int var2 = 0; var2 < var1.length; ++var2) {
         GameBuild var3 = var1[var2];
         if (var0 == var3.buildId) {
            return var3;
         }
      }

      return null;
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(IS)Lfa;",
      garbageValue = "1200"
   )
   static class131 method3518(int var0) {
      class131 var1 = (class131)GameObject.findEnumerated(Widget.method6508(), var0);
      if (var1 == null) {
         var1 = class131.field1554;
      }

      return var1;
   }
}
