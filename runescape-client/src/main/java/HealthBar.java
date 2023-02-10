import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cv")
@Implements("HealthBar")
public class HealthBar extends Node {
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lgi;"
   )
   @Export("definition")
   HealthBarDefinition definition;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Lmt;"
   )
   @Export("updates")
   IterableNodeDeque updates = new IterableNodeDeque();

   @ObfuscatedSignature(
      descriptor = "(Lgi;)V"
   )
   HealthBar(HealthBarDefinition var1) {
      this.definition = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(IIIII)V",
      garbageValue = "2137835977"
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

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(II)Lcz;",
      garbageValue = "1621839790"
   )
   @Export("get")
   HealthBarUpdate get(int var1) {
      HealthBarUpdate var2 = (HealthBarUpdate)this.updates.last();
      if (var2 != null && var2.cycle <= var1) {
         for(HealthBarUpdate var3 = (HealthBarUpdate)this.updates.previous(); var3 != null && var3.cycle <= var1; var3 = (HealthBarUpdate)this.updates.previous()) {
            var2.remove();
            var2 = var3;
         }

         if (this.definition.int5 + var2.cycleOffset + var2.cycle > var1) {
            return var2;
         } else {
            var2.remove();
            return null;
         }
      } else {
         return null;
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "776562128"
   )
   @Export("isEmpty")
   boolean isEmpty() {
      return this.updates.method6900();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(IIII)Z",
      garbageValue = "97534508"
   )
   static boolean method2611(int var0, int var1, int var2) {
      return var0 >= 0 && var0 < 4 && var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-1489961954"
   )
   public static boolean method2609(int var0) {
      return var0 == WorldMapDecorationType.field3765.id;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(Laj;I)V",
      garbageValue = "-644486874"
   )
   static void method2610(GameEngine var0) {
      class205 var1 = Client.field702;
      class205 var2 = var1;

      while(var2.method4141()) {
         if (var2.field2339 == 13) {
            class17.method270();
            return;
         }

         if (var2.field2339 == 96) {
            if (Login.worldSelectPage > 0 && StudioGame.worldSelectLeftSprite != null) {
               --Login.worldSelectPage;
            }
         } else if (var2.field2339 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && class205.worldSelectRightSprite != null) {
            ++Login.worldSelectPage;
         }
      }

      if (MouseHandler.MouseHandler_lastButton == 1 || !ClanMate.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
         int var3 = Login.xPadding + 280;
         if (MouseHandler.MouseHandler_lastPressedX >= var3 && MouseHandler.MouseHandler_lastPressedX <= var3 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
            class369.changeWorldSelectSorting(0, 0);
            return;
         }

         if (MouseHandler.MouseHandler_lastPressedX >= var3 + 15 && MouseHandler.MouseHandler_lastPressedX <= var3 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
            class369.changeWorldSelectSorting(0, 1);
            return;
         }

         int var4 = Login.xPadding + 390;
         if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
            class369.changeWorldSelectSorting(1, 0);
            return;
         }

         if (MouseHandler.MouseHandler_lastPressedX >= var4 + 15 && MouseHandler.MouseHandler_lastPressedX <= var4 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
            class369.changeWorldSelectSorting(1, 1);
            return;
         }

         int var5 = Login.xPadding + 500;
         if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var5 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
            class369.changeWorldSelectSorting(2, 0);
            return;
         }

         if (MouseHandler.MouseHandler_lastPressedX >= var5 + 15 && MouseHandler.MouseHandler_lastPressedX <= var5 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
            class369.changeWorldSelectSorting(2, 1);
            return;
         }

         int var6 = Login.xPadding + 610;
         if (MouseHandler.MouseHandler_lastPressedX >= var6 && MouseHandler.MouseHandler_lastPressedX <= var6 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
            class369.changeWorldSelectSorting(3, 0);
            return;
         }

         if (MouseHandler.MouseHandler_lastPressedX >= var6 + 15 && MouseHandler.MouseHandler_lastPressedX <= var6 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
            class369.changeWorldSelectSorting(3, 1);
            return;
         }

         if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) {
            class17.method270();
            return;
         }

         if (Login.hoveredWorldIndex != -1) {
            World var7 = class88.World_worlds[Login.hoveredWorldIndex];
            VarbitComposition.changeWorld(var7);
            class17.method270();
            return;
         }

         if (Login.worldSelectPage > 0 && StudioGame.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= StudioGame.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= class127.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class127.canvasHeight / 2 + 50) {
            --Login.worldSelectPage;
         }

         if (Login.worldSelectPage < Login.worldSelectPagesCount && class205.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= GameEngine.canvasWidth - class205.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= GameEngine.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= class127.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class127.canvasHeight / 2 + 50) {
            ++Login.worldSelectPage;
         }
      }

   }
}
