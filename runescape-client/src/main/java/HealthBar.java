import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cm")
@Implements("HealthBar")
public class HealthBar extends Node {
   @ObfuscatedName("so")
   @ObfuscatedSignature(
      descriptor = "Lab;"
   )
   @Export("pcmPlayer0")
   static PcmPlayer pcmPlayer0;
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "Lri;"
   )
   @Export("rightTitleSprite")
   static SpritePixels rightTitleSprite;
   @ObfuscatedName("in")
   @ObfuscatedSignature(
      descriptor = "[Lry;"
   )
   @Export("mapSceneSprites")
   static IndexedSprite[] mapSceneSprites;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lfb;"
   )
   @Export("definition")
   HealthBarDefinition definition;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Lml;"
   )
   @Export("updates")
   IterableNodeDeque updates = new IterableNodeDeque();

   @ObfuscatedSignature(
      descriptor = "(Lfb;)V"
   )
   HealthBar(HealthBarDefinition var1) {
      this.definition = var1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(IIIII)V",
      garbageValue = "721207742"
   )
   @Export("put")
   void put(int var1, int var2, int var3, int var4) {
      HealthBarUpdate var5 = null;
      int var6 = 0;

      for(HealthBarUpdate var7 = (HealthBarUpdate)this.updates.last(); var7 != null; var7 = (HealthBarUpdate)this.updates.previous()) {
         ++var6;
         if (var7.cycle == var1) {
            var7.set(var1, var2, var3, var4);
            return;
         }

         if (var7.cycle <= var1) {
            var5 = var7;
         }
      }

      if (var5 == null) {
         if (var6 < 4) {
            this.updates.addLast(new HealthBarUpdate(var1, var2, var3, var4));
         }

      } else {
         IterableNodeDeque.IterableNodeDeque_addBefore(new HealthBarUpdate(var1, var2, var3, var4), var5);
         if (var6 >= 4) {
            this.updates.last().remove();
         }

      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(II)Lcu;",
      garbageValue = "1855238939"
   )
   @Export("get")
   HealthBarUpdate get(int var1) {
      HealthBarUpdate var2 = (HealthBarUpdate)this.updates.last();
      if (var2 != null && var2.cycle <= var1) {
         for(HealthBarUpdate var3 = (HealthBarUpdate)this.updates.previous(); var3 != null && var3.cycle <= var1; var3 = (HealthBarUpdate)this.updates.previous()) {
            var2.remove();
            var2 = var3;
         }

         if (this.definition.int5 + var2.cycle + var2.cycleOffset > var1) {
            return var2;
         } else {
            var2.remove();
            return null;
         }
      } else {
         return null;
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-608099850"
   )
   @Export("isEmpty")
   boolean isEmpty() {
      return this.updates.method6721();
   }

   @ObfuscatedName("lf")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1576682931"
   )
   static final void method2478() {
      for(int var0 = 0; var0 < Players.Players_count; ++var0) {
         Player var1 = Client.players[Players.Players_indices[var0]];
         var1.clearIsInFriendsChat();
      }

   }
}
