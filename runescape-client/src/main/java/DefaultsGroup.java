import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pp")
@Implements("DefaultsGroup")
public class DefaultsGroup {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lpp;"
   )
   static final DefaultsGroup field4569 = new DefaultsGroup(3);
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 44179095
   )
   @Export("group")
   final int group;

   DefaultsGroup(int var1) {
      this.group = var1;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "141700645"
   )
   static void method7760() {
      Players.Players_count = 0;

      for(int var0 = 0; var0 < 2048; ++var0) {
         Players.field1335[var0] = null;
         Players.field1332[var0] = class211.field2332;
      }

   }
}
